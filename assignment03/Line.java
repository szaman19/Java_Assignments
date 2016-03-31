package assignment03;
import java.util.ArrayList;

public class Line{
  private String floor;
  private Elevator elevator;
  private ArrayList <Passenger> line = new ArrayList();

  public Line(String flr, Elevator elev){
    floor = flr;
    elevator = elev;
    elev.addLine(flr,this);
  }
  public ArrayList <Passenger> getLine(){
    return line;
  }
  public void loadElevator(){
    int thisFloor = elevator.getFloorIndex(floor);
    Passenger[] temp = new Passenger[line.size()];

    for (int i = 0; i < line.size() ;i++ ) {
      temp[i] = line.get(i);
    }

    if (elevator.getCurrentDir()==Direction.UP) {
      for (Passenger p: temp ) {
        if (elevator.getFloorIndex(p.getDestinationFloor())>thisFloor) {
          if (elevator.addOccupants(p)) {
            line.remove(p);
          }
        }
      }
    }else{
      for (Passenger p : temp ) {
        if (elevator.getFloorIndex(p.getDestinationFloor())<thisFloor) {
          if (elevator.addOccupants(p)) {
            line.remove(p);
          }
        }
      }
    }
  }
}
