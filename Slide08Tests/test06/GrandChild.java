package slides08.test06;
import slides08.test06a.Child;

public class GrandChild extends Child {
	// overrides method in Parent, NOT Child
	@Override 
	void m1(int x) {
		//super.m1(0);
	    System.out.println("GrandChild.m1");
	}
}
