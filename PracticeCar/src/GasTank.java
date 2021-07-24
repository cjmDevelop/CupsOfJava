
public class GasTank extends CarPart{

	private int tankSize = 15;
	private int num;
	
	public GasTank(int size, int level) {
		this.tankSize = size;
		this.num = level;
	}
	

	public void GasTankGauge(int num) {
		if(num > tankSize) {
			System.out.println("Gas Overfill, tank cannot hold more then 15 gallons.");
		}
		if (num == tankSize) {
      System.out.println("Gas Tank is Full");
		}
		
		else if(num < tankSize && num >=12) {
			System.out.println("Gas tank is approximately filled at 75%");
			
		}
		else if(num >= 6 && num <=  11 ) {
			System.out.println("Gas tank is approximately filled at 50%");
		}

		else if(num < 6 && num >= 1) {
			System.out.println("Gas tank is approximately filled at 25%");
		}
		else {
			if(num < 1) {
				System.out.println("No Gas, please add fuel before attempting to drive");
			}
		}
	}
	
	
	public void function() {
	
		GasTankGauge(num);

	}
	

	public void status() {
		System.out.println("Fuel tank size can hold " + tankSize + " gallons. ");
	}

}
