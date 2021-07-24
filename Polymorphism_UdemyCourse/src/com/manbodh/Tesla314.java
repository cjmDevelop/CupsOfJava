package com.manbodh;

public class Tesla314 extends Car {
	

	private int wheels;
	private String model;
	private String manufacturer;
	private boolean electricTeslaEngine;
	
	
	
	
	public Tesla314(int wheels, String model, String manufacturer, boolean gasEngine, boolean dieselEngine,
			boolean electricEngine) {
		super(wheels, model, manufacturer, gasEngine, dieselEngine, electricEngine);
		this.wheels = wheels;
		this.model = model;
		this.manufacturer = manufacturer;
		this.electricTeslaEngine = electricEngine;
	}
	
	public void startTeslaEngine(boolean electricTeslaEngine) {
	
		 if(electricTeslaEngine == true) {
			System.out.println("Electric engine started...");
		}else {
			System.out.println("Engine not found...");
		}
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
	public boolean isElectricTeslaEngine() {
		return electricTeslaEngine;
	}
	
	
	
	

}


