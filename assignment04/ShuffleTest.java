package assignment04;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShuffleTest{
  public static void main(String[] args) {
    try (Scanner kbd = new Scanner(System.in);
  	PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)))) {
  	int count = 15;
  	System.out.println("How many elements should the test have? (default is 15)");
  	String str = kbd.nextLine();
  	Scanner scan = new Scanner(str);
  	if(scan.hasNextInt()) {
  		count = scan.nextInt();
  	}
  	scan.close();
  	output.println("Number of elements = " + count);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int countIndex = 0; countIndex < count;countIndex++) {
      nums.add(countIndex);
    }
    //System.out.println(nums.toString());
    int [][] counter = new int[count][count];
    for (int testCases = 0; testCases < 100 ; testCases ++) {
      Collections.shuffle(nums);
      //System.out.println(nums.toString());
      for (int i = 0; i < count ;i++) {
        int j = nums.indexOf(i);
        counter [i][j] = counter [i][j] + 1;
      }
    }
    double total = 0.0;
    for (int row = 0;row < counter.length ; row++) {
      for (int col = 0; col < counter[0].length ;col++ ) {
        total += counter[row][col];
      }
    }

    //System.out.println(Arrays.deepToString(counter));
  	 double mean = total / (count * count);
  	 System.out.println(mean);
  	 output.println("Mean = " + mean);
     double variance = 0.0;
     for (int x = 0;x < counter.length;x++) {
       for (int y = 0;y<counter[0].length;y++) {
         variance = variance + ((counter[x][y]-mean) *(counter[x][y]-mean));
       }
     }
     double sDev = Math.sqrt(variance / (count * count));
     System.out.println(sDev);
  	 output.println("Standard Deviation = " + sDev);
  } catch (IOException e) {
  	System.out.println("IO exception");
  }
  }
}
