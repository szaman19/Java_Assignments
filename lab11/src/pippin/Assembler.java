package pippin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assembler {
	public static Set<String> noArgument = new TreeSet<String>();
	//public static InstructionMap instructionMap = new InstructionMap();

	static{
		noArgument.add("HALT");
		noArgument.add("NOP");
		noArgument.add("NOT");
	}

	public static int assemble(File input, File output, StringBuilder error){
		int retVal = 0; 
		ArrayList<String> inputText = new ArrayList<String>();
		if(error == null){
			throw new IllegalArgumentException("Coding error: the error buffer is null");
		}
		//Input code
		try(Scanner inp = new Scanner(input)){
			int lineNum = 0;
			boolean blankLineFound = false;
			int firstBlankLineNum = 0;

			while(inp.hasNextLine() && retVal == 0){
				String line = inp.nextLine();

				if(line.trim().length() == 0){
					if(blankLineFound){
						error.append("Illegal blank line in the source file");
						retVal = firstBlankLineNum;
					}else{
						blankLineFound = true;
						firstBlankLineNum = lineNum;
					}
				}else{
					if(line.charAt(0) == ' ' || line.charAt(0)== '\t' ){
						error.append("Line starts with illegal white space");
						retVal = lineNum;
					}else{
						inputText.add(line.trim());
					}
				}
				lineNum++;
			}
			if(retVal != 0){
				return retVal;
			}
		}catch(FileNotFoundException e){
			error.append("Unable to open the assembled file");
			retVal = -1;
		}

		//Output code
		ArrayList<String> outputCode = new ArrayList<String>();
		for(int i = 0; i < inputText.size() && retVal ==0;i++){
			String[] parts = inputText.get(i).split("\\s+");
			//			if(parts.length > 2){
			//				error.append("Error on line " + (i+1) + ": illegal number of arguments");
			//			}else{
			//				if(parts.length == 1){
			//					if(!noArgument.contains(parts[0].toUpperCase())){
			//						error.append("Error on line " + (i+1)+": illegal mnemonic");
			//					}
			//					
			//				}else{
			//					if(!InstructionMap.opcode.containsKey(parts[0].toUpperCase())){
			//						error.append("Error on line " + (i+1)+": illegal mnemonic");
			//					}else{
			//						if(parts[0] != parts[0].toUpperCase()){
			//							error.append("Error on line "+ (i +1) + ": mnemonic must be upper case");
			//						}
			//					}
			//				}
			//			}

			if(! InstructionMap.opcode.containsKey(parts[0].toUpperCase())){
				error.append("Error on line " + (i+1)+": illegal mnemonic");
				System.out.println(parts[0].length());
				System.out.println(InstructionMap.opcode.containsKey(parts[0].toUpperCase()));
			}else if( parts[0].toUpperCase() != parts[0]){
				error.append("Error on line "+ (i +1) + ": mnemonic must be upper case");
			}else if(noArgument.contains(parts[0].toUpperCase())){
				if(parts.length > 1){
					error.append("Error on line "+(i+1)+ ": this mnemonic cannot take arguments");
				}else{
					int opPart = 8 * InstructionMap.opcode.get(parts[0]);
					opPart += Instruction.numOnes(opPart) % 2;
					outputCode.add(Integer.toString(opPart,16)+ " 0");
				}
			}else{
				if(parts.length > 2){
					error.append("Error on line "+ (i+1)+": this mnemonic has too many arguments");
				}else if (parts.length == 1){
					error.append("Error on line "+ (i+1)+": this mnemonic is missing arguments");
				}else{
					//						int arg = Integer.parseInt(parts[1],16);
					int flags = 0;
					char temp = parts[1].charAt(0);
					if(temp == '#'){
						flags = 2;
						parts[1] = parts[1].substring(1);
					}else if (temp == '@'){
						flags = 4;
						parts[1] = parts[1].substring(1);
					}else if (temp == '&'){
						flags = 6;
						parts[1] = parts[1].substring(1);
					}
					try{
						int arg = Integer.parseInt(parts[1],16);
						int opPart = 8 * InstructionMap.opcode.get(parts[0]) + flags;
						opPart += Instruction.numOnes(opPart) % 2;
						outputCode.add(Integer.toString(opPart,16) + " "+ Integer.toString(arg,16));
					}catch(NumberFormatException e){
						error.append("Error on line " + (i+1) + ": argument is not a hex number");
					}
				}
			}
		}

		if(retVal == 0){
			try(PrintWriter outp = new PrintWriter(output)){
				for(String str : outputCode){
					outp.println(str);
				}
				outp.close();
			}catch(FileNotFoundException e){
				error.append("Error: Unable to write the assembled program to the output file");
				retVal = -1;
			}
		}
		return retVal;
	}

	public static void main(String[] args) {
		StringBuilder error = new StringBuilder();
		System.out.println("Enter the name of the file without extension: ");
		try (Scanner keyboard = new Scanner(System.in)) {
			String filename = keyboard.nextLine();
			int i = assemble(new File(filename + ".pasm"), 
					new File(filename + ".pexe"), error);
			System.out.println(i + " " + error);
		}
	}
}
