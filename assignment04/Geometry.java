package assignment04;
import java.util.ArrayList;
import java.awt.geom.Point2D;

public class Geometry{
  public static void reduce(ArrayList<Point2D.Double> list){
    if (list.size() == 0 || list.size() == 1 || list == null ) {
      throw new IllegalArgumentException();
    }else{
      ArrayList<Double> x = new ArrayList<Double>();
      ArrayList<Double> y = new ArrayList<Double>();
      ArrayList<Point2D.Double> testList = new ArrayList<Point2D.Double>(list);
      for (Point2D.Double point : testList ) {
        if (x.contains(point.getX())) {
          list.remove(point);
        }else if (y.contains(point.getY())) {
          list.remove(point);
        }else{
          x.add(point.getX());
          y.add(point.getY());
        }
      }
      }
    }

  public static double area(ArrayList<Point2D.Double>list){
    reduce(list);
    double minX = list.get(0).getX();
    double maxX = list.get(0).getX();
    double minY = list.get(0).getY();
    double maxY = list.get(0).getY();
    for (Point2D p :list ) {
      double tempX = p.getX();
      double tempY = p.getY();
      if (tempX <= minX) {
        minX = tempX;
      }if (tempX >= maxX) {
        maxX = tempX;
      }if (tempY <= minY) {
        minY = tempY;
      }if (tempY >= maxY) {

        maxY = tempY;
        //System.out.println(maxY);
      }
    }
    // System.out.println(maxX);
    // System.out.println(minX);
    // System.out.println(maxY);
    // System.out.println(minY);
    return Math.abs((maxX - minX)*(maxY-minY));
  }
  public static void main(String[] args) {
    Point2D.Double test1 = new Point2D.Double(0.0,0.0);
    Point2D.Double test2 = new Point2D.Double(0.0,0.0);
    Point2D.Double test3 = new Point2D.Double(1.0,0.0);
    Point2D.Double test4 = new Point2D.Double(0.0,1.0);
    Point2D.Double test5 = new Point2D.Double(1.0,1.0);
    Point2D.Double test6 = new Point2D.Double(5.0,2.0);
    Point2D.Double test7 = new Point2D.Double(1.0,4.0);
    Point2D.Double test8 = new Point2D.Double(2.0,3.0);
    ArrayList<Point2D.Double> testList = new ArrayList<Point2D.Double>();
    testList.add(test1);
    testList.add(test2);
    testList.add(test3);
    testList.add(test4);
    testList.add(test5);
    reduce(testList);
    System.out.println(testList.toString());
    System.out.println("Expected value: 1");
    System.out.println(area(testList));
    ArrayList<Point2D.Double> testList2 = new ArrayList<Point2D.Double>();
    testList2.add(test1);
    testList2.add(test2);
    testList2.add(test3);
    testList2.add(test4);
    testList2.add(test5);
    testList2.add(test6);
    testList2.add(test7);
    reduce(testList2);
    System.out.println(testList2.toString());
    System.out.println("Expected value: 10");
    System.out.println(area(testList2));
    testList2.add(test8);
    reduce(testList2);

    System.out.println(testList2.toString());
    System.out.println("Expected value: 15");
    System.out.println(area(testList2));
  }
}
