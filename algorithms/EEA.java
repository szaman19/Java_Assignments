package algorhitms;

public class EEA{
  public static int GCD(int num1, int num2){
    int firstNum = num1;
    int secNum = num2;
    if(num1 < num2){
      firstNum = num1;
      secNum = num2;
    }
    int remainder = firstNum % secNum;
    while(remainder != 0){
      firstNum = secNum;
      secNum = remainder;
      remainder = firstNum % secNum;
    }
    return secNum;
  }
}
