package slides08.test05a;
import slides08.test05.Parent;
public class Child2 extends Parent {
	// it is legal but not required to put
	// the @Override annotation here
	protected void m1(int x) {
		System.out.println("Child2.m1");
	}
}