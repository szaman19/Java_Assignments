package lab07;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileBuffer extends Buffer {
	private String fileName;
	
	public FileBuffer(String fileName){
		super();
		this.fileName = fileName;
		Path filePath = Paths.get(fileName);
		try{
			List<String> text = Files.readAllLines(filePath);
			super.lines = text;
		}catch(Exception E){
			ArrayList<String> empty = new ArrayList<String>();
			super.lines = empty;
		}		
	}
	@Override
	public void save(){
		try{
			Path filePath = Paths.get(fileName);
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
