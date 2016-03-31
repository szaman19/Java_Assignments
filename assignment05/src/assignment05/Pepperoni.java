package assignment05;

public class Pepperoni extends PizzaTopping {

	public Pepperoni(Pizza on) {
		super(on);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.50 + getOn().getCost();
	}

}
