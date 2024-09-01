package sample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestParameters {
	  private int               player1;
	   private int               player2;
	   private int               outcome;

	   private RockPaperScissors game;

	   public TestParameters(int player1, int player2, int outcome)
	   {
	       this.player1 = player1;
	       this.player2 = player2;
	       this.outcome = outcome;
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

	   @Before
	   public void setupGame()
	   {
	       game = new RockPaperScissors();
	   }

	   @Test
	   public void testDetermination()
	   {
	       assertEquals("Game outcome", outcome, game.determineWinner(player1, player2));
	   }
	   
	   @Ignore
	   @Test(expected=RuntimeException.class)
	   public void testBadPlayer1()
	   {
	       assertEquals("Invalid Player 1 input", outcome, game.determineWinner(9, RockPaperScissors.PAPER));
	   }

	   @Ignore
	   @Test(expected=RuntimeException.class)
	   public void testBadPlayer2()
	   {
	       assertEquals("Invalid Player 2 input", outcome, game.determineWinner(RockPaperScissors.PAPER, -2));
	   }
	
}
