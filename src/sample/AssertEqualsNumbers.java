package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertEqualsNumbers {
	 @Test
	   public void a_IntegerEqualsAsserts()
	   {
	       long longValue = 10;
	       assertEquals(longValue, longValue);
	       assertEquals("Two long values", longValue, longValue);

	       short shortValue = 10;
	       int intValue = 10;
	       assertEquals("Any two 'integer' values", intValue, shortValue);
	   }

	   @Test
	   public void b_FloatingEqualAsserts()
	   {
	       double doubleValue = 0.3;
	       assertEquals("Two double values", doubleValue, doubleValue, 0.00000001);

	       float floatValue = 0.3f;
	       assertEquals("Two float values", floatValue, floatValue, 0.00000001);
	   }

	   @Test
	   public void c_DeprecatedEqualsAsserts()
	   {
	       double doubleValue = 0.3;
	       assertEquals("Two double values, no delta", doubleValue, doubleValue);
	   }
	   
	   @Test
	   public void d_DoubleDeltaEqualAsserts()
	   {
	       double doubleValue = 0.3;
	       double secondValue = 0.301;
	       assertEquals("Pass within delta", doubleValue, secondValue, 0.01);
	   }

	   @Test
	   public void e_DoubleDeltaEqualAssertsFail()
	   {
	       double doubleValue = 0.3;
	       double secondValue = 0.301;
	       assertEquals("Failed within delta", doubleValue, secondValue, 0.001);
	   }
	   
	   @Test
	   public void f_NotEquals()
	   {
	       double doubleValue = 0.3;
	       double secondValue = 0.3000001;
	       assertNotEquals("These are not equal", doubleValue, secondValue);
	       
	       long longValue = 10;
	       byte second = 9;
	       assertNotEquals("Integers too", longValue, second);
	   }
	   
	   @Test
	   public void g_FloatDeltaEqualAsserts()
	   {
	       float floatValue = 0.3f;
	       float secondValue = 0.301f;
	       assertEquals("Pass within delta", floatValue, secondValue, 0.01f);
	       assertEquals("Still Passes within delta of 0.001", floatValue, secondValue, 0.001f);
	       assertEquals("Failed within delta of 0.0001", floatValue, secondValue, 0.0001f);
	   }
}
