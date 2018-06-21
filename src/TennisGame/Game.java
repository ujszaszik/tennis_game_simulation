package TennisGame;

public class Game {
	private Player p1;
	private Player p2;
	private String location;
	private int currentSet;

	public Game(Player p1, Player p2, String location) {
		this.p1 = p1;
		this.p2 = p2;
		this.location = location;
	}

	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void nextSet() {
		currentSet++;
	}
	
	public int getCurrentSet() {
		return currentSet;
	}

	@Override
	public String toString() {
		return "Final score at: " + location + "\n" + p1 + "\n" + p2;
	}

}