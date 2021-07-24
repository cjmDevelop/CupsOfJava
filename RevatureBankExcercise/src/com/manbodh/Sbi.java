package com.manbodh;

public class Sbi extends Bank{


private float interest = .08f;
	


	public void getRateOfInterest(float money) {
		System.out.println("The rate of interest for SBI amount:" + money + "$" + " is " + (money * interest)+ "$");
	}






	
}
