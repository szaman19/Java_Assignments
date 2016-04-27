package lab03;

import java.util.ArrayList;

public class Functions{
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
  public static ArrayList<String> splitOnSpaces(String str){
    ArrayList <String> returnVal = new ArrayList();
    int len = countSpaces(withoutExtraSpaces(str));
    if (len >=0) {
      for (int i = 0; i < len + 1; i++ ) {
        returnVal.add(first(str));
        str = rest(str);
      }
    }
    return returnVal;
  }

  public static ArrayList<Integer> strLengths(String str){
    ArrayList<Integer> returnVal = new ArrayList();
    if (str != null) {
      ArrayList <String> tempArrayList = splitOnSpaces(str);
      if (tempArrayList.size() >0) {
        for (int i = 0; i < tempArrayList.size(); i++ ) {
          String temp = tempArrayList.get(i);
          returnVal.add(temp.length());
        }
      }
    }
    return returnVal;
  }
}
