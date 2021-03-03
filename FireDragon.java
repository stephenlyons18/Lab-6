import java.util.Random;

public class FireDragon extends Dragon {
	private int fireBalls = 5;
	private Random rand = new Random();
	
	public FireDragon(String name, int hp) {
		super(name, hp);
	}

	public int fireShot() {
		System.out.println(super.getName() + " spews fire at you");
		if (fireBalls > 0) {
			fireBalls -= 1;
			return rand.nextInt(4) + 5;
		} else {
			return 0;
		}
	}

	public String toString() {
		System.out.println("\n" +"Fire shots remaining: " + fireBalls);
		return super.toString();
	}

	public int attack() {
		int randomAttack = rand.nextInt(1);
		if (randomAttack == 0) {
			return fireShot();
		} else {
			return super.attack();
		}
	}
}