package simpleInheritence;

public class Dog extends Animal {

	
	
public int id;
	
	

	public int getId() {
	return id;
}

	public void setId(int id) {
		this.id = id;
	}
	

	public void eat() {
		System.out.println("chomp chomp");
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
