
public class Engine extends CarPart {

	private String engineShapeAndCyclinder;  //"V8";
	private String engineSize;   //"4.6L";
	private String engineOnState;   //"Pistons firing Engine rumbling and ready to start driving!";
	private String ignition = "off"; // default value
	   
	public Engine(String shapeAndCylinder, String size, String onState, String ignite) {
	this.engineShapeAndCyclinder = shapeAndCylinder;
	this.engineSize = size;
	this.engineOnState = onState;
	this.ignition = ignite;
	}
		
	
	
	public void engineMethod(String ignition) {
		if(ignition == "on") {
			System.out.println(engineOnState);
			
		}else if(ignition == "off") {
			System.out.println("Vehicle inoperable due to engine not running");
		}
	}
	

	public void function() {
//		engineMethod(ignition);
		
		engineMethod(ignition);
	
		
		}


	public void status() {
		System.out.println("Engine is a " + engineShapeAndCyclinder + " and Engine size is " + engineSize );
	}
	
	
}
