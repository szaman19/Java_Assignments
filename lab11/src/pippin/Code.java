package pippin;

public class Code {
	public static int CODE_MAX = 256;
	private long[] code = new long[CODE_MAX];
	private int nextCodeIndex = 0;
	
	public static long join (int opPart, int arg) {
		long longOp = opPart;
		long longArg = arg;
		// move the opcode to the upper 32 bits
		longOp = longOp << 32;
		// if arg was negative, longArg will have 32 leading 1s,
		// remove them:
		longArg = longArg & 0x00000000FFFFFFFFL;
		//join the upper 32 bits and the lower 32 bits
		return longOp | longArg;		
	}
	
	public void setCode(int op, int arg){
		if(nextCodeIndex >= CODE_MAX){
			throw new CodeAccessException("Cannot set Code.");
		}else{
			long temp = join(op,arg);
			code[nextCodeIndex++] = temp;
		}
	}
	
	public int getProgramSize(){
		return nextCodeIndex;
	}
	
	public int getOpPart(int i){
		if(i < 0 || i >= nextCodeIndex){
			throw new CodeAccessException("Incorrect index for Operation");
		}else{
			return (int)(code[i] >> 32);
		}
		
	}
	
	public int getArg(int i){
		if(i < 0 || i >= nextCodeIndex){
			throw new CodeAccessException("Incorrect index for Operation");
		}else{
			return (int)(code[i]);
		}
	}
	
	public void clear(){
		nextCodeIndex = 0;
		code = new long[CODE_MAX];
	}
	// Back to the class Code. Add a method getText(int i) that returns a String. 
	//If 0 <= i < nextCodeIndex, the return value is InstructionMap.mnemonics.get(getOpPart(i)) + a space + getArg(i). 
	//Otherwise it is the empty String.
	
	public String getText(int i){
		String returnVal = "";
		if(i >= 0 && i < nextCodeIndex){
			returnVal = InstructionMap.mnemonics.get(getOpPart(i)) + " " + getArg(i);
		}
		return returnVal;
	}

}
