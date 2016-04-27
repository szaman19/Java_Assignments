package lab03;
import java.util.Arrays;
import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    String[] arr = {"abc", null, "def", null, "hij"};

    // for (int i = 0; i < arr.length;i++ ) {
    //   try {
    //        Arrays.stringPrint(arr[i]);
    //     System.out.println(Arrays.stringLength(arr[i]));
    //   }catch (NullPointerException e) {
    //     System.out.println("There was a null pointer exception at index :" + i);
    //   }
    // }


    // int index = 0;
    // try {
    //   for (int i = 0; i < arr.length ;i++ ) {
    //     index = i;
    //     Arrays.stringPrint(arr[i]);
    //     System.out.println(Arrays.stringLength(arr[i]));
    //   }
    // }catch (NullPointerException e) {
    //   System.out.println("There was a null pointer and the program stopped at index: " + index);
    // }

    try {
      System.out.println(arr[arr.length]);
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }

    try {
      System.out.println(arr[2].charAt(arr[2].length()));
    }catch (StringIndexOutOfBoundsException e) {
      System.out.println(e);
    }

    String test = " HEEEEL OOOO WASASDASDSAD";
    ArrayList <String> testArrayList = Functions.splitOnSpaces(test);
    ArrayList <Integer> testArrayList2 = Functions.strLengths(test);
    System.out.println(Arrays.toString(testArrayList.toArray()));
    System.out.println(Arrays.toString(testArrayList2.toArray()));



  }
}
