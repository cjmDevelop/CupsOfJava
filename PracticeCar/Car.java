import java.util.ArrayList;

public class Car {

	private ArrayList<CarPart> carParts;

	public Car() {

		carParts = new ArrayList<CarPart>();
		carParts.add(new Engine("V8", "4.6L", "Pistons firing Engine rumbling and ready to start driving!", "off"));
		carParts.add(new GasTank(15, 10));
		carParts.add(new Tires( "P205/65R15 92T", 45));
		carParts.add(new Mt5(0, 'r'));

	}

	public void run() {

		for (int i = 0; i < carParts.size(); i++) {
			carParts.get(i).function();
			carParts.get(i).status();
		}

		System.out.println("Start your engines!");

	}

}
