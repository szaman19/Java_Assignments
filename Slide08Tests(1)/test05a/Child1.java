package slides08.test05a;
import slides08.test05.Parent;
public class Child1 extends Parent {
	// it is legal but not required to put
	// the @Override annotation here
	public void m1(int x) {
		System.out.println("Child1.m1");
	}
}