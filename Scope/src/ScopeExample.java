
public class ScopeExample {
	private double instanceField1 = 1.0;
	private static double classField1 = 2.0;
	public static final String constantField = "CONSTANT";
	
	public ScopeExample(){
		System.out.println("CONSTRUCTOR FIELD VISIBILITY");
		System.out.println("InstanceField1 : "+instanceField1);
		System.out.println("ConstantField1 : "+constantField);
		System.out.println("ClassField1: "+classField1);
		System.out.println("_________________________________________");
	}
	
	public void method1(int parameter1, String parameter2){
		System.out.println("METHOD1 CLASS FIELD VISIBILITY");
		System.out.println("InstanceField1 : "+instanceField1);
		System.out.println("ConstantField1 : "+constantField);
		System.out.println("ClassField1: "+classField1);
		System.out.println("IntParam1: " + parameter1);
		System.out.println("StringParam2: " + parameter2);
		System.out.println("_________________________________________");
		
	}
	public static void method2(int parameter1){
		double instanceField1 = 0.0;
	}
	public static void main(String[] args){
		ScopeExample example = new ScopeExample();
		example.method1(1, "String param");
	}
	
	
}
