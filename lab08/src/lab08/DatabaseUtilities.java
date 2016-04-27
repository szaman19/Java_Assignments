package lab08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DatabaseUtilities {

    /**
     * Determines number of students in db
     * @param db the database to operate on
     * @return number of students in db
     */
    public static long numStudents(StudentDatabase db) {
    	long numStudents = (db.stream()).count();
    	return numStudents;
    }

    /**
     * Determines maximum GPA in db
     * @param db the database to operate on
     * @return 0 if db is empty, otherwise, maximum GPA over db
     */
    public static double maxGPA(StudentDatabase db) {
    	OptionalDouble maxGPA;
    	DoubleStream gpa = (db.stream()).mapToDouble(d->d.getGPA());
    	maxGPA = gpa.max();
        return maxGPA.orElse(0.0);
    }

    /**
     * Determines average GPA in db
     * @param db the database to operate on
     * @return 0 if db is empty, otherwise, average GPA over db
     */
    public static double averageGPA(StudentDatabase db) {
    	DoubleStream gpa = (db.stream()).mapToDouble(d->d.getGPA());
    	OptionalDouble averageGPA = gpa.average();
    	return averageGPA.orElse(0.0);
     }

    /**
     * Determines number of students whose GPA is above threshold
     * @param db the database to operate on
     * @param threshold threshold a GPA must be above
     * @return number of students whose GPA is above threshold
     */
    public static long numGPAAbove(StudentDatabase db, double threshold) {
    	DoubleStream gpa = (db.stream()).mapToDouble(d->d.getGPA());
    	long numStudentsAbove = gpa.filter(i -> i > threshold).count();
        return numStudentsAbove;
     }

    /**
     * Sorts db according to comp, then prints the students
     * @param db the database to operate on
     * @param comp the comparator to use to compare two Students
     */
    public static void sortAndPrint(StudentDatabase db, Comparator<Student> comp) {
        (db.stream())
        .sorted(comp)
        .forEach(System.out::println);
        
    }
}