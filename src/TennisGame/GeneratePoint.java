package TennisGame;

public class GeneratePoint {

	public static Player getsPoint(Player p1, Player p2) {
		double a = Math.random();
		double b = Math.random();
		if (a > b) {
			return p1;
		} else {
			return p2;
		}
	}

}