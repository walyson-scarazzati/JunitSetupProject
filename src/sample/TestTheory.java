package sample;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class TestTheory {
	 @DataPoints
	   public static String[]  animals = {"aligator", "bear", "camel"};

	   @DataPoints
	   public static Integer[] integers = {1, 2, 3};

	   @Theory
	   public void someTest(String x, Integer y)
	   {
	       System.out.println(x + " " + y);
	       assumeThat(x, not(startsWith("a"))); // filters out any unwanted data
	       System.out.println("continue " + x + " " + y);
	   }
}
