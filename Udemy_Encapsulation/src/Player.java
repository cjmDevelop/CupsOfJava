
public class Player {
	
	public String name; //no constructor 
	public int health;
	public String weapon;
	
	public void lostHealth(int damage) {
		this.health -= damage;
		
		if(this.health <= 0) {
			System.out.println("Player knocked out");
			//reduce number of lives remaining for player
		}
	}
	
	public int healthRemaining() {
		return this.health;
	}

}
