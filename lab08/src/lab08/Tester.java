package lab08;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Tester {
	private StudentDatabase test1 = new StudentDatabase();
	private StudentDatabase empty = new StudentDatabase();
	@Before
	public void setup(){
		Student s1 = new Student("S","Z",2015,4.0,540096,60);
		Student s2 = new Student("S","Z",2015,3.0,540096,60);
		Student s3 = new Student("S","Z",2015,2.0,540096,60);
		Student s4 = new Student("S","Z",2015,1.0,540096,60);
		test1.add(s1);
		test1.add(s2);
		test1.add(s3);
		test1.add(s4);
		
	}
	@Test
	public void test() {
		assertEquals(4,DatabaseUtilities.numStudents(test1));
		assertEquals(0,DatabaseUtilities.numStudents(empty));
	}
	@Test 
	public void testMaxGPA(){
		assertEquals(4.0,DatabaseUtilities.maxGPA(test1),.001);
		assertEquals(0.0,DatabaseUtilities.maxGPA(empty),.001);
	}
	@Test 
	public void testAverageGPA(){
		assertEquals(2.5,DatabaseUtilities.averageGPA(test1),.001);
		assertEquals(0.0,DatabaseUtilities.averageGPA(empty),.001);
	}
	@Test 
	public void testNumGPAAbove(){
		assertEquals(2,DatabaseUtilities.numGPAAbove(test1,2.0));
		assertEquals(0, DatabaseUtilities.numGPAAbove(empty,2.0));
	}

}
