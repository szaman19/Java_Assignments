package lab05;

import static org.junit.Assert.*;

import java.awt.Rectangle;

import org.junit.Test;

public class LongestTextTester {

	@Test
	public void test() {
		Rectangle test = new Rectangle(3,4);
		Rectangle test2 = new Rectangle(4,4);
		Rectangle test3 = new Rectangle(5,4);
		Rectangle test4 = new Rectangle(6,4);
	
		TextBox box1 = new TextBox(test,"testone");
		TextBox box2 = new TextBox(test2,"testtwo");
		TextBox box3 = new TextBox(test3,"testthree");
		TextBox box4 = new TextBox(test4,"testfour");
		
		TextBox[] testArray = {box1,box2,box3,box4};
		TextBoxes boxes1 = new TextBoxes(testArray);
		
		assertEquals(test3,boxes1.longestText());
		
	}
	@Test
	public void test2(){
		TextBoxes boxes = new TextBoxes(0);
		assertEquals(null,boxes.longestText());
	}
	
	@Test
	public void test3(){
		TextBoxes boxes = new TextBoxes(10);
		assertEquals(null,boxes.longestText());
	}

}
