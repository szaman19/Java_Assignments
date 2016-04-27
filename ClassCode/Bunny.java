public class Bunny implements Comparable<Bunny>{

  private String name;
  public Bunny(String thisName){
    name = thisName;
  }
  public int compareTo(Bunny b){
    return name.compareTo(b.name);
  }

  public String toString(){
    return name;
  }
}
