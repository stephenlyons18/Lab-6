import java.util.Random;

public class FlyingDragon extends Dragon {
	private int swoops = 5;
	private Random rand = new Random();

	public FlyingDragon() {
		super();
	}

	public int swoopAttack() {
		if (swoops > 0) {
			swoops -= 1;
			return rand.nextInt(5) + 5;
		} else {
			return 0;
		}
	}

	public String toString() {
		System.out.println("Swoop Attacks remaining: " + fireBalls);
		return super.toString();

	}

	public int attack() {
		randomAttack = rand.nextInt(1);
		if (randomAttack == 0) {
			return swoopAttack();
		} else {
			return super.attack();
		}
	}
}