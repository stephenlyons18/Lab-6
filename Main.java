import java.util.*;

//hello world
class Main {
	static ArrayList dragons = new ArrayList<Dragon>();
	static int hp = 50;
	public static void main(String[] args) {
		
	 	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name challenger?: ");
		String name = scan.nextLine();

		// create dragons
		Dragon dragon1 = new Dragon("Deadly Nadder", 10);
		Dragon dragon2 = new FireDragon("Gronckle", 15);
		Dragon dragon3 = new FlyingDragon("Timberjack", 20);

		dragons.add(0, dragon1);
		dragons.add(1, dragon2);
		dragons.add(2, dragon3);

		while (hp > 0){
			menu(dragons);
		}
	}

	public static void menu(ArrayList<Dragon> dragons) {
		int userDamage;
		Scanner scan2 = new Scanner(System.in);
		int index = 1;
		for (Dragon enemy : dragons) {
			if (enemy.getHP() > 0) {
				System.out.print(index + ". Attack " + enemy.toString());
				index += 1;
			}
		}
		System.out.println("Enter a dragon to attack (1-3): ");
		int choice = scan2.nextInt();
		System.out.println("Attack with: "+"\n"+" 1. Arrow (1 D12)"+"\n"+"2. Sword (2 D6)");
		System.out.println("Enter an attack (1-2): ");
		int attackChoice = scan2.nextInt();
		Random rand = new Random();

		if (attackChoice == 1){
			userDamage = rand.nextInt(11) + 1;
		}
		else{
			int temp1 = rand.nextInt(5) + 1;
			int temp2 = rand.nextInt(5) + 1;
			userDamage = temp1 + temp2;
		}
		
		dragons.get(choice - 1).takeDamage(userDamage);
		hp -= dragons.get(choice - 1).attack();
	}

}