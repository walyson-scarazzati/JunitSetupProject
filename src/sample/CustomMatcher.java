package sample;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import sample.SampleClass;
import org.hamcrest.Matcher;

public class CustomMatcher extends BaseMatcher<SampleClass>{

	  private SampleClass expected;
	   
	   public static Matcher<SampleClass> excitedSample(SampleClass expected)
	   {
	       
	       return new CustomMatcher(expected);
	   }
	   
	   public CustomMatcher(SampleClass expected)
	   {
	       this.expected = expected;
	   }

	   @Override
	   public boolean matches(Object o)
	   {
	       SampleClass s = (SampleClass) o;
	       if (s.getSomeNumber() > 10)
	       {
	           return s.getSomeString().contains(expected.getSomeString());
	       }
	       return true;
	   }

	   @Override
	   public void describeTo(Description d)
	   {
	       d.appendText("Customize description ");
	   }
	
}
