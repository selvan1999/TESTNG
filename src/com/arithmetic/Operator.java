package com.arithmetic;

public class Operator {

	 static class Operators {
		 void add() {
		 int a= 100;
		 int b=500;
		 int c=a+b;
		 System.out.println("the added value is "+c);
		 }
		 public static void main(String[]args) {
			 Operators ad=new Operators();
			 ad.add();
		 }		 
}
}