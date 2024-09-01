package sample;

public class RockPaperScissors {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	   private int               outcome = 0;

	public int determineWinner(int player1Choice, int player2Choice) {
		if (player1Choice == player2Choice) {
			return outcome=1;
		}

		if (player1Choice == ROCK) {
			if (player2Choice == SCISSORS) {
				return outcome=2;
			} else {
				return outcome=3;
			}

		}
		return outcome;
	}
}
