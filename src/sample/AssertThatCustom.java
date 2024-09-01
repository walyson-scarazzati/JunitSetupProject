package sample;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertThatCustom {

	
	@Test
	   public void basicCustomMatcher()
	   {
	       SampleClass tester = new SampleClass(29, "custom matcher test");
	       SampleClass expected = new SampleClass(1, "custom");
	       
	       assertThat("Run a custom matcher", tester, CustomMatcher.excitedSample(expected));
	   }
	   
	   @Test
	   public void customMatcherAdvanced()
	   {
	       SampleClass tester = new SampleClass(29, "custom matcher test");
	       SampleClass expected = new SampleClass(1, "custom");
	       
	       assertThat("Run a custom matcher", tester, either(CustomMatcher.excitedSample(expected)).or(equalTo(expected)));
	   }
	
}
