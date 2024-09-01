package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertArrayEquals {
	   @Test
	   public void a_NotEquals()
	   {
	       int [] first = {1, 2, 3};
	       int [] sameOne = first;
	       assertEquals("Two array pointers", first, sameOne);
	       int [] second = {1, 2, 3};
	       assertEquals("Two equal arrays", first, second);
	   }
	   
	   @Test
	   public void b_ArrayEquals()
	   {
	       int [] first = {1, 2, 3};
	       int [] second = {1, 2, 3};
	       assertArrayEquals("Two equal arrays", first, second);
	   }

	   @Test
	   public void c_ArrayEqualsFail()
	   {
	       int [] first = {1, 2, 3};
	       int [] second = {1, 2, 4};
	       assertArrayEquals("Two unequal arrays", first, second);
	   }

	   @Test
	   public void d_ArrayEqualsFailSize()
	   {
	       int [] first = {1, 2, 3};
	       int [] second = {1, 2};
	       assertArrayEquals("Two very different", first, second);
	   }

	   @Test
	   public void e_TypeFail()
	   {
	       Object[] first = {"string"};
	       Object[] second = {new SampleClass(5, "e")};
	       assertArrayEquals("Two very different", first, second);
	   }
	   
	   @Test
	   public void f_ManyTypes()
	   {
	       double [] first = {1.0, 2.0, 3.0};
	       double [] second = {1.0, 2.0, 3.0};
	       assertArrayEquals("Two double arrays", first, second, 0.01);
	       
	       String[] string1 = {"A", "B"};
	       String[] string2 = {"A", "B"};
	       assertArrayEquals("Two String arrays", string1, string2);
	       
	       SampleClass [] any1 = {new SampleClass(5, "d")};
	       SampleClass [] any2 = {new SampleClass(5, "d")};
	       assertArrayEquals("Two Any Object arrays", any1, any2);
	   }

	   @Test
	   public void g_MixedTypes()
	   {
	       Object[] any1 = {new SampleClass(5, "d"), "string", new Integer(3)};
	       Object[] any2 = {new SampleClass(5, "d"), "string", new Integer(3)};
	       assertArrayEquals("Two Mixed Object arrays", any1, any2);
	   }
	   
	   @Test(expected=AssertionError.class)
	   public void h_NotEquals()
	   {
	       Object[] any1 = {new SampleClass(5, "d"), "string", new Integer(3)};
	       Object[] any2 = {new SampleClass(5, "e"), "string", new Integer(3)};
	       try
	       {
	           assertArrayEquals("Two Mixed Object arrays", any1, any2);
	           fail("The arrays should be different");
	       } catch (AssertionError e)
	       {
	       
	       }
	   }
}
