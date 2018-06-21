
public class Game {
	private Player p1;
	private Player p2;
	private String location;
	private int currentSet = 1;

	public Game(Player p1, Player p2, String location) {
		this.p1 = p1;
		this.p2 = p2;
		this.location = location;
	}

	public int getCurrentSet() {
		return currentSet;
	}

	public void setCurrentSet(int currentSet) {
		this.currentSet = currentSet;
	}

	public String getLocation() {
		return location;
	}

	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}

	public void play() {

	}

}
