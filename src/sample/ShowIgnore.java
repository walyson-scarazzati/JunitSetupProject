package sample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ShowIgnore {
	 @Test
	   @Ignore
	   public void testAddition()
	   {
		 Math m = new Math();
	       assertEquals(4, m.add(2, 2));
	   }
	   
	   @Test
	   @Ignore
	   public void testSubtraction()
	   {
	       
	   }

	   @Test
	   @Ignore
	   public void testMultiplication()
	   {}
	   

	   @Test
	   @Ignore
	   public void testDivision()
	   {

	   }
}
