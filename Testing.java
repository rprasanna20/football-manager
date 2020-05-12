
public class Testing {
	
	public static void printRoster() {
	System.out.println("Name.......ability rating max.......position number");
		for (int j=0; j<4; j++) {
			for(int i=0; i<Roster.roster.get(j).size(); i++) {
				System.out.println(Roster.roster.get(j).get(i));
			}
		}
		
	}
	
	
}
