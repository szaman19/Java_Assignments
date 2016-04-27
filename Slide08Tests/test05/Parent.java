package slides08.test05;
import slides08.test05a.Child1;
import slides08.test05a.Child2;
import slides08.test05a.Child3;
import slides08.test05b.Parent1;
public class Parent {
	//Inside the same package, protected methods
	//behave like public methods
	protected void m1(int x) {
	    System.out.println("Parent.m1");
	}
	public static void main(String[] args) {
		Parent p = new Child( );
		p.m1(1);
		Parent p1 = new Child1( );
		p1.m1(1);
		Parent p2 = new Child2( );
		p2.m1(1);
		Parent1 p3 = new Child3( );
		//p3.m2(1); NOT VISIBLE
	}
}