package lab09;

public class Mul implements Expr {
	
	public int value;
	
	public Mul(Expr a, Expr b){
		value = a.eval() * b.eval();
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}

}
