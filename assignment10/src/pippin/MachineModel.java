package pippin;

public class MachineModel {
	private class CPU{
		private int accum, pc;
	}

	public final Instruction[] INSTRUCTIONS = new Instruction[0x10];
	private CPU cpu = new CPU ();
	private Memory memory = new Memory();
	private boolean withGUI = false;

	public MachineModel(boolean withGUI){
		this.withGUI = withGUI;

		//INSTRUCTION_MAP entry for "NOP"
		INSTRUCTIONS [0] = (args, flags) ->{
			flags = flags & 0x6;
			if(flags != 0){
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;
		};
		//LOD (load accumulator), index in INSTRUCTIONS is 0x1. For direct addressing puts the value memory.getData(arg) 
		//in cpu.accum; for immediate addressing puts arg in cpu.accum; for indirect addressing puts the value 
		//memory.getData(memory.getData(arg)) in cpu.accum. The other value of flags causes IllegalInstructionException

		INSTRUCTIONS[0x1] = (arg, flags) -> {
			flags = flags & 0x6; 
			if(flags == 0){ // direct addressing
				cpu.accum = memory.getData(arg);

			}else if (flags == 2){ // immediate addressing
				cpu.accum = arg;
			}else if(flags == 4){ // indirect addressing
				cpu.accum = memory.getData(memory.getData(arg));
			}else{
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}cpu.pc++;
		};
		//		STO (store accumulator in memory), index in INSTRUCTIONS is 0x2. 
		//		For direct addressing puts the value cpu.accum in memory at index arg using setData ;
		//		immediate addressing is not legal and is handled in the else part; 
		//		for indirect addressing puts the value cpu.accum in memory at index memory.getData(arg) using setData. 
		//		Any other values of flags cause IllegalInstructionException 
		INSTRUCTIONS[0x2] = (arg, flags) -> {
			flags = flags & 0x6;

			if(flags ==0 ){ //direct
				memory.setData(arg, cpu.accum);
			}
			else if(flags ==4){ //indirect addressing
				memory.setData(memory.getData(arg), cpu.accum);

			}else{
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);

			}
			cpu.pc++;
		};
		//		JUMP (jump the program counter to a new location in the code), index in INSTRUCTIONS is 0x3. 
		//		For direct addressing adds the value arg to cpu.pc (this is a relative jump); 
		//		for immediate addressing puts arg in cpu.pc (this is an absolute jump); 
		//		for indirect addressing adds the value memory.getData(arg) to cpu.pc. 
		//		For the other value of flags (actually it is 6) put value memory.getData(arg) in cpu.pc.
		INSTRUCTIONS[0x3] = (arg, flags) ->{
			flags = flags & 0x6;

			if(flags == 0){
				cpu.pc += arg;
			}else if (flags == 2){
				cpu.pc = arg;
			}else if (flags == 4){
				cpu.pc += memory.getData(arg);
			}else {
				cpu.pc = memory.getData(arg);
			}
//			cpu.pc++;
		};
		//		JMPZ (conditionally jump the program counter to a new location in the code), 
		//		  index in INSTRUCTIONS is 0x4. Does all the things JUMP does if cpu.accum is zero and otherwise increments cpu.pc
		INSTRUCTIONS[0x4] = (arg, flags) ->{
			flags = flags & 0x6;
			if(cpu.accum == 0){
				if(flags == 0){
					cpu.pc += arg;
				}else if (flags == 2){
					cpu.pc = arg;
				}else if (flags == 4){
					cpu.pc += memory.getData(arg);
				}else {
					cpu.pc = memory.getData(arg);
				}
			}else{
				cpu.pc++;
			}
			
		};


		//INSTRUCTION entry for ADD (add)
		INSTRUCTIONS[0x5] = (arg, flags) -> {
			flags = flags & 0x6; // remove parity bit that will have been verified
			if(flags == 0) { // direct addressing
				cpu.accum += memory.getData(arg);
			} else if(flags == 2) { // immediate addressing
				cpu.accum += arg;
			} else if(flags == 4) { // indirect addressing
				cpu.accum += memory.getData(memory.getData(arg));				
			} else { // here the illegal case is "11"
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;			
		};

		//INSTRUCTION entry for SUB (subtract)
		INSTRUCTIONS[0x6] = (arg, flags) -> {
			flags = flags & 0x6; // remove parity bit that will have been verified
			if(flags == 0) { // direct addressing
				cpu.accum -= memory.getData(arg);
			} else if(flags == 2) { // immediate addressing
				cpu.accum -= arg;
			} else if(flags == 4) { // indirect addressing
				cpu.accum -= memory.getData(memory.getData(arg));				
			} else { // here the illegal case is "11"
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;			
		};
		//INSTRUCTION entry for MUL (multiply)
		INSTRUCTIONS[0x7] = (arg, flags) -> {
			flags = flags & 0x6; // remove parity bit that will have been verified
			if(flags == 0) { // direct addressing
				cpu.accum *= memory.getData(arg);
			} else if(flags == 2) { // immediate addressing
				cpu.accum *= arg;
			} else if(flags == 4) { // indirect addressing
				cpu.accum *= memory.getData(memory.getData(arg));				
			} else { // here the illegal case is "11"
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;			
		};
		//INSTRUCTION entry for DIV (divide)
		INSTRUCTIONS[0x8] = (arg, flags) -> {
			flags = flags & 0x6; // remove parity bit that will have been verified
			if(flags == 0) { // direct addressing
				if(memory.getData(arg) !=0){
					cpu.accum /= memory.getData(arg);
				}else{
					throw new DivideByZeroException("Division By Zero");
				}

			} else if(flags == 2) { // immediate addressing
				if(arg != 0){
					cpu.accum /= arg;
				}else{
					throw new DivideByZeroException("Division By Zero");
				}

			} else if(flags == 4) { // indirect addressing

				if(memory.getData(memory.getData(arg)) == 0){
					throw new DivideByZeroException("Division By Zero");
				}else{
					cpu.accum /= memory.getData(memory.getData(arg));
				}

			} else { // here the illegal case is "11"
				String fString = "(" + (flags%8 > 3?"1":"0") 
						+ (flags%4 > 1?"1":"0") + ")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;			
		};
		//Future Instructions

		INSTRUCTIONS[0x9] = (arg, flags)->{
			flags = flags & 0x6;

			if (flags ==0){ //direct addressing
				if(cpu.accum != 0 && memory.getData(arg) != 0){
					cpu.accum = 1; 
				}else{
					cpu.accum = 0;
				}
			} else if(flags ==2){ //immediate addressing
				if(cpu.accum != 0 && arg != 0){
					cpu.accum = 1;
				}else{
					cpu.accum = 0;
				}

			}else{
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;
		};

		INSTRUCTIONS[0xA] = (arg, flags) ->{
			flags = flags & 0x6;
			//Is in the case of NOP, all flags must be 0 to avoid an exception. 
			//if the accumulator is 0, set it to 1, otherwise set it to 0. Increment the program counter.

			if(flags == 0){
				if(cpu.accum == 0){
					cpu.accum = 1;
				}else{
					cpu.accum = 0;
				}
			}else{
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;
		};
		//CMPL (compare less than 0), index in INSTRUCTIONS is 0xB. As in the case of NOP, all flags must be 0 to avoid an exception.
		//if memory.getData(arg) is less than 0, set it the accumulator to 1, otherwise set it to 0. Increment the program counter.

		INSTRUCTIONS[0xB] = (arg, flags) -> {
			flags = flags & 0x6; 

			if (flags == 0){
				if(memory.getData(arg) < 0){
					cpu.accum = 1;
				}else{
					cpu.accum = 0;
				}

			}else{
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}
			cpu.pc++;

		};

		//CMPZ (compare to 0), index in INSTRUCTIONS is 0xC. As in the case of NOP, all flags must be 0 to avoid an exception.
		//if memory.getData(arg) is 0, set it the accumulator to 1, otherwise set it to 0. Increment the program counter.

		INSTRUCTIONS [0xC] = (arg, flags) ->{
			flags = flags & 0x6;
			if(flags != 0){
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}else{
				if(memory.getData(arg) ==0){
					cpu.accum = 1;
				}else{
					cpu.accum = 0;
				}

			}
			cpu.pc++;
		};

		//INSTRUCTION_MAP entry for "HALT"
		INSTRUCTIONS [0xF] = (args, flags) ->{
			flags = flags & 0x6;
			if(flags != 0){
				String fString = "(" + (flags %8 > 3?"1":"0")+
						(flags %4 > 1?"1":"0")+")";
				throw new IllegalInstructionException(
						"Illegal flags for this instruction: " + fString);
			}else{
				halt();
			}
			cpu.pc++;
		};



	}
	public void halt(){
		if(!withGUI){
			System.exit(0);
		}
	}
	public void setData(int i, int j) {
		memory.setData(i, j);		
	}
	public Instruction get(int i) {
		return INSTRUCTIONS[i];
	}
	int[] getData() {
		return memory.getData();
	}
	public int getPC() {
		return cpu.pc;
	}
	public int getAccum() {
		return cpu.accum;
	}
	public void setAccum(int i) {
		cpu.accum = i;
	}

}
