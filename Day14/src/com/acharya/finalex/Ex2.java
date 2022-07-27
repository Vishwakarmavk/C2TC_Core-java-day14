package com.acharya.finalex;

class Bike1
          {
	        final void run()
	        {
	        	System.out.println("Running...");
	        }
          }
class Honda extends Bike1
          {
      
          }
public class Ex2 {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();

	}

}
