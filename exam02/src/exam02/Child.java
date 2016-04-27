package exam02;

public class Child extends Parent {
	private String cName;
	public Child(String pName, String cName) {
		super(pName);
		
		this.cName = cName;
		
		
	}
	
	@Override
	public void m1(){
		System.out.println(cName);
	}
	
	@Override 
	public void m2(){
		System.out.println("Child"+2);
		
	}

}
