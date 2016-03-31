package assignment05;

public abstract class PizzaTopping implements Pizza {
	private Pizza on;
	public PizzaTopping(Pizza on) {
		this.on = on;
	}
	@Override
	public int compareTo(Pizza p) {
		// TODO Auto-generated method stub
		int returnVal = 0;
		if(p instanceof PizzaTopping){
			returnVal = getClass().getSimpleName().compareTo
					(p.getClass().getSimpleName());
		}else{
			returnVal = -1;
		}
		return returnVal;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String returnVal = getClass().getSimpleName();
		if (on instanceof PizzaTopping){
			returnVal = returnVal + ", "+ on.getDescription();
		}else{
			returnVal += " on "+ on.getDescription();
		}
		return returnVal;
	}

	public Pizza getOn() {
		return on;
	}
	


	public void setOn(Pizza on) {
		this.on = on;
	}

//	@Override
//	public double getCost() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
