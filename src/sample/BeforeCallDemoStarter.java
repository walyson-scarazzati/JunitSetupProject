package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeCallDemoStarter {

	@BeforeClass
	public  static void showBeforeClass(){
		System.out.println("showBeforeClass");
	}
	
	@Before
	public void showBefore() {
		System.out.println("Before");
	}
	
	@Test
	public void one(){
		System.out.println("One");
	}
	
	@Test
	public void two(){
		System.out.println("Two");
	}
	@Test
	public void three(){
		System.out.println("Three");
	}
	
	@After
	public void showAfter(){
		System.out.println("showAfter");
	}
	
	@AfterClass
	public  static void showAfterClass(){
		System.out.println("showAfterClass");
	}
	
	
	
}
