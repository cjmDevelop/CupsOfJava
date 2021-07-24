
public class Tires extends CarPart {

	private String tireType;   // = " P205/65R15 92T";
	private int psi;
	
	public Tires(String type, int tirePsi ){
		this.tireType = type;
		this.psi = tirePsi;
	}
	
	public void tire(int psi) {
if (psi > 45) {
	System.out.println(" Over spec tire pressure, please decrease psi. ");
}
		if(psi >= 35 || psi <= 45) {
			System.out.println("Tire pressure is calibrated properly at " + psi + " psi. ");
		}
		else if(psi <= 34) {
			System.out.println("Tire pressure is under spec at " + psi + ", please add air. ");
		}
		
		
	}
	
	
	
	public void function() {
		
		tire(psi);

	}
	
	

	public void status() {
		System.out.println("Tire type is: " + tireType );
		
	}
	


	
}
