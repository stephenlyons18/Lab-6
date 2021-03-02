import java.util.Random;

public class Dragon {
	private String name;
	private int hp;
	private int MAX_HP;

	private Random rand = new Random();

	public Dragon(String n, int maxHP) {
		name = n;
		hp = maxHP;
		MAX_HP = maxHP;
	}

	public int attack() {
		return rand.nextInt(4) + 3;
	}

	public void takeDamage(int damageAmt) {
		hp -= damageAmt;
	}

	public int getHP() {
		return hp;
	}

	@Override
	public String toString() {
		return name + ": " + hp + "/" + MAX_HP;
	}

}