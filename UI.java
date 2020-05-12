import java.util.Scanner;

public class UI {
	
	private static Scanner myScan = new Scanner(System.in);
	
	public static void userDialogue() {
		boolean playerAddRequest = false;
		
		/*Roster.fillRoster();
		Player p2 = new Player("Bob",10,2);
		Player p3 = new Player("Jim",10,3);
		Player p4 = new Player("Bob",10,1);
		Roster.addPlayer(p2);
		Roster.addPlayer(p3);
		Roster.addPlayer(p4);*/
		
		System.out.println("Do you want add a player to the roster? If yes, enter true. If no, enter false");
		playerAddRequest = myScan.nextBoolean();
		if(playerAddRequest) {
			fillRoster();
		}
		Testing.printRoster();
		//Roster.removePlayer("Bob");
		Testing.printRoster();
	}
	
	public static void fillRoster() {
		String userName = "";
		int abilityTemp = 0;
		int posNumTemp = 0;
		boolean anotherPlayer = false;
		System.out.println("What is the name of player?");
		userName = myScan.nextLine();
		System.out.println("What is the ability rating of the player? Numbers can only be 1-10 inclusive");
		abilityTemp = myScan.nextInt();
		abilityTemp = rangeRestrictor(abilityTemp,1,10,"What is the ability rating of the player? Numbers can only be 1-10 inclusive");
		System.out.println("What is the position number of the player? Numbers can only be 0-3 inclusive");
		posNumTemp = myScan.nextInt();
		posNumTemp = rangeRestrictor(posNumTemp,0,3,"What is the position number of the player? Numbers can only be 0-3 inclusive");
		Player p1 = new Player(userName, abilityTemp, posNumTemp);
		Roster.addPlayer(p1);
		System.out.println("Do you want add another player? If yes, enter true. If no, enter false");
		anotherPlayer = myScan.nextBoolean();
		if(anotherPlayer) {
			fillRoster();
		}
	}
	
	public static int rangeRestrictor(int val, int lowerBound, int upperBound, String str) {
		if(val >= lowerBound && val <= upperBound) {
			return val;
		} else {
			System.out.println("Out of range");
			System.out.println(str);
			val = myScan.nextInt();
			rangeRestrictor(val,lowerBound,upperBound,str);
		}
		return 0;
	}
}
