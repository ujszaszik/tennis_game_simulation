package TennisGame;

public class Set {

	public Set(Game game) {
		game.getP1().getScore()[game.getCurrentSet()] = 0;
		game.getP2().getScore()[game.getCurrentSet()] = 0;
	}

	public void play(Game game) {
		System.out.println("Set " + (game.getCurrentSet() + 1));
		while (!isWon(game)) {
			if (GeneratePoint.getsPoint(game.getP1(), game.getP2()).equals(game.getP1())) {
				game.getP1().winsGame(game);
			} else {
				game.getP2().winsGame(game);
			}
			System.out.println(game.getP1().getScore()[game.getCurrentSet()] + " - " + game.getP2().getScore()[game.getCurrentSet()]);
		}

	}

	private boolean isWon(Game game) {
		int p1currentPoints = game.getP1().getScore()[game.getCurrentSet()];
		int p2currentPoints = game.getP2().getScore()[game.getCurrentSet()];
		if (p1currentPoints >= 6 && p1currentPoints - p2currentPoints >= 2) {
			game.getP1().setSetWins();
			game.nextSet();
			System.out.println(game.getP1().getName() + " wins the set");
			return true;
		}
		if (p2currentPoints >= 6 && p2currentPoints - p1currentPoints >= 2) {
			game.getP2().setSetWins();
			game.nextSet();
			System.out.println(game.getP2().getName() + " wins the set");
			return true;
		}
		if (p1currentPoints == 6 && p2currentPoints == 6) {
			new TieBreak().play(game);
			return true;
		}
		return false;
	}

}