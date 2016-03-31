package assignment02;
import java.util.Arrays;
public class InstanceMethodVersion{

	private String string;
	public InstanceMethodVersion(String str) {
		string = str;
	}

	public int countSpaces(){// counts the spaces in the field string
		int count = -1;
    if(string != null){
      count = 0;
      for (int i = 0;i < string.length();i++) {
        if (string.charAt(i) == ' ') {
          count++;
        }
      }
    }
    return count;
	}

	public String withoutExtraSpaces(){ // returns a copy of the field string without the extra spaces
		String returnVal = null;
		if(string != null) {
		 returnVal = string.trim();
		 int len1 = 0;
		 int len2 = 0;
		 do {
			 len1 = returnVal.length();
			 returnVal = returnVal.replace("  "," ");
			 len2 = returnVal.length();
		 } while (len2 < len1);
		}
		return returnVal;
	}

	public String first(){ // returns the first word in the field string
		String returnVal = null;
		if(string != null) {
		  returnVal = string.trim();
		  int i = returnVal.indexOf(' ');

		  if (i >= 0) {
		    returnVal = returnVal.substring(0,i);
		      }
		    }
		return returnVal;
	}

	public String rest(){// returns the remainder of the field string removing the first word
		String returnVal = null;
	  if (string != null) {
	    returnVal = string.trim();
	    int i = returnVal.indexOf(' ');
	    if (i >=0) {
	      returnVal = returnVal.substring(i+1).trim();
	    }else{
	      returnVal = "";
	    }
	  }
	  return returnVal;
	}

	public String[] splitOnSpaces(){// returns an array of the words in the field string
		String [] returnVal = null;
		String str = string;
		InstanceMethodVersion temp = new InstanceMethodVersion(str);
		InstanceMethodVersion temp2 = new InstanceMethodVersion(temp.withoutExtraSpaces());
	  int len = temp2.countSpaces();
	  if(len >= 0) {
	    returnVal = new String[len + 1];
	    for (int i = 0; i < returnVal.length; i++ ) {
	      returnVal[i] = temp2.first();
	      string = temp2.rest();
				temp2 = new InstanceMethodVersion(temp2.rest());
	    }
	  }
	  return returnVal;
	}

	public int[] strLengths(){// returns an array of the lengths of the words in the field string
		int[] returnVal = null;
	  if (string != null) {
			String str = string;
			InstanceMethodVersion temp = new InstanceMethodVersion (str);
	    String[] tempArray = temp.splitOnSpaces();
	    returnVal = new int[0];
	    if (tempArray.length != 0) {
	      returnVal = new int[tempArray.length];
	      for (int i = 0; i < returnVal.length; i++) {
	        returnVal[i] = tempArray[i].length();
	      }
	    }
	  }
	  return returnVal;
	}

}
