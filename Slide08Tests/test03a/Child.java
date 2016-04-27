package slides08.test03a;
import slides08.test03.Parent;
public class Child extends Parent {
	// it is legal but not required to put
	// the @Override annotation here
	public void m1(int x) {
		System.out.println("Child.m1");
	}
}