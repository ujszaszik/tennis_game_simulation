import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Integer> score = new ArrayList<>();
	private int setWins;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSetWins() {
		return setWins;
	}

	public void winsSet() {
		setWins++;
	}

	public List<Integer> getScore() {
		return score;
	}

}
