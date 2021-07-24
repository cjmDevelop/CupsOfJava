package com.manbodh;

public class Tires extends CarPart {
	private String tireType;   // = " P205/65R15 92T";
	private int psi;
	public int condition;
	
	
	
	
	public Tires(String tireType, int psi, int condition) {
		super();
		this.tireType = tireType;
		this.psi = psi;
	this.condition = condition;
	}



	public int getCondition() {
		return condition;
	}



	public void setCondition(int condition) {
		this.condition = condition;
	}



	public String getTireType() {
		return tireType;
	}



	public void setTireType(String tireType) {
		this.tireType = tireType;
	}



	public int getPsi() {
		return psi;
	}



	public void setPsi(int psi) {
		this.psi = psi;
	}



	public void status(int condition) {
		if(condition >= 75 && condition <= 100) {
			System.out.println("Condition of " + getTireType() + " is rated at " + getCondition() +  " out of 100, and is considered above average condition.");
		}else if(condition >=50 && condition < 75) {
			System.out.println("Condition of " + getTireType() + " is rated at " + getCondition() +  " out of 100, and is considered average condition.");
		}
		else if(condition < 50 && condition > 1) {
			System.out.println("Condition of " + getTireType() + " is rated at " + getCondition() +  " out of 100, and is considered below average condition.");
		}
		else if(condition < 1) {
			System.out.println("Condition of " + getTireType() + " is rated at " + getCondition() +  " out of 100, and is considered broken and needs repair.");
		}
	}
	
	
	public void tire(int psi) {
if (psi > 45) {
	System.out.println(" Over spec tire pressure, please decrease psi. ");
}
		if(psi >= 35 || psi <= 45) {
			System.out.println("Tire pressure is calibrated properly at " + getPsi() + " psi. ");
		}
		else if(psi <= 34) {
			System.out.println("Tire pressure is under spec at " + getPsi() + ", please add air. ");
		}
		
		
	}
	
	public void function() {
		tire(psi);
	}
	
	
	
	
	
	
}
