package lab09;

public class Const implements Expr {
	private int value; 
	public Const(int num){
		value =  num;
		
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value;
	}

}
