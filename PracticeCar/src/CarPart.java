
public class CarPart implements CarPartInterface{
	

	
	int condition = 100; //starts at 100 and goes to 0 when part is broken
	
	
	public void status() {
		
		if(condition >= 75 && condition <= 100) {
			System.out.println("Condition of car part is in optimal condition and can be driven");
		}else if(condition >=50 && condition < 75) {
			System.out.println("Condition of car part is in average condition and can be driven");
		}
		else if(condition < 50 && condition > 1) {
			System.out.println("Condition of car part is below average condition and should be serviced before being driven");
		}
		else if(condition < 1) {
			System.out.println("Condition of car Part is broken and needs service or repair");
		}
	}
	
	public void function() {
		
	}


}
	
	