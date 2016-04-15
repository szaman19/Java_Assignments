package pippin;

public class IllegalInstructionException extends RuntimeException{
	public IllegalInstructionException(){
		super();
	}
	public IllegalInstructionException(String message){
		super(message);
	}
}
