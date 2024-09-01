package sample;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Ignore;
import org.junit.Test;

public class FirstUnit {

	@Test
	 @Ignore
	public void test() {
		assertTrue(true);
	/*	fail("Not yet implemented");*/
	}
	
	@Test
	@Ignore
	public void test2() {
		assertTrue(true);
	/*	fail("Not yet implemented");*/
	}
	
	@Test
	 @Ignore
	public void testAdd(){
		MyTarget target = new MyTarget();
		int answer = target.basicAdd(2,2);
		TestCase.assertEquals("Two plus two is four right?", 4,answer);	
	}

	  @Test
	  @Ignore
      public void badTestCase()
      {
              MyTarget target = new MyTarget();
              
              int answer = target.basicAdd(2, 2);
              TestCase.assertEquals("Adding is fun", 6, answer);
      }
	  
	  @Test
	  @Ignore
public void someOtherMethod()
      {
            throw new RuntimeException();
      }
      

      @Test(expected=ArithmeticException.class)
      public void testDivideByZero()
      {
              MyTarget target = new MyTarget();
              
              int answer = target.basicDivide(100, 10);
      }
      
      @Test
      @Ignore
      public void sillyTest()
      {
              TestCase.assertTrue(false);
      }
	

}
