package lab07;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ScratchBuffer extends Buffer {
	public ScratchBuffer(){
		ArrayList <String> empty = new ArrayList<String>();
		super.lines = empty;
	}
	@Override
	public void save(){
		try{
			Path filePath = Paths.get("Scratch.txt");
			try{
				Files.write(filePath,super.lines);
			}catch(Exception a){
				System.out.println(a);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
