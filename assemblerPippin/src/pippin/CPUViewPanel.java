package pippin;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CPUViewPanel implements Observer {
	
	
	/*The private fields are machineView and two JTextFields called acc and pc, both instantiated as new JTextFields().
	 * The constructor is similar to that of CodeViewPanel.
	 * Copy the content and update from this link. 
	 * PLEASE CHANGE getProgramCounter to getPC, getAccumulator to getAccum. and createProcessorDisplay to createCPUDisplay
	 * In createAndShowGUI of MachineViewPanel, after memoryViewPanel3 = new MemoryViewPanel(this, 240, Memory.DATA_SIZE), put
	 * 		cpuViewPanel = new CPUViewPanel(this);
	 * After center.add(memoryViewPanel3.create...) put
	 * 	frame.add(cpuViewPanel.createCPUDisplay(),BorderLayout.PAGE_START);
	 */
	private MachineView machineView;
	private JTextField acc = new JTextField();
	private JTextField pc = new JTextField();
	
	public CPUViewPanel(MachineView machineView){
		this.machineView = machineView;
		machineView.addObserver(this);
	}
	public JComponent createCPUDisplay() {
		JPanel returnPanel = new JPanel();
		returnPanel.setLayout(new GridLayout(1,0));
		returnPanel.add(new JLabel("Accumulator: ", JLabel.RIGHT));
		returnPanel.add(acc);
		returnPanel.add(new JLabel("Program Counter: ", JLabel.RIGHT));
		returnPanel.add(pc);
		return returnPanel;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(machineView != null) {
			acc.setText("" + machineView.getAccum());
			pc.setText("" + machineView.getPC());
		}
	}

}
