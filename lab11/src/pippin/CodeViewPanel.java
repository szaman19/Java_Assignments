package pippin;

import java.util.Observable;
import java.util.Observer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class CodeViewPanel implements Observer {
	private MachineView machineView;
	private Code code;
	private JScrollPane scroller;
	private JTextField[] codeText = new JTextField[code.CODE_MAX];
	private int previousColor = -1;
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
