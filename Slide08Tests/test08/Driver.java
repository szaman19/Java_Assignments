package slides08.test08;

public class Driver {
	public static void main(String[] args) {
		ClassABC obj = new ClassDEF();
		obj.m2();

		// since ClassDEF inherits m2:
		ClassDEF obj1 = new ClassDEF();
		obj1.m2();

		// forget about the subclass:
		ClassABC obj2 = new ClassABC();
		obj2.m2();	
	}
}
