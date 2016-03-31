package assignment01;

public class Person{
  private String lastName, firstName;
  private char middleInitial;

  public Person(String lName, String fName, char mInitial){
    lastName = lName;
    firstName = fName;
    middleInitial = mInitial;
  }
  public String getLastName(){
    return lastName;
  }
  public String getFirstName(){
    return firstName;
  }
  public char getMiddleInitial(){
    return middleInitial;
  }
}
