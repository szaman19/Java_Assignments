package slides08.test04;
public class Parent {
	//Inside the same package, package visibility
	//behaves like public visibility
	void m1(int x) {
	    System.out.println("Parent.m1");
	}
	public static void main(String[] args) {
		Parent p = new Child( );
		p.m1(1);
	}
}