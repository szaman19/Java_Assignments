package assignment05;

public class Mushroom extends PizzaTopping {

	public Mushroom(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.25 + getOn().getCost();
	}

}
