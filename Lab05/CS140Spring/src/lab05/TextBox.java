package lab05;

import java.awt.Rectangle;

public class TextBox {
	private Rectangle box;
	private String text;
	
	/**
	 * @param box
	 * @param text
	 */
	public TextBox(Rectangle box, String text) {
		this.box = box;
		this.text = text;
	}
	/**
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}
	/**
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * 
	 * @return
	 */
	public double getWidth() {
		return box.getWidth();
	}
	/**
	 * 
	 * @return
	 */
	public double getHeight() {
		return box.getHeight();
	}
	public double getArea(){
		return box.width * box.height;
	}
	/**
	 * 
	 * @return
	 */
	public Rectangle getRectangle(){
		return box;
	}


}
