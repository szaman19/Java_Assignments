package assignment06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class RotateListener implements ActionListener {
	private Graphic graphic;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(Box b : graphic.getList()){
			Rectangle2D.Double r = b.getBox();
			r.setRect(0, 0, r.getHeight(), r.getWidth());
			b.setBox(r);
		}
		graphic.callRepaint();
	}
	public RotateListener(Graphic graphic) {
		this.graphic = graphic;
	}
	

}
