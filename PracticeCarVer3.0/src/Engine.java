
public class Engine extends CarPart {

	private String engineType;





	public Engine(int condition, boolean keyIn, String engineType) {
		super(condition, keyIn);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

public void status(int condition) {
		

		if (condition < 0 || condition > 100) {
			System.out.println("Invalid condition metric");
		}

		else if (condition <= 100 || condition >= 75) {
			System.out.println(engineType + " condition is above average");
		} else if (condition < 75 || condition >= 50) {
			System.out.println(engineType + " condition is in average");
		} else if (condition < 50 || condition >= 25) {
			System.out.println(engineType + " condition is below average");
		} else {
			System.out.println(engineType + " condition is considered damaged and needs repair");
		}

	}

public void function() {

	keyIgnition(isKeyIn());
	
}

	
	
	
}
