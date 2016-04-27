package exam02;

public class Parent {
	private String pName; 
	
	private int pNum = 0;
	
	public Parent (String pName){
		this.pName = pName;
	}
	
	public void m1(){
		System.out.println(pName);
	}
	void m2(){
		System.out.println("Parent"+pNum);
	}
}
