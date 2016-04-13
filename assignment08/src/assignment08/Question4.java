package assignment08;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Question4 {

	public static double getArea(ArrayList<Point2D.Double> points) {
		// TODO Auto-generated method stub
		Point2D.Double p = points.get(0);
		Point2D.Double q = points.get(1);
		Point2D.Double r = points.get(points.size() -1);
		double area = Math.abs(p.x*q.y + q.x*r.y + r.x*p.y - p.y*q.x - q.y*r.x - r.y*p.x)/2;
		points.remove(0);

		if(points.size() > 2){
			area = area + getArea(points); 
			return area;
		}else{
			return area;
		}
	}
/*Test main
	public static void main(String[] args){
		Point2D.Double p = new Point2D.Double(0, 0);
		Point2D.Double q = new Point2D.Double(0, 2);
		Point2D.Double r = new Point2D.Double(2, 0);
		Point2D.Double s = new Point2D.Double(2, 2);
		
		ArrayList<Point2D.Double> testTriangle = new ArrayList<Point2D.Double>();
		testTriangle.add(p);
		testTriangle.add(q);
		testTriangle.add(r);
		System.out.println("Expected: 2.0 | "+getArea(testTriangle));
		
		ArrayList<Point2D.Double> testRec = new ArrayList<Point2D.Double>();
		testRec.add(p);
		testRec.add(q);
		testRec.add(r);
		testRec.add(s);
		
		System.out.println("Expected: 4.0 | " + getArea(testRec));
		
		Point2D.Double a = new Point2D.Double(0, 1);
		Point2D.Double b = new Point2D.Double(1, 0);
		Point2D.Double c = new Point2D.Double(2, 0);
		Point2D.Double d = new Point2D.Double(3, 1);
		Point2D.Double e = new Point2D.Double(2, 2);
		Point2D.Double f = new Point2D.Double(1, 2);
		
		ArrayList <Point2D.Double> testHex = new ArrayList<Point2D.Double>();
		testHex.add(a);
		testHex.add(b);
		testHex.add(c);
		testHex.add(d);
		testHex.add(e);
		testHex.add(f);
		
		System.out.println("Expected: 4.0 | " + getArea(testHex));
		
		

	}
*/
}