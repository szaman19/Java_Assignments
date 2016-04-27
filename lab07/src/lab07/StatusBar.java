package lab07;

public class StatusBar extends Buffer {
	private Buffer attachedTo;

	public StatusBar(Buffer attachedTo) {
		this.attachedTo = attachedTo;
	}
	@Override
	public String getText(){
		return "---------"+attachedTo.lines+"-----------";
	}
	
}
