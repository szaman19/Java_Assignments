package assignment06;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class BoxArea extends JComponent {
	ArrayList<Box> list = new ArrayList<Box>();
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		int currentXoffset = 10;
		int currentYoffset = 10;
		for(Box box: list){
			g2.setColor(box.getColor());
			Rectangle2D.Double r = box.getBox();
			r.setRect(currentXoffset,currentYoffset,r.getWidth(),r.getHeight());
			g2.fill(r);
			g2.setColor(Color.BLACK);
			g2.draw(r);
			currentXoffset += r.getWidth() + 5; 
			currentYoffset += r.getHeight() + 5; 
		}
		
		
		
	}
	public ArrayList<Box> getList() {
		return list;
	}
	public void setList(ArrayList<Box> list) {
		this.list = list;
	}
	

}
