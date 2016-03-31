package assignment01;
public class Class{
  private String name;
  private String number;
  private int numCredits;
  private int crn;
  private double qualPoints;
  public static final Class DUMMY_CLASS = new Class("DUMMY","000",0,0);

  public Class(String aName, String aNumber, int aNumCredits, int aCrn) {
    name = aName;
    number = aNumber;
    numCredits = aNumCredits;
    crn = aCrn;
    //DUMMY_CLASS.qualPoints = 0.0;
}
  public String getName(){
    return name;
  }
  public String getNumber(){
    return number;
  }
  public int getNumCredits(){
    return numCredits;
  }
  public int getCrn(){
    return crn;
  }
  public void setQualPoints(double qPoints) {
     qualPoints = qPoints;
  }
  public double getQualPoints(){
    return qualPoints;
  }
}
