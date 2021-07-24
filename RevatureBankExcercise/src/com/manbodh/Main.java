package com.manbodh;

public class Main {

	public static void main(String[] args) {
		
		Bank sbi = new Sbi();      //All of these are covariance with reference types
		Bank axis = new Axis();
		Bank icici = new Icici();
	
		sbi.getRateOfInterest(100000);
		axis.getRateOfInterest(200000);
		icici.getRateOfInterest(300000);
	
		

	}

}
