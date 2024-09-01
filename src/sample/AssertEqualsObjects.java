package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertEqualsObjects {
	@Test
	   public void a_StringEquals()
	   {
	       String first = "objectEquals";
	       String second = "objectEquals";
	       assertEquals("Two strings", first, second);
	   }
	   
	   @Test
	   public void b_ObjectEquals()
	   {
	       SampleClass first = new SampleClass(42, "a value");
	       SampleClass second = new SampleClass(42, "a value");
	       assertEquals("Two .equals Objects", first, second);
	   }

	   @Test
	   public void c_ObjectEqualsFail()
	   {
	       SampleClass first = new SampleClass(42, "a value");
	       SampleClass second = new SampleClass(42, "another value");
	       assertEquals("Two not .equals Objects", first, second);
	   }

	   @Test
	   public void d_ObjectNotEquals()
	   {
	       SampleClass first = new SampleClass(42, "a value");
	       SampleClass second = new SampleClass(42, "another value");
	       assertNotEquals("Two not .equals Objects", first, second);
	   }
	   
	   @Test
	   public void e_SameObject()
	   {
	       String first = "objectEquals";
	       String nonPooled = new String("objectEquals");
	      assertEquals("Two strings not ==", first, nonPooled);
	  assertNotSame("Not the same object intentionally", first, nonPooled);
	    assertSame("Not the same object", first, nonPooled);
	      
	   }

	   @Test
	   public void f_NullObjectFail()
	   {
	       String first = "objectEquals";
	       String nullObject = null;
	       assertEquals("One is null", first, nullObject);
	   }
	   
	   @Test
	   public void g_NullObjects()
	   {
	       String first = null;
	       String second = null;
	       assertEquals("Both are null", first, second);
	   }

	   @Test
	   public void h_Null()
	   {
	       String check = null;
	       assertNull("This should be null", check);
	   }

	   @Test
	   public void i_NotNull()
	   {
	       String check = "value";
	       assertNotNull("This should be not be null", check);
	   }
	   
	   @Test
	   public void j_ObjectArray()
	   {
	       int [] first = {1, 2, 3};
	       int [] sameOne = first;
	     assertEquals("Two array pointers", first, sameOne);
	       int [] second = {1, 2, 3};
	      assertEquals("Two equal arrays", first, second);
	   }
	
}
