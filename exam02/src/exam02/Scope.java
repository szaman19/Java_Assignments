package exam02;

public class Scope {
	private int a = 0;
	private static int b = 1;
	
	public Scope(){
		
	}
	
	public static void main(String[] args){
		//Visible variables b 
		System.out.println("Visible variables");
		System.out.println(b);
		System.out.println(args);
	}
}
