
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Game game = new Game(new Player("John McEnroe"), new Player("Andre Agassi"), "Flushing Meadows");
		while (! (game.getP1().getSetWins() == 3 || game.getP2().getSetWins() == 3)) {
			Set set = new Set(game);
			System.out.println(game.getCurrentSet());
			while (!set.isWon(game)) {
				set.generatePoint(game);
			}
			game.setCurrentSet(game.getCurrentSet() + 1);
		}
		System.out.println(game.getP1().getScore().size() + " - " + game.getP1().getScore());
		System.out.println(game.getP2().getScore().size() + " - " + game.getP2().getScore());
	}

}
