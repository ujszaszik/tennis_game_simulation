
public class Set {

	public Set(Game game) {
		game.getP1().getScore().add(game.getCurrentSet() - 1, 0);
		game.getP2().getScore().add(game.getCurrentSet() - 1, 0);
	}

	public void generatePoint(Game game) {
		double a = Math.random();
		double b = Math.random();
		if (a > b) {
			game.getP1().getScore().add(game.getCurrentSet() - 1, game.getP1().getScore().get(game.getCurrentSet() - 1) + 1);
		} else {
			game.getP2().getScore().add(game.getCurrentSet() - 1, game.getP2().getScore().get(game.getCurrentSet() - 1) + 1);
		}
		System.out.println(game.getP1().getScore().get(game.getCurrentSet() - 1) + " - " + game.getP2().getScore().get(game.getCurrentSet() - 1));
	}

	public boolean isWon(Game game) {
		if (game.getP1().getScore().get(game.getCurrentSet() - 1) >= 6 && game.getP1().getScore().get(game.getCurrentSet() - 1) - game.getP2().getScore().get(game.getCurrentSet() - 1) >= 2) {
			game.getP1().winsSet();
			return true;
		}
		if (game.getP2().getScore().get(game.getCurrentSet() - 1) >= 6 && game.getP2().getScore().get(game.getCurrentSet() - 1) - game.getP1().getScore().get(game.getCurrentSet() - 1) >= 2) {
			game.getP2().winsSet();
			return true;
		}
		if (game.getP1().getScore().get(game.getCurrentSet() - 1) == 6 && game.getP2().getScore().get(game.getCurrentSet() - 1) == 6) {
			TieBreak tieBreak = new TieBreak(game);
			while (!tieBreak.isWon(game)) {
				tieBreak.generatePoint(game);
			}
			System.out.println(game.getP1().getScore().get(game.getCurrentSet() - 1) + " - " + game.getP2().getScore().get(game.getCurrentSet() - 1));
			return true;
		}
		return false;
	}

}
