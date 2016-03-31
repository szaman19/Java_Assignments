package assignment01;

public class Driver{
public static void main(String[] args) {
  Person testPerson1 = new Person("Test","Person1",'O');
  Person testPerson2 = new Person("Test","Person2",'T');
  Person testPerson3 = new Person("Test","Person3",'T');

  Student testStudent1 = new Student(testPerson1);
  Student testStudent2 = new Student(testPerson2);
  Student testStudent3 = new Student(testPerson3);

  Class class1 = new Class("PHYS","PHYS131",4,1234);
  Class class2 = new Class("MATH","MATH225",4,4321);
  Class class3 = new Class("PHYS","PHYS132",4,2134);
  Class class4 = new Class("MATH","MATH323",4,0000);
  Class class5 = new Class("CS","CS140",4,1111);
  Class class6 = new Class("CS","CS110",4,2222);
  Class class7 = new Class("CS","CS101",1,1222);

  testStudent2.setClass1(class1);
  testStudent2.setClass2(class2);
  testStudent2.setClass3(class3);

  testStudent2.setQualPoints1(12.0);
  testStudent2.setQualPoints2(12.0);
  testStudent2.setQualPoints3(12.0);

  testStudent3.setClass1(class4);
  testStudent3.setClass2(class5);
  testStudent3.setClass3(class6);
  testStudent3.setClass4(class7);

  testStudent3.setQualPoints1(16.0);
  testStudent3.setQualPoints2(16.0);
  testStudent3.setQualPoints3(14.8);
  testStudent3.setQualPoints4(4.0);

  System.out.println("Expected Value: 0.000");
  System.out.printf("%s: %.3f \n \n",testStudent1.getName(),testStudent1.computeSemesterGPA());
  System.out.println("Expected Value: 3.000");
  System.out.printf("%s: %.3f \n \n",testStudent2.getName(),testStudent2.computeSemesterGPA());
  System.out.println("Expected Value: 3.908");
  System.out.printf("%s: %.3f \n \n",testStudent3.getName(),testStudent3.computeSemesterGPA());


}
}
