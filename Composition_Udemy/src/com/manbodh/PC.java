package com.manbodh;

public class PC {
//Composition example, a pc HAS A case, monitor, motherboard
	//this is better then extends because you can only inherit from one class at a time with extends
	//Composition > extends
private Case theCase;
private Monitor monitor;
private Motherboard motherboard;

public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
	super();
	this.theCase = theCase;
	this.monitor = monitor;
	this.motherboard = motherboard;
}

public Case getTheCase() {
	return theCase;
}

public Monitor getMonitor() {
	return monitor;
}

public Motherboard getMotherboard() {
	return motherboard;
}



}

	
	
