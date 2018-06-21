package TennisGame;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Game game = new Game(new Player("Andre Agassi"), new Player("John McEnroe"), "Flushing Meadows");
		while (game.getP1().getSetWins() != 3 && game.getP2().getSetWins() != 3) {
			Set set = new Set(game);
			set.play(game);
		}
		System.out.println(game);
	}

}
