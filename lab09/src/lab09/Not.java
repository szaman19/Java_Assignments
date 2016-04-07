package lab09;

public class Not implements Expr{
	Expr value;
	
	public Not (Expr a){
		int temp = a.eval();
		if(temp == 0){
			temp =1;
		}
		value = new Const(temp);
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return value.eval();
	}

}
