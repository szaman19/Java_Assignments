package assignment05;

public class Child extends Parent {
	private String cName;
	public void setcName(String name){
		cName = name;
	}
	public void print(){
		super.print();
		System.out.println(cName);
	}
}
