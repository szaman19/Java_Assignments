package slides08.test01;
public class Parent {
	private void m1(int x) {
	    System.out.println("Parent.m1");
	}
	public static void main(String[] args) {
		Parent p = new Child( );
		p.m1(1);
	}
}