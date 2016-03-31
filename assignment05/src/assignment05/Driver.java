package assignment05;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static Pizza sortToppings(Pizza p){
		ArrayList<Pizza> list = new ArrayList<Pizza>();		
		while(p instanceof PizzaTopping){
			list.add(p);
			p = ((PizzaTopping)p).getOn();
		}
		list.add(p);
		Collections.sort(list);
		list.set(list.size()-1,p);
		
		for(int i = (list.size()-2);i > -1; i--){
			((PizzaTopping)list.get(i)).setOn(p);
			p = list.get(i);
			 
		}
		//System.out.println(list.toString());
		//System.out.println(p); 
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza order = new MediumCheesePizza();
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new Mushroom(order);
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new Pepperoni(order);
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new GoatCheese(order);
		order = sortToppings(order);
		System.out.println(order.getDescription() + " " + order.getCost());
	}

}
