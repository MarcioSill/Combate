package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
 	
	public Champion(){
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	    takeDamage(this);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAttack() {
		return attack;
	}
	
	public void takeDamage(Champion other) {	
		
		if((other.getAttack() + other.getArmor()) >= other.getLife()) {
			other.setLife(other.getLife() - 1);
		  }
		
		else {

			  other.setLife( (other.getLife() - this.attack ) + other.getArmor());
			 }	
			
		}
	
		
	public String status(Champion x) {	
		return x.name + ": " + x.life + "de vida";
	}
	
	
	
}
	
