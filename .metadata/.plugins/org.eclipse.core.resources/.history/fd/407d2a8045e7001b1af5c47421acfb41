package com.manbodh;

public class CarPart implements CarPartInterface{

	public int condition;
	public String engine = "Engine";
	public String trans = "Transmission";
	public String tire = "Tires";
	public String fuelTank = "Gas Tank";

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	public String getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(String fuelTank) {
		this.fuelTank = fuelTank;
	}

	public void status(int condition) {
		this.condition = condition;

		if (condition >= 75 && condition <= 100) {
			System.out.println("Condition of car part is in optimal condition and can be driven");
		} else if (condition >= 50 && condition < 75) {
			System.out.println("Condition of car part is in average condition and can be driven");
		} else if (condition < 50 && condition > 1) {
			System.out.println(
					"Condition of car part is below average condition and should be serviced before being driven");
		} else if (condition < 1) {
			System.out.println("Condition of car Part is broken and needs service or repair");
		}
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public void function() {

	}
}
