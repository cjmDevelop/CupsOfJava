package com.manbodh;

public class Axis extends Bank {

	private float interest = .09f;
	public void getRateOfInterest(float money) {
		System.out.println("The rate of interest for AXIS amount of:" + money + "$" + " is " + (money * interest)+ "$");
	}


	


}
