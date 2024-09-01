package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeCallDemo {
	@BeforeClass
	   public static void showBeforeClass()
	   {
	       System.out.println("BeforeClass");
	   }

	   @Before
	   public void showBefore()
	   {
	       System.out.println("Before");
	   }

	   @Test
	   public void one()
	   {
	       System.out.println("one");
	   }

	   @Test
	   public void two()
	   {
	       System.out.println("two");
	   }

	   @Test
	   public void three()
	   {
	       System.out.println("three");
	   }
	   
	   @After
	   public void showAfter()
	   {
	       System.out.println("After");
	   }

	   @AfterClass
	   public static void showAfterClass()
	   {
	       System.out.println("AfterClass");
	   }
}
