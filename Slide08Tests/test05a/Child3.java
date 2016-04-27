package slides08.test05a;
import slides08.test05b.Parent1;
public class Child3 extends Parent1 {
	// it is legal but not required to put
	// the @Override annotation here
	protected void m2(int x) {
		System.out.println("Child3.m2");
	}
}