package lab02;

public class ArrayTesting{
public static void main(String[] args) {
  int[] testArray = new int[10];
  for (int i = 0; i < testArray.length ;i++) {
    System.out.println(testArray[i]);
  }
  int sum = 0;
  for (int k = 0; k < testArray.length ; k++ ) {
    sum = sum + testArray[k];
  }
  System.out.println(sum);
}
}
