package pippin;

public interface Instruction {
	void execute(int arg, int flags);
	
	static int numOnes(int input){
		int returnVal = 0;
		String binary = Integer.toUnsignedString(input,2);
		
		for(char C: binary.toCharArray()){
			if(C =='1'){
				returnVal++;
			}
		}
		return returnVal;
	}
	
	static void checkParity(int input){
		int numOnes = numOnes(input);
		if(numOnes % 2 == 1){
			throw new ParityCheckException("This is instruction is corrputed");
		}
	}
}
