
public class Electronics extends CarPart {
	
	private int voltage;
	private String electronicSystem;
	



	public Electronics(int condition, boolean keyIn, int voltage, String electronicSystem) {
		super(condition, keyIn);
		this.voltage = voltage;
		this.electronicSystem = electronicSystem;
	}


	public void status(int condition) {
	

		if (condition < 0 || condition > 100) {
			System.out.println("Invalid condition metric");
		}

		else if (condition <= 100 || condition >= 75) {
			System.out.println(electronicSystem + " condition is above average");
		} else if (condition < 75 || condition >= 50) {
			System.out.println(electronicSystem + " condition is in average");
		} else if (condition < 50 || condition >= 25) {
			System.out.println(electronicSystem + " condition is below average");
		} else {
			System.out.println(electronicSystem+ " condition is considered damaged and needs repair");
		}

	}
	
	
	public void function() {
		keyIgnition(isKeyIn());
		
	}

}
