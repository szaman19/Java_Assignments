package pippin;

public class Memory {
	public static final int DATA_SIZE = 512; 
	private int changedIndex = -1;
	private int [] data = new int[DATA_SIZE];
	
	int [] getData(){
		return data;
	}
	
	public int getData(int index){
		return data[index];
	}
	
	public void setData(int index, int value){
		data[index] = value;
		changedIndex = index;
	}
	public void clear(){
		for (int i = 0; i < DATA_SIZE; i++){
			data[i] = 0;
		}
		changedIndex = -1;
	}
	
	//lab 11

	//In Memory, add a private int field changedIndex, initially -1. 
	//In setData, add the line changedIndex = index, in the clear method set changedIndex to -1. Provide a getter method for changedIndex.

	public int getChangedIndex(){
		return changedIndex;
	}
}
