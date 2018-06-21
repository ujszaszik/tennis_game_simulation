
public class TieBreak {
	private int setNumber;
	private int p1score;
	private int p2score;

	public TieBreak(Game game) {
		setNumber = game.getCurrentSet();
	}

	public void generatePoint(Game game) {
		double a = Math.random();
		double b = Math.random();
		if (a > b) {
			p1score++;
		} else {
			p2score++;
		}
		System.out.println("(" + p1score + " - " + p2score + ")");
	}

	public boolean isWon(Game game) {
		if (p1score >= 6 && p1score - p2score >= 2) {
			game.getP1().getScore().add(game.getCurrentSet() - 1, game.getP1().getScore().get(game.getCurrentSet() - 1) + 1);
			game.getP1().winsSet();
			return true;
		}
		if (p2score >= 6 && p2score - p1score >= 2) {
			game.getP2().getScore().add(game.getCurrentSet() - 1, game.getP2().getScore().get(game.getCurrentSet() - 1) + 1);
			game.getP2().winsSet();
			return true;
		}
		return false;
	}
}
