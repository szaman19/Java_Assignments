package pippin;

import java.util.Observable;
import java.util.Observer;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.Timer;

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
	
	public int getData(int i){
		return model.getData(i);
	}
	
	public void locateDefaultDirectory(){
		
	}
	public void loadPropertiesFile(){
		
	}
	public void createAndShowGUI(){
		
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
	public MachineView(boolean withGui){
		model = new MachineModel(withGui);
		locateDefaultDirectory();
		loadPropertiesFile();
		createAndShowGUI();
	}
	

}
