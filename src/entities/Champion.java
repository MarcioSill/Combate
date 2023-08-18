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
	
	Champion A;
	public void takeDamage(Champion other) {
	
		if(A == null) {
			A = other;
		}
	
	if(A != other) {
		if((other.getAttack() + other.getArmor()) >= other.getLife()) {
			other.setLife(other.getLife() - 1);
		  }
		
		else {

			  other.setLife( (other.getLife() + other.getArmor())- A.getAttack());
			 }	
		
		if((A.getAttack() + A.getArmor()) >= A.getLife()) {
			A.setLife(A.getLife() - 1);
		  }
		
		else {

			  A.setLife( (A.getLife() + A.getArmor())- other.getAttack());
			 }
	 }

	}
	
		
	public String status(Champion S) {
	
		return S.name + ": " + S.life + "de vida";
	}
	
	
	
}
	
