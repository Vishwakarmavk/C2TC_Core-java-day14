package com.acharya.finalex;

class Bike
          {
	        final int speedlimit=90;
	        void run()
	        {
	        	System.out.println("The value not be changed.s ");
	        }
          }
public class Ex1 {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();

	}

}
