package sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSlowBehavior {
	private SlowBehavior target;

	@Before
	public void setup() {
		target = new SlowBehavior();
	}

	@Test(timeout = 2000)
	public void testSlow() {
		target.doSomethingSlow();
	}

	@Test(timeout = 2000)
	public void testVerySlow() {
		target.doSomethingVerySlow();
	}

	@Test(timeout = 2000)
	public void notJustTime() {
		assertEquals("Basic math is still true", 4, 2 + 2);

	}
}
