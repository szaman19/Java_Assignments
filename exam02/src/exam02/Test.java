package exam02;

public class Test {
	public static void main(String[] args){
		Parent p = new Parent("Parent");
		p.m1();
		p.m2();
		
		Child c = new Child("Parent","Child");
		c.m1();
		c.m2();
	}

}
