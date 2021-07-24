import java.util.ArrayList;
public class Car {
	private ArrayList<CarPart> carParts;
	public Car() {

		carParts = new ArrayList<CarPart>();
		carParts.add(new Engine(88, true, " V8 4.6L "));
		carParts.add(new Electronics(77, true, 12, " Electronic System "));
		carParts.add(new Wheels( 68, true, 1, "Racing Tires by FireStone"));
		carParts.add(new Transmission(45, true, " 5 speed Manual Transmission ", false));

	}
	
	public void run() {

		for (int i = 0; i < carParts.size(); i++) {
			carParts.get(i).function();
			//carParts.get(i).status();
		}

		//System.out.println("Start your engines!");

	}
}
