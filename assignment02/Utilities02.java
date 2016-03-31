package assignment02;
import java.util.Arrays;

public class Utilities02{

  public static int countNulls(Object[] array ){
    int nulls = 0;
    for (Object a: array){
      if (a == null){
        nulls++;
      }
    }
    return nulls;
  }

  public static int countSpaces(String str){
    int count = -1;
    if(str != null){
      count = 0;
      for (int i = 0;i < str.length();i++) {
        if (str.charAt(i) == ' ') {
          count++;
        }
      }
    }
    return count;
  }

  public static String first(String str){
    String returnVal = null;
    if(str != null) {
      returnVal = str.trim();
      int i = returnVal.indexOf(' ');

      if (i >= 0) {
        returnVal = returnVal.substring(0,i);
          }
        }
    return returnVal;
  }

  public static String rest(String str) {
    String returnVal = null;
    if (str != null) {
      returnVal = str.trim();
      int i = returnVal.indexOf(' ');
      if (i >=0) {
        returnVal = returnVal.substring(i+1).trim();
      }else{
        returnVal = "";
      }
    }
    return returnVal;
  }

  public static String withoutExtraSpaces(String str){  
   String returnVal = null;
   if(str != null) {
    returnVal = str.trim();
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

  public static String[] splitOnSpaces(String str){
    String [] returnVal = null;
    int len = countSpaces(withoutExtraSpaces(str));
    if(len >= 0) {
      returnVal = new String[len + 1];
      for (int i = 0; i < returnVal.length; i++ ) {
        returnVal[i] = first(str);
        str = rest(str);
      }
    }
    return returnVal;
  }

  public static int[] strLengths(String str){
    int[] returnVal = null;
    if (str != null) {
      String[] tempArray = splitOnSpaces(str);
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

  public static String[] splitOnSpaces1(String str){
    String[] returnVal = null;
    if (str != null) {
      returnVal = new String[str.length()];
      int index = 0;
      while(str.length() != 0){
        returnVal[index] = first(str);
        str = rest(str);
        index++;
        }
      returnVal = Arrays.copyOf(returnVal,index);
      }
    return returnVal;
    }
}
