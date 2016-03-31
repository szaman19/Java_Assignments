package assignment05;

public class GreenPeppers extends PizzaTopping {

	public GreenPeppers(Pizza on) {
		super(on);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.30 + getOn().getCost();
	}

}
