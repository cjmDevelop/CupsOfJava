
public class Transmission extends CarPart{
	
	private String transmissionType;
	private boolean stateTran;

	
	public Transmission(int condition, boolean keyIn, String transmissionType, boolean stateTran) {
		super(condition, keyIn);
		this.transmissionType = transmissionType;
		this.stateTran = stateTran;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

public void status(int condition) {
		

		if (condition < 0 || condition > 100) {
			System.out.println("Invalid condition metric");
		}

		else if (condition <= 100 || condition >= 75) {
			System.out.println(transmissionType + " condition is above average");
		} else if (condition < 75 || condition >= 50) {
			System.out.println(transmissionType + " condition is in average");
		} else if (condition < 50 || condition >= 25) {
			System.out.println(transmissionType + " condition is below average");
		} else {
			System.out.println(transmissionType + " condition is considered damaged and needs repair");
		}

	}
	
	
	public void function() {
		keyIgnition(isKeyIn());
		
	}
	
	

}
