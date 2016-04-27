package lab08;

public class Student {
	private String firstName;
	private String lastName;
	private int yearEnrolled;
	private double GPA;
	private int BNumber;
	private int numCredits;

	public Student(String firstName, String lastName, int yearEnrolled, double gPA, int bNumber, int numCredits) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearEnrolled = yearEnrolled;
		GPA = gPA;
		BNumber = bNumber;
		this.numCredits = numCredits;
	} 
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getYearEnrolled() {
		return yearEnrolled;
	}
	public double getGPA() {
		return GPA;
	}
	public int getBNumber() {
		return BNumber;
	}
	public int getNumCredits() {
		return numCredits;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", yearEnrolled=" + yearEnrolled
				+ ", GPA=" + GPA + ", BNumber=" + BNumber + ", numCredits=" + numCredits + "]";
	}
	

}
