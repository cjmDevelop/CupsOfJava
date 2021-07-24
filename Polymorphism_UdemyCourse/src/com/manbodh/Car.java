package com.manbodh;

public class Car {
	
	private int wheels;
	private String model;
	private String manufacturer;
	private boolean gasEngine;
	private boolean dieselEngine;
	private boolean electricEngine;
	public Car(int wheels, String model, String manufacturer, boolean gasEngine, boolean dieselEngine,
			boolean electricEngine) {
		super();
		this.wheels = wheels;
		this.model = model;
		this.manufacturer = manufacturer;
		this.gasEngine = gasEngine;
		this.dieselEngine = dieselEngine;
		this.electricEngine = electricEngine;
	}
	
	public void startEngine(boolean gasEngine, boolean dieselEngine, boolean electricEngine) {
		if(gasEngine == true) {
			
			System.out.println("Gas engine Started...");
			
		}else if(dieselEngine == true) {
			System.out.println("Diesel engine started...");
		}else if(electricEngine == true) {
			System.out.println("Electric engine started...");
		}else {
			System.out.println("Engine not found...");
		}
}
	
	public void accelerate() {
		System.out.println("Driving.....");
	}
	
	public void breaks() {
		System.out.println("Stopping....");
	}
	
	
	public int getWheels() {
		return wheels;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public boolean isGasEngine() {
		return gasEngine;
	}
	public boolean isDieselEngine() {
		return dieselEngine;
	}
	public boolean isElectricEngine() {
		return electricEngine;
	}

	
	
	


}
