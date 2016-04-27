package lab07;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer writer;
		if(args.length > 0){
			 writer = new FileBuffer(args[0]);
		}else{
			 writer = new ScratchBuffer();
		}
		
		Editor editor = new Editor(writer);
		editor.type("\n HELLLO WORLD");
		editor.type("\n Add more");
		editor.draw();
		editor.save();

	}

}
