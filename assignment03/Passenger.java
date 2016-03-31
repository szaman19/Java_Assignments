package assignment03;

public class Passenger{
  private String destinationFloor;
  private int id;
  private static int nextId = 0;

  public Passenger(String desFl, Elevator elevator){
    if (desFl == null) {
      throw new IllegalArgumentException("Cannot give null arguments");
    }
    int dest = elevator.getFloorIndex(desFl);
    if (dest < 0) {
      dest = 0;
    }else if (dest > (elevator.getNumFloors()-1)) {
      dest = elevator.getNumFloors() - 1;
    }

    destinationFloor = elevator.getFloorName(dest);
    nextId = nextId + 1;
    id = nextId;
  }
  public String getDestinationFloor(){
    return destinationFloor;
  }

  public int getId(){
    return id;
  }

  public String toString(){
    return "" + id;
  }
}
