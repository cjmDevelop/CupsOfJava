
public class CarPart implements CarPartInterface {

	private int condition;
	private boolean keyIn;
	



	public CarPart(int condition, boolean keyIn) {
		super();
		this.condition = condition;
		this.keyIn = keyIn;
	}
	
	

	public int getCondition() {
		return condition;
	}



	public void setCondition(int condition) {
		this.condition = condition;
	}



	public boolean isKeyIn() {
		return keyIn;
	}



	public void setKeyIn(boolean keyIn) {
		this.keyIn = keyIn;
	}



	public void status(int condition) {
		this.condition = condition;

		if (condition < 0 || condition > 100) {
			System.out.println("Invalid condition metric");
		}

		else if (condition <= 100 || condition >= 75) {
			System.out.println("Condition is in above average condition");
		} else if (condition < 75 || condition >= 50) {
			System.out.println("Condition is in average condition");
		} else if (condition < 50 || condition >= 25) {
			System.out.println("Condition is in below average condition");
		} else {
			System.out.println("Condition of car part is considered damaged and needs repair");
		}

	}
	
	public void keyIgnition(boolean keyIn) {
		this.keyIn = keyIn;
		if(keyIn == true) {
			System.out.println(" Key is in ignition and car is on.");
		}else {
			System.out.println("Key is not in ignition, car is off");
		}
	}

	@Override
	public void function(boolean keyIn) {
		
		keyIgnition(keyIn);

	}





}
