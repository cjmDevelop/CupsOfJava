
public class Mt5 extends CarPart {

	private int gear;
	private char rP;          // = "Reverse/park"; 
	private String transmissionType = "5 speed manual Transmission";
	
	
	public Mt5(int gears, char reversePark) {
		this.gear = gears;
		this.rP = reversePark;
		
	}

	public void getInGear(int gear, char rP) {
		
		if (rP == 'R' || rP == 'r' && gear == 0) {
			System.out.println(" Car is currently in reverse, this gear is also preferred for parking. " );
		}
		
		if (gear > 5 || gear < -1) {
			System.out.println("Invalid Gear");
		}
		if (gear == 1) {
			System.out.println(" Car is currently in " + gear + "st gear. "+" 1st gear is capable of 1-25 mph");
		}

		if (gear == 2) {
			System.out.println(" Car is currently in " + gear + "nd gear. "+" 2nd gear is capable of 26-38 mph");
		}
		if (gear == 3) {
			System.out.println(" Car is currently in " + gear + "rd gear. "+" 3rd gear is capable of 38-60 mph ");
		}
		if (gear == 4) {
			System.out.println(" Car is currently in " + gear + "th gear. "+" 4th gear is capable of 60-85 mph");
		}
		if (gear == 5) {
			System.out.println(" Car is currently in " + gear + "th gear. "+" 5th gear is capable of 85-105 mph ");
		}

		

	}

	
	public void function() {

		getInGear(gear, rP);
		
		
		
	}

	

	public void status() {
		System.out.println(" This is a " + transmissionType );
	}

	
}
