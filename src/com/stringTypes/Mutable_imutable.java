package com.stringTypes;

public class Mutable_imutable {
     
	public static void main(String[] args, String Iname){
	
	System.out.println("---ImMutable---");
	String fname="Tamil";
 
	int address1=System.identityHashCode(fname);
	System.out.println(address1);
    int address2= System.identityHashCode(Iname);
	System.out.println (address2);
    
    
    String concat = Iname.concat(fname);
    System.out.println(concat);
    System.out.println(System.identityHashCode(concat));
    
    
    System.out.println("---Mutable---");
    
    
    StringBuilder string1 = new StringBuilder("Tamil");
    StringBuilder string2 = new StringBuilder("Tamil");
    
    int add1=System.identityHashCode(string1);
    int add2=System.identityHashCode(string2);
    
    System.out.println(add1);
    System.out.println(add2);
    
    StringBuilder append = string1.append(string2);
    System.out.println(append);
    System.out.println(System.identityHashCode(append));
    
    
    
	}
	
}	
	
