package assignment08;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import org.junit.Test;

import org.junit.Assert;

public class Question4Test {

	@Test
	public void triangleTest() {
		Point2D.Double p = new Point2D.Double(0, 0);
		Point2D.Double q = new Point2D.Double(0, 2);
		Point2D.Double r = new Point2D.Double(2, 0);
		ArrayList<Point2D.Double> testTriangle = new ArrayList<Point2D.Double>();
		testTriangle.add(p);
		testTriangle.add(q);
		testTriangle.add(r);
		Assert.assertEquals(2.0,Question4.getArea(testTriangle),1E-9);
	}
	@Test
	public void rectangleTest(){
		Point2D.Double p = new Point2D.Double(0, 0);
		Point2D.Double q = new Point2D.Double(0, 2);
		Point2D.Double r = new Point2D.Double(2, 0);
		Point2D.Double s = new Point2D.Double(2, 2);
		ArrayList<Point2D.Double> testRec = new ArrayList<Point2D.Double>();
		testRec.add(p);
		testRec.add(q);
		testRec.add(r);
		testRec.add(s);
		Assert.assertEquals(4.0,Question4.getArea(testRec), 1E-9);
	}
	@Test
	public void hexagonTest(){
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
		Assert.assertEquals(4.0,Question4.getArea(testHex), 1E-6);
	}

}
