
public class Wheels extends CarPart {
	
	private int wheelState; //1 = on, 0 = off, 2 = parked
	private String tireType;


	public Wheels(int condition, boolean keyIn, int wheelState, String tireType) {
		super(condition, keyIn);
		this.wheelState = wheelState;
		this.tireType = tireType;
	}

	public int getWheelState() {
		return wheelState;
	}

	public void setWheelState(int wheels) {
		this.wheelState = wheels;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}
	
	public void status(int condition) {
		

		if (condition < 0 || condition > 100) {
			System.out.println("Invalid condition metric");
		}

		else if (condition <= 100 || condition >= 75) {
			System.out.println(tireType + " condition is above average");
		} else if (condition < 75 || condition >= 50) {
			System.out.println(tireType + " condition is in average");
		} else if (condition < 50 || condition >= 25) {
			System.out.println(tireType + " condition is below average");
		} else {
			System.out.println(tireType + " condition is considered damaged and needs repair");
		}

	}


	
	public void move() {
		System.out.println("Car is moving wheels in motion");
	}
	
	public void breaks() {
		System.out.println("Car is stopping/stopped break system engaged");
		}
	
	public void parked() {
		System.out.println("Car is parked");
	}
	
	
	
	public void function(int wheelState) {
		
		
		this.wheelState = wheelState;
		keyIgnition(isKeyIn());
		
		if (wheelState == 0) {
			parked();
		}
		else if(wheelState == 1) {
			breaks();
		}else {
			move();
		}

	
	}
	
	
}
