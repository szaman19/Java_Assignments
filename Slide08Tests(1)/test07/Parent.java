package slides08.test07;
import slides08.test07a.Child;
public class Parent {
	//In descendant classes, protected methods
	//behave like public methods
	protected void m1(int x) {
	    System.out.println("Parent.m1");
	}
	public static void main(String[] args) {
		Parent p = new Child( );
		p.m1(1);
	}
}