import java.util.*;

class Main {
	public static void main(String[] args) {
		int hp = 50;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name challenger?: ");
		String name = scan.nextLine();

		//create dragons
		Dragon dragon1 = new Dragon("Deadly Nadder", 10);
		FireDragon dragon2 = new FireDragon("Gronckle", 15);
		FlyingDragon dragon3 = new FlyingDragon("Timberjack", 20);

		System.out.println(dragon1.toString());

		while (hp > 0) {

			System.out.println(name);
			// create dragons

		}
	}
}