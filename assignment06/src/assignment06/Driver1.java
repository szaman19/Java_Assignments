package assignment06;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// make an ArrayList<Box> list with 5 Box elements
				ArrayList<Box> list = new ArrayList<Box>();
				Box box1 = new Box();
				box1.setColor(Color.YELLOW);
				box1.setBox(new Rectangle2D.Double(0.0,0.0,10.0,20.0));
				list.add(box1);
				
				Box box2 = new Box();
				box2.setColor(Color.YELLOW);
				box2.setBox(new Rectangle2D.Double(0.0,0.0,20.0,40.0));
				list.add(box2);
				
				Box box3 = new Box();
				box3.setColor(Color.YELLOW);
				box3.setBox(new Rectangle2D.Double(0.0,0.0,30.0,60.0));
				list.add(box3);
				
				Box box4 = new Box();
				box4.setColor(Color.YELLOW);
				box4.setBox(new Rectangle2D.Double(0.0,0.0,40.0,80.0));
				list.add(box4);
				Graphic g = new Graphic("Shehtab");
				g.setList(list);
			}
		});


	}

}
