package sample;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestParametersStarter {

	private int player1;
	private int player2;
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	private int outcome;

	public int determineWinner(int player1Choice, int player2Choice) {
		if (player1Choice == player2Choice) {
			return outcome = 0;
		}

		if (player1Choice == ROCK) {
			if (player2Choice == SCISSORS) {
				return outcome = 1;
			} else {
				return outcome = 2;
			}

		}
		return outcome;
	}
	
	 @Parameters(name="Rock, Paper, Scissors winner {0} versus {1} => {2}")
	   public static Collection<Integer[]> addedNumbers()
	   {
	       return Arrays.asList(new Integer[][] { 
	               {RockPaperScissors.ROCK, RockPaperScissors.ROCK, 0},
	               {RockPaperScissors.ROCK, RockPaperScissors.PAPER, 2},
	               {RockPaperScissors.ROCK, RockPaperScissors.SCISSORS, 1},
	               {RockPaperScissors.PAPER, RockPaperScissors.ROCK, 1},
	               {RockPaperScissors.PAPER, RockPaperScissors.PAPER, 0},
	               {RockPaperScissors.PAPER, RockPaperScissors.SCISSORS, 2},
	               {RockPaperScissors.SCISSORS, RockPaperScissors.ROCK, 2},
	               {RockPaperScissors.SCISSORS, RockPaperScissors.PAPER, 1},
	               {RockPaperScissors.SCISSORS, RockPaperScissors.SCISSORS, 0},
	       });
	   }
	
	@Test
	public void testDetermination() {
		assertEquals("Game outcome", outcome, determineWinner(1, 2));
	}

}
