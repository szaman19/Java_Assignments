package assignment05;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTester {

	@Test
	public void testCostMedium() {
		Pizza order = new MediumCheesePizza();
		order = new Mushroom(order);
		order = new GoatCheese(order);
		order = new Pepperoni(order);
		assertEquals(order.getCost(),11.25,1E-6);
	}
	@Test
	public void testCostSmall(){
		Pizza order = new SmallCheesePizza();
		order = new Mushroom(order);
		order = new GoatCheese(order);
		order = new Pepperoni(order);
		assertEquals(order.getCost(),9.25,1E-6);
	}

}
