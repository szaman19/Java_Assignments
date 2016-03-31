package assignment06;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;



public class DegreeAuditTest {
	private ArrayList<String> annotations1 = new ArrayList<String>(Arrays.asList(new String[] {"C", "J", "W"}));
	private ArrayList<String> annotations2 = new ArrayList<String>(Arrays.asList(new String[] {"C"}));
	private ArrayList<String> annotations3 = new ArrayList<String>(Arrays.asList(new String[] {"J"}));
	private ArrayList<String> annotations4 = new ArrayList<String>(Arrays.asList(new String[] {"W"}));
	private ArrayList<String> annotations5 = new ArrayList<String>(Arrays.asList(new String[] {"W"}));
	private CourseOffering testC1 = new CourseOffering
			("WRIT111","Coming to voice", 201690,annotations1 );
	private CourseOffering testC2 = new CourseOffering
			("WRIT112","Coming to voice", 201690,annotations2);
	private CourseOffering testC3 = new CourseOffering
			("WRIT113","Coming to voice", 201690, annotations3);
	private CourseOffering testC4 = new CourseOffering
			("WRIT114","Coming to voice", 201690, annotations4);
	private CourseOffering testC5 = new CourseOffering
			("WRIT112","Coming to voice", 201690,annotations2);
	private CourseOffering testC6 = new CourseOffering
			("WRIT112","Coming to voice", 201690,annotations2);
	private CourseOffering testC7 = new CourseOffering
			("WRIT112","Coming to voice", 201690,annotations2);
	private CourseOffering testW1 = new CourseOffering
			("WRIT115","Writing class",201670,annotations4);
	private CourseOffering testW2 = new CourseOffering
			("WRIT115","Writing class",201670,annotations4);
	private CourseOffering CS301 = new CourseOffering
			("CS301","CS WRITING",201690,annotations5);
	private CourseOffering testJ1 = new CourseOffering
			("AAS1","Asian American Lit.",201690,annotations3);
	//Harpur incomplete requirements
	@Test
	public void test() {
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC1);
		courses.add(testC2);
		courses.add(testC3);
		HarpurAudit test = new HarpurAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertFalse(test1);
	}
	//Harpur Completed requirements 3 C/J 1 W
	@Test
	public void test2(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC1);
		courses.add(testC2);
		courses.add(testC3);
		courses.add(testC4);
		HarpurAudit test = new HarpurAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertTrue(test1);
	}
	//Harpur Missing one C/J
	@Test
	public void test5(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC1);
		courses.add(testC4);
		courses.add(testW1);
		courses.add(testW2);
		HarpurAudit test = new HarpurAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertFalse(test1);
	}
	//CS Incomplete 301
	@Test
	public void test3(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC1);
		courses.add(testC2);
		CSAudit test = new CSAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertFalse(test1);
	}
	//CS test Incomplete C/J
	@Test
	public void test4(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testW1);
		courses.add(CS301);
		CSAudit test = new CSAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertFalse(test1);
		
	}
	//CS test completed requirements
	@Test
	public void test6(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC1);
		courses.add(CS301);
		CSAudit test = new CSAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertTrue(test1);
		
	}
	//SOM test incomplete requirements
	@Test
	public void test7(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testW1);
		courses.add(testW2);
		courses.add(testC1);
		SOMAudit test = new SOMAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertFalse(test1);
	}
	//SOM test completed requirements
	@Test
	public void test8(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testW1);
		courses.add(testW2);
		courses.add(testC1);
		courses.add(testJ1);
		SOMAudit test = new SOMAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertTrue(test1);
	}
	//Harpur complete 3W and 2 C/J
	@Test 
	public void test9(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testW1);
		courses.add(testW2);
		courses.add(testC1);
		courses.add(testC4);
		courses.add(testC2);
		HarpurAudit test = new HarpurAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertTrue(test1);
		
	}
	//Harpur complete 4 C
	@Test 
	public void test10(){
		ArrayList<CourseOffering> courses = new ArrayList<CourseOffering>();
		courses.add(testC7);
		courses.add(testC1);
		courses.add(testC5);
		courses.add(testC6);
		HarpurAudit test = new HarpurAudit();
		boolean test1 = test.writingSatisfied(courses);
		assertTrue(test1);
		
	}
	
}
