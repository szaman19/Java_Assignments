package pippin;

import java.util.Observable;
import java.util.Observer;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;

public class MachineView extends Observable{
	static final int TICK = 500;
	private MachineModel model;
	private String defaultDir, sourceDir, dataDir, executableDir;
	private Properties properties;
	private CodeViewPanel codeViewPanel;
	private MemoryViewPanel memoryViewPanel1, memoryViewPanel2, memoryViewPanel3;
	private ControlPanel controlPanel;
	private CPUViewPanel cpuViewPanel;
	private MenuBarBuilder menuBarBuilder;
	private JFrame frame;
	private Timer timer;
	private States state;
	private File currentProgramFile, currentDataFile;
	private boolean running = false; 
	private boolean programLoaded = false; 
	private boolean noDataNeeded = false;
	private boolean autoStepOn = false;
	
	public boolean isAutoStepOn() {
		return autoStepOn;
	}

	public void setAutoStepOn(boolean autoStepOn) {
		this.autoStepOn = autoStepOn;
	}

	public States getState() {
		return state;
	}

	public void setRunning(boolean running) {
		this.running = running;
		if(running){
			state = States.PROGRAM_LOADED_NOT_AUTOSTEPPING;
		}else{
			autoStepOn = false;
			state = States.PROGRAM_HALTED;
		}
		state.enter();
		setChanged();
		notifyObservers();
	}

	public int getAccum(){
		return model.getAccum();
	}
	
	public int getChangedIndex(){
		return model.getChangedIndex();
	}
	public Code getCode(){
		return model.getCode();
	}
	public int getPC(){
		return model.getPC();
	}
	public int getData(int i){
		return model.getData(i);
	}
	
	public void locateDefaultDirectory(){
		
	}
	public void loadPropertiesFile(){
		
	}
	public void createAndShowGUI(){
		frame = new JFrame("Pippin Simulator");
		codeViewPanel = new CodeViewPanel(this);
		memoryViewPanel1 = new MemoryViewPanel(this, 0, 160);
		memoryViewPanel2 = new MemoryViewPanel(this, 160, 240);
		memoryViewPanel3 = new MemoryViewPanel(this, 240, Memory.DATA_SIZE);
		cpuViewPanel = new CPUViewPanel(this);
		controlPanel = new ControlPanel(this);
		menuBarBuilder = new MenuBarBuilder(this);
		
		frame.add(codeViewPanel.createCodeDisplay(),BorderLayout.LINE_START);
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1,3));
		frame.add(center,BorderLayout.CENTER);
		center.add(memoryViewPanel1.createMemoryDisplay());
		center.add(memoryViewPanel2.createMemoryDisplay());
		center.add(memoryViewPanel3.createMemoryDisplay());
		frame.add(cpuViewPanel.createCPUDisplay(),BorderLayout.PAGE_START);
		frame.add(controlPanel.createControlDisplay(),BorderLayout.PAGE_END);
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		bar.add(menuBarBuilder.createFileMenu());
		bar.add(menuBarBuilder.createExecuteMenu());
		
		frame.setSize(1200,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public void clearAll(){
		model.clear();
		programLoaded = false;
		noDataNeeded = false;
		state = States.NOTHING_LOADED;
		state.enter();
		setChanged();
		notifyObservers("Clear");
	}
	public void halt(){
		setRunning(false);
	}
	public void setPeriod(int period){
		if(timer != null){
			timer.setDelay(period);
		}
	}
	public MachineView(MachineModel model){
		this.model = model;
		locateDefaultDirectory();
		loadPropertiesFile();
		createAndShowGUI();
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MachineView(new MachineModel(true)); 
			}
		});
	}
	

}
