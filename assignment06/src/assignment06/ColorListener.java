package assignment06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

public class ColorListener implements ActionListener {
	private Graphic g;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color newColor = JColorChooser.showDialog(g.getFrame(), "Select New Color", Color.GREEN);
		for (Box b : g.getList()){
			b.setColor(newColor);
		}
		g.callRepaint();
	}
	public ColorListener(Graphic g){
		this.g= g; 
	}

}
