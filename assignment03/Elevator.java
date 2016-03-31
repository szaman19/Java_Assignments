package assignment03;
import java.util.ArrayList;

public class Elevator{
  private int currentFloor, groundFloor, capacity, numFloors;
  private Direction currentDir = Direction.UP;
  private ArrayList<Passenger> occupants = new ArrayList();
  private ArrayList<Line> lines = new ArrayList();

  public Elevator(int nf, int gf, int cap){
    currentFloor = gf;
    groundFloor = gf;
    numFloors = nf;
    capacity = cap;
    for (int i = 0; i < numFloors ; i ++) {
      lines.add(i,null);
    }
  }
  public int getNumFloors(){
    return numFloors;
  }
  public int getCurrentFloor(){
    return currentFloor;
  }
  public ArrayList<Line> getLines(){
    return lines;
  }
  public Direction getCurrentDir(){
    return currentDir;
  }
  public int getNumOccupants(){
    return occupants.size();
  }
  public String getFloorName(int index){
    if (index < 0 || index >= numFloors) {
      throw new IllegalArgumentException("Illegal floor number");
    }
    String returnVal = "";

    if (index == groundFloor) {
      returnVal = "G";
    }else if (index < groundFloor) {
      int temp = groundFloor - index;
      returnVal = "B"+temp;
    }else{
      int temp = index - groundFloor + 1;
      returnVal = returnVal + temp;
    }
    return returnVal;
  }
  /**
  The method takes in a floor name and returns the list index value.
Brief description of what the method is for (not how it does it). Include all specials cases.
@param <String floorName> brief description of what the parameter is used for [omit if there are no parameters]
[repeat the line above if there are more parameters]
@return brief statement describing the value returned [omit if method is void]
@throws <exception name> description of what causes this exception to be thrown [omit if there are no exceptions]
[repeat the line above if there can be other exceptions]
*/
  public int getFloorIndex(String floorName){
    int returnVal = 0;
    if (floorName == "G") {
      returnVal = groundFloor;
    }else if (floorName.startsWith("B")) {
      int temp = Integer.parseInt(floorName.substring(1));
      returnVal = groundFloor - temp;
    }else{
      int temp = Integer.parseInt(floorName);
      returnVal = groundFloor + temp - 1;
    }
    return returnVal;
  }
  public boolean addOccupants(Passenger p){
    boolean returnVal;
    if (occupants.size() < capacity) {
      occupants.add(p);
      returnVal = true;
    }else{
      returnVal = false;
    }
    return returnVal;
  }

  public void addLine(String flr, Line ln){
    int floorIndex = getFloorIndex(flr);
    lines.set(floorIndex,ln);
  }
  /**

Brief description of what the method is for (not how it does it). Include all specials cases.
@param <parameter name> brief description of what the parameter is used for [omit if there are no parameters]
[repeat the line above if there are more parameters]
@return brief statement describing the value returned [omit if method is void]
@throws <exception name> description of what causes this exception to be thrown [omit if there are no exceptions]
[repeat the line above if there can be other exceptions]
*/
  public void move(){
    if (currentDir == Direction.UP) {
      if (currentFloor < numFloors -1) {
        currentFloor++;
      }else{
        currentDir = Direction.DOWN;
        currentFloor--;
      }
    }else{
      if (currentFloor != 0) {
        currentFloor--;
      }else{
        currentDir = Direction.UP;
        currentFloor++;
      }
    }
    Passenger[] temp = new Passenger[occupants.size()];
    for (int i = 0;i < occupants.size();i++) {
      temp[i] = occupants.get(i);
    }
    for (Passenger p : temp ) {

      if (getFloorIndex(p.getDestinationFloor()) == currentFloor) {
        //System.out.println("is this happening?");
        occupants.remove(p);
      }
    }
    if (lines.get(currentFloor) != null) {
      (lines.get(currentFloor)).loadElevator();
    }
  }
}
