package lab07;

public class Editor {
	private Buffer writer; 
	private StatusBar status;
	public Editor(Buffer writer) {
		this.writer = writer;
		status = new StatusBar(writer);
	} 
	public void draw(){
		writer.draw();
		status.draw();
	}
	public void save(){
		writer.save();
	}
	public void type(String str){
		writer.type(str);
	}
	
}
