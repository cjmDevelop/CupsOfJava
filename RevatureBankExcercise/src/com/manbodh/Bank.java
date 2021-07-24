package com.manbodh;

public class Bank {

	private float interest = .03f;


	public void getRateOfInterest(float money) {
		System.out.println(money * interest);
	}

}
