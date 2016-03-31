package assignment03;

public class PassengerTester{
  public static void main(String[] args) {
    Elevator elev = new Elevator(10,2,20);
    Passenger test = new Passenger("6",elev);
    System.out.println(test);
  }
}
