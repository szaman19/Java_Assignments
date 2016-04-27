package lab08;

import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("S","Z",2015,4.0,540096,60);
		Student s2 = new Student("S","Z",2015,3.0,540096,60);
		Student s3 = new Student("S","Z",2015,2.0,540096,60);
		Student s4 = new Student("S","Z",2015,1.0,540096,60);
		StudentDatabase test1 = new StudentDatabase();
		test1.add(s1);
		test1.add(s2);
		test1.add(s3);
		test1.add(s4);
		System.out.println(DatabaseUtilities.numStudents(test1));
		System.out.println(DatabaseUtilities.maxGPA(test1));
		System.out.println(DatabaseUtilities.averageGPA(test1));
		System.out.println(DatabaseUtilities.numGPAAbove(test1, 2));
		DatabaseUtilities.sortAndPrint(test1, (Student i,Student o)->Double.compare(i.getGPA(), i.getGPA()));
	}

}
