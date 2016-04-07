package lab09;

public class Add implements Expr {
	
	private int value;
	
	public Add(Expr a, Expr b){
		value = a.eval() + b.eval();
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}

}
