package com.manbodh;

public class Car extends Vehicle {     //Car class is example of  "is a relationship"  because a car is a vehicle

	private int doors;
	private int engineCapacity;

	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}

}

