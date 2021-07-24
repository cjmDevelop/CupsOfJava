package com.manbodh;
//Composition > inheritance
public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		
		Case theCase = new Case("220b", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 2, new Resolution(2540, 1440));
		
		Motherboard motherboard = new Motherboard("X5000","Intel", 4, 3, "Bios Version 5-x3");
		
		PC thePC = new PC(theCase, theMonitor, motherboard); 
		
		thePC.getMonitor().drawPixelAt(1500, 1200, "blue");
		thePC.getMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();

	}

}
