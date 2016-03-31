package assignment05;

public class ProblemOneDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.setpName("Tom");
		p.print();
		p = new Child(); 
		p.setpName("Dick"); 
		((Child)p).setcName("Harry"); 
		p.print(); 
	}

}
