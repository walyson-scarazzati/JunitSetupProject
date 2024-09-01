package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneralAssertions {

	
	 private Weather weather = new Weather(18);
	   
	   @Test
	   public void showAssertTrue()
	   {
	       assertTrue("No Rainbow today", weather.isItSunnyToday() && weather.willItRainToday());
	       System.out.println("OK, test the rainbow stuff");
	   }

	   @Test
	   public void showAssertFalse()
	   {
	       assertFalse("Unsafe to drive", !(weather.isItFreezingToday() && weather.willItRainToday()));
	       System.out.println("Test the new vehicle");
	   }


	   @Test
	   public void showFail()
	   {
	       if (weather.isItFreezingToday() || weather.willItRainToday())
	       {
	           fail("Weather is bad, call off our plans");
	       }
	   }
	   
	
	
}
