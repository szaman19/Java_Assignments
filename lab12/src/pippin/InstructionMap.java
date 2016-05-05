package pippin;

import java.util.Map;
import java.util.TreeMap;

public class InstructionMap {
	public static Map <String, Integer> opcode = new TreeMap <String, Integer>();
	public static Map <Integer, String> mnemonics = new TreeMap <Integer, String>();
	
	static{
		opcode.put("NOP",0x0 );
		opcode.put("LOD",0x1 );
		opcode.put("STO",0x2 );
		opcode.put("JUMP",0x3 );
		opcode.put("JMPZ",0x4 );
		opcode.put("ADD",0x5 );
		opcode.put("SUB",0x6 );
		opcode.put("MUL",0x7 );
		opcode.put("DIV",0x8 );
		opcode.put("AND",0x9 );
		opcode.put("NOT",0xA );
		opcode.put("CMPL",0xB );
		opcode.put("CMPZ",0xC );
		opcode.put("HALT",0xF );
		
		//Lab 11
		//Back to InstructionMap. We need an inverse Map from Integer to String called mnemonics. 
		//After populating opcode create mnemonics using an enhanced for loop over each key in the 
		//keySet of opcode that gives the the key opcode.get(key) the value key.
		
		for(String key: opcode.keySet()){
			mnemonics.put(opcode.get(key),key);
		}
	}

}
