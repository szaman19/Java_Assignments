package assignment08;

import org.junit.Assert;
import org.junit.Test;

public class Question3Test {

	@Test
	public void test() {
		double test1 = 0.0;
		Assert.assertEquals(0,Question3.squareRoot(test1),1E-9);
		double test2 = 2.0;
		Assert.assertEquals(Math.sqrt(test2), Question3.squareRoot(test2),1E-9);
	}
	@Test (expected=IllegalArgumentException.class) 
	public void testNegativeInput() {
		Question3.squareRoot(-1);
	}

}
