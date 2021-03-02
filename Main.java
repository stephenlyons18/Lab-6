import java.util.*;
//hello world
class Main {
	public static void main(String[] args) {
		int hp = 50;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name challenger?: ");
		String name = scan.nextLine();

		//create dragons
		Dragon dragon1 = new Dragon("Deadly Nadder", 10);
		Dragon dragon2 = new FireDragon("Gronckle", 15);
		Dragon dragon3 = new FlyingDragon("Timberjack", 20);

		System.out.println(dragon3.toString());

		while (hp > 0) {

			
			// create dragons

		}
	}
	public void dragonMenu(){
		System.out.println("");
		
	}
	public void attackMenu(){

	} 
}