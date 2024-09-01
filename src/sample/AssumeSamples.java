package sample;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Before;
import org.junit.Test;




import static org.junit.Assume.*;

public class AssumeSamples {
	 @Test
	   public void assumeBoolean()
	   {
	       assumeFalse("This should be false", false);
	       assumeTrue("This should be true", true);
	       System.out.println("Boolean ok");
	   }

	   @Test
	   public void notNull()
	   {
	       assumeNotNull("one", "two", "many more");
	       System.out.println("None were null");
	   }

	   @Test
	   public void noException()
	   {
	       try
	       {
	           Integer.parseInt("1");
	       } catch (NumberFormatException e)
	       {
	           assumeNoException("Should not fail", e);
	       }
	       System.out.println("No exception happened");
}
	   
	   @Test
	   public void matcherWithThat()
	   {
	       assumeThat("check any criteria", "my string", containsString("my"));
	       System.out.println("That turned out OK");
	   }
	   
	   @Test
	   public void badInputData()
	   {
	       int testData = 0;
	       assumeThat("Must not be zero", testData, not(equalTo(0)));
	       
	       int answer = 10/testData;
	   }

	   
	   @Before
	   public void assumeInSetup()
	   {
	       assumeTrue("It works in setup too", true);
	   }
}
