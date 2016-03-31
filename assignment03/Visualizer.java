package assignment03;
import java.util.ArrayList;

public class Visualizer{
  public static void showElevator(Elevator e){
      for (int i = e.getNumFloors()-1;i>0;i-- ) {
        Line tempLine = e.getLines().get(i);
        ArrayList<Passenger> tempPassList = new ArrayList();
        if (tempLine != null) {
          tempPassList = tempLine.getLine();
        }

        if (i ==e.getCurrentFloor()) {
          System.out.println(e.getFloorName(i)+"\t\t"+e.getNumOccupants()+"\t\t"+tempPassList);
        }else{
          System.out.println(e.getFloorName(i)+"\t\t0"+"\t\t"+tempPassList);
        }
      }
      System.out.println("+++++++++++++++++++++++++++++++");
  }
  public static void main(String[] args) {
    Elevator test = new Elevator(15,5,10);

    Line testLine = new Line("G",test);
;

    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("7",test));
    testLine.getLine().add(new Passenger("3",test));
    testLine.getLine().add(new Passenger("3",test));
    testLine.getLine().add(new Passenger("3",test));
    testLine.getLine().add(new Passenger("B2",test));
    testLine.getLine().add(new Passenger("B2",test));
    testLine.getLine().add(new Passenger("B2",test));

    showElevator(test);
    testLine.loadElevator();
    for (int i = 0; i < 22; i ++ ) {
      showElevator(test);
      test.move();
    }
  }
}
