package pippin;

public interface Instruction {
	void execute(int arg, int flags);
	
	static int numOnes(int i){
//		int returnVal = 0;
//		String binary = Integer.toUnsignedString(input,2);
//		
//		for(char C: binary.toCharArray()){
//			if(C =='1'){
//				returnVal++;
//			}
//		}
//		return returnVal;
		//Added in Assignment10
		i = i - ((i >>> 1) & 0x55555555);
		i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
		return (((i + (i >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;
	}
	
	static void checkParity(int input){
		int numOnes = numOnes(input);
		if(numOnes % 2 == 1){
			throw new ParityCheckException("This is instruction is corrputed");
		}
	}
}
