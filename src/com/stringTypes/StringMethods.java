package com.stringTypes;

public class StringMethods {

	public static void main (String []args) {
		

		String fname="Tamil";
		String lname="Tamil";
		
	
		boolean result=	fname.equals(lname);
		System.out.println(result);
		
		boolean equalsIgnoreCase=fname.equalsIgnoreCase(lname);
        System.out.println(equalsIgnoreCase);
		
		String upperCase= fname.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase=fname.toLowerCase();
		System.out.println(lowerCase);
		
		boolean starts=fname.startsWith("T");
		System.out.println(starts);
		
		boolean endsWith=fname.endsWith("l");
		System.out.println(endsWith);
		
		boolean contains=fname.contains("i");
		System.out.println(contains);
		
		int totallength=fname.length();
	    System.out.println(totallength);
	
	    int index=fname.indexOf("m");
	    System.out.println(index);
	
	    char charAt=fname.charAt(3);
	    System.out.println(charAt);
	    
	    int lastInderOf=fname.lastIndexOf("m");
	    System.out.println(lastInderOf);
	
	   String replace=fname.replace("T", "Selvan");
	   System.out.println(replace);
	
	   String substrin=fname.substring(3);
	   System.out.println(substrin);
	   
	   
	}
	
	
	
	
	
	
	
	
	
	
	}
	


		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

