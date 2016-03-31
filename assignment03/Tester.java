package assignment03;
import java.util.ArrayList;

public class Tester{
  public static void main(String[] args) {
    Elevator test = new Elevator(10,2,10);
    // System.out.println(test.getNumFloors());
    // System.out.println(test.getCurrentDir());
    // System.out.println(test.getCurrentFloor());
    Line line = new Line("G",test);
    Passenger testPass = new Passenger("7",test);
    line.getLine().add(testPass);
    line.loadElevator();
    System.out.println("Number of applicants: 1");

    System.out.println(test.getNumOccupants());

    System.out.println("Building stories and floors");
    String [] floorNames = new String[10];
    for (int i = 0; i < 10; i++ ) {
      //System.out.println(test.getFloorName(i));
      floorNames[i] = test.getFloorName(i);
    }
    for (String a : floorNames) {
      System.out.println(a+" ---> "+test.getFloorIndex(a));
    }

    System.out.println("Expected Value: 0");
    System.out.println(test.getFloorIndex("B2"));
    System.out.println("Expected Value: 2");
    System.out.println(test.getFloorIndex("G"));
    System.out.println("Expected Value: 9");
    System.out.println(test.getFloorIndex("8"));
    System.out.println("Expected Value: B2");
    System.out.println(test.getFloorName(0));
    System.out.println("Expected Value: G");
    System.out.println(test.getFloorName(2));
    System.out.println("Expected Value: 8");
    System.out.println(test.getFloorName(9));


  }
}
