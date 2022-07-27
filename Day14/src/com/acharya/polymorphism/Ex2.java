package com.acharya.polymorphism;

class Adder1
        {
	      static int add(int a,int b)
	      {
	    	  return a+b;
	      }
	      static double add(int a,int b,int c)
	      {
	    	  return a+b+c;
	      }
        }
public class Ex2 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 22, 33));

	}

}
