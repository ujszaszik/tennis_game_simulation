package TennisGame;

public class TieBreak {
	private int p1;
	private int p2;
	
	public void play(Game game) {
		System.out.println("Tie Break");
		while (!isWon(game)) {
			if (GeneratePoint.getsPoint(game.getP1(), game.getP2()).equals(game.getP1())) {
				p1++;
			} else {
				p2++;
			}
			System.out.println(p1 + " - " + p2);
		}
	}
	
	private boolean isWon(Game game) {
		if (p1 >= 7 && p1 - p2 >= 2) {
			game.getP1().winsGame(game);
			game.getP1().setSetWins();
			game.nextSet();
			System.out.println(game.getP1().getName() + "wins the set");
			return true;
		}
		if (p2 >= 7 && p2 - p1 >= 2) {
			game.getP2().winsGame(game);
			game.getP2().setSetWins();
			game.nextSet();
			System.out.println(game.getP2().getName() + "wins the set");
			return true;
		}
		return false;
	}

}