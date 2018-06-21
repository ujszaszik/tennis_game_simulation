package TennisGame;

import java.util.Arrays;
import java.util.StringJoiner;

public class Player {
	private String name;
	private int[] score;
	private int setWins;

	public Player(String name) {
		this.name = name;
		score = new int[5];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getSetWins() {
		return setWins;
	}

	public void setSetWins() {
		setWins++;
	}

	public void winsGame(Game game) {
		score[game.getCurrentSet()]++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(score);
		result = prime * result + setWins;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(score, other.score))
			return false;
		if (setWins != other.setWins)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " " + setWins + " (" + setsToString() + ") ";
	}

	public String setsToString() {
		StringJoiner sj = new StringJoiner(", ");
		for (int i = 0; i < score.length; i++) {
			sj.add(String.valueOf(score[i]));
		}
		return sj.toString();
	}

}