import java.util.ArrayList;

public class Roster {
    public static ArrayList<ArrayList<Player>> roster = new ArrayList<ArrayList<Player>>();
	
	public static void fillRoster() {
		for (int i=0; i<4;i++) {
			roster.add(new ArrayList<Player>());
		}
	}
	
	public static void addPlayer(Player p) {
		int posNumIndex = 0;
		posNumIndex = p.getPosNum();
		roster.get(posNumIndex).add(p);
		
	}

	public static void removePlayer(String name) {
		boolean unidentified = true;
		int i = 0;
		ArrayList<Player> pos;
		for(int f =0; f<roster.size(); f++) {
			pos = roster.get(f);
			while(unidentified || i<pos.size()) {
				if((pos.get(i).getName().compareTo(name)) != 0) {
					pos.remove(i);
					unidentified = false;
				}
				i++;
			}
		}
	}
	
	
}
