package assignment05;

public class GoatCheese extends PizzaTopping {

	public GoatCheese(Pizza on) {
		super(on);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return .50 + getOn().getCost();
	}

}
