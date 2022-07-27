package com.acharya.polymorphism;

class Bank
          {
	        int getrateOfInterest()
	        {
	        	return 0;
	        }
          }
class SBI extends Bank
          {
	        int getrateOfInterest()
	        {
	        	return 8;
	        }
          }
class ICIC extends Bank
          {
	         int getrateOfInterest()
	         {
	        	 return 9;
	         }
          }
class AXIS extends Bank
          {
	        int getrateOfInterest()
	        {
	        	return 2;
	        }
          }
public class Overridingex2 {

	public static void main(String[] args) {
		  Bank b1=new SBI();
		  Bank b2=new ICIC();
		  Bank b3=new AXIS();
		  System.out.println("SBI rate of interest is:"+b1.getrateOfInterest());
		  System.out.println("ICIC rate of interest is:"+b2.getrateOfInterest());
		  System.out.println("AXIS rate of interest is:"+b3.getrateOfInterest());
	}

}
