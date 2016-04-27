package lab05;

import java.awt.Rectangle;

public class TextBoxes {
	private TextBox[] boxes;
	private int nextIndex;

	/**
	 * @param boxes
	 */
	public TextBoxes(TextBox[] boxes) {
		this.boxes = boxes;
	}
	/**
	 * 
	 * @param boxes
	 * @param nextIndex
	 */
	public TextBoxes(TextBox[] boxes, int nextIndex) {
		if(boxes == null && nextIndex != 0){
			throw new IllegalArgumentException("Index has to be lower than length of array");
		}else if(nextIndex > boxes.length || nextIndex < 0){
			throw new IllegalArgumentException("Index has to be lower than length of array");
			
		}else{
			this.boxes = boxes;
			this.nextIndex = nextIndex;
		}
	}
	/**
	 * 
	 * @param n
	 */
	public TextBoxes(int n){
		if(n >= 0){
			boxes = new TextBox[n];
			nextIndex = 0;
		}else{
			throw new IllegalArgumentException("Parameter cannot be negative");
		}
	}
	/**
	 * Adds TextBox t into the array boxes as long as nextIndex < boxes.length 
	 * and t is not null;
	 * @param t
	 * @return true if t is added to boxes and false otherwise; 
	 */
	public boolean addTextBox(TextBox t){
		boolean returnVal;
		if(nextIndex > boxes.length){
			returnVal = false;
		}else {
			returnVal = false;
			if(t != null){
				boxes[nextIndex] = t;
				nextIndex++;
				returnVal = true;
			}
		}
		return returnVal;
	}
	/**
	 * Returns the rectangle object of the TextBox which has the largest string
	 * length. 
	 * @return Rectangle temp
	 */
	public Rectangle longestText(){
		Rectangle temp = null;
		TextBox maxBox = null;
		if(boxes != null){
			if(boxes.length > 0){
				maxBox = boxes[0];
				for(TextBox t: boxes ){
					if(t != null && t.getText().length() > maxBox.getText().length()){
						maxBox = t;
						temp = maxBox.getRectangle();
					}
				}
			}
		}
		return temp;
	}
	public String largestArea(){
		String temp = null;
		TextBox maxBox = null;
		if(boxes != null){
			if(boxes.length > 0){
				maxBox = boxes[0];
				for(TextBox t: boxes){
					if(t!= null && t.getArea() > maxBox.getArea()){
						maxBox = t;
						temp = maxBox.getText();
					}
				}
			}
		}
		return temp;
	}
}
