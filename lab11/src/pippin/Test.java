package pippin;

public class Test {
	public static void main(String[]args){
//		Instruction.checkParity(0);
		System.out.println(Integer.toUnsignedString(0, 2));
		System.out.println(Integer.toUnsignedString(1, 2));
		System.out.println(Integer.toUnsignedString(2, 2));
		System.out.println(Integer.toUnsignedString(3, 2));
		System.out.println(Instruction.numOnes(0));
		System.out.println(Instruction.numOnes(1));
		System.out.println(Instruction.numOnes(2));
		System.out.println(Instruction.numOnes(3));
		
		Instruction.checkParity(2);
	}

}
