package lab07;

import java.util.List;

public class Buffer {
 protected List <String> lines;
 
 public int getNumlines(){
	 return lines.size();
 }
 public String getText(){
	 return String.join("\n", lines);
 }
 public void draw(){
	 System.out.println(this.getText());
 }
 public void save(){
	 throw new UnsupportedOperationException();
 }
 public void type(String toType){
	 for(int i =0; i < toType.length();i++){
		 if(toType.charAt(i)=='\n'){
			 lines.add("");
		 }else{
			 if(lines.size() == 0){
				 lines.add(""+toType.charAt(i));
			 }
			 lines.set(lines.size()-1, lines.get(lines.size()-1) + toType.charAt(i));
		 }
	 }
 }
}
