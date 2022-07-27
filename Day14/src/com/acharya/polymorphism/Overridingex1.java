package com.acharya.polymorphism;

class Bike
        {
	      void run()
	      {
	    	  System.out.println("Vehicle is Running");
	      }
        }
class Bike2 extends Bike
        {
	      void run()
	      {
	    	  System.out.println("Bike is running safely");
	      }
        }
public class Overridingex1 {

	public static void main(String[] args) {
		Bike b=new Bike2();
		b.run();

	}

}
