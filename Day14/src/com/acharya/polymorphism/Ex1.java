package com.acharya.polymorphism;

class Adder
           {
	         static int add(int a, int b)
	         {
	        	 return a+b;
	         }
	 static int add(int a,int b,int c)   
	 {
		 return a+b+c;
	 }
           }
public class Ex1 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(22, 33,44));

	}

}
