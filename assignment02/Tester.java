package assignment02;
import java.util.Arrays;

public class Tester{
public static void main(String[] args) {
  /*
Write 4 tests for Utilities02.countSpaces, The null String (null), the empty String (""),
one String with no spaces and one String with several spaces.
Print the expected value in each case.
We will use methods from the String class,
see https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
*/
  String countSpacesTest1 = null;
  String countSpacesTest2 = "";
  String countSpacesTest3 = "helloworld";
  String countSpacesTest4 = "Quick brown fox jumped over the lazy dog";

  System.out.println("Utilities02 Countspaces Test");
  System.out.println("Expected Result: -1");
  System.out.println(Utilities02.countSpaces(countSpacesTest1));
  System.out.println("Expected Result: 0");
  System.out.println(Utilities02.countSpaces(countSpacesTest2));
  System.out.println("Expected Result: 0");
  System.out.println(Utilities02.countSpaces(countSpacesTest3));
  System.out.println("Expected Result: 7");
  System.out.println(Utilities02.countSpaces(countSpacesTest4));
  System.out.println("-----------------------------------------");

  /*

  Write 7 tests for Utilities02.first (in each case print the expected value as well).
  The tests are the null String, the empty String, a String with only several spaces, a single word with leading
  and trailing spaces, a single word without leading spaces, a string of words separated
  by spaces and with leading and trailing space, and a string of words without leading space.
  (You need to make sure your code does not accidentally skip the first word if there is no leading space.)

  Use the same tests for Utilities02.rest.
  */

  String stringTest1 = null;
  String stringTest2 = "";
  String stringTest3 = "   ";
  String stringTest4 = "   helloworld";
  String stringTest5 = "helloworld";
  String stringTest6 = "   Quick brown fox jumped over the lazy dog   ";
  String stringTest7 = "Quick brown fox jumped over the lazy dog";

  System.out.println("Utilities02 first Test");
  System.out.println("Expected Result: null");
  System.out.println(Utilities02.first(stringTest1));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.first(stringTest2));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.first(stringTest3));
  System.out.println("Expected Result: helloworld");
  System.out.println(Utilities02.first(stringTest4));
  System.out.println("Expected Result: helloworld");
  System.out.println(Utilities02.first(stringTest5));
  System.out.println("Expected Result: Quick");
  System.out.println(Utilities02.first(stringTest6));
  System.out.println("Expected Result: Quick");
  System.out.println(Utilities02.first(stringTest7));
  System.out.println("-----------------------------------------");

  System.out.println("Utilities02 rest Test");
  System.out.println("Expected Result: null");
  System.out.println(Utilities02.rest(stringTest1));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.rest(stringTest2));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.rest(stringTest3));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.rest(stringTest4));
  System.out.println("Expected Result: ");
  System.out.println(Utilities02.rest(stringTest5));
  System.out.println("Expected Result: brown fox jumped over the lazy dog   ");
  System.out.println(Utilities02.rest(stringTest6));
  System.out.println("Expected Result: brown fox jumped over the lazy dog");
  System.out.println(Utilities02.rest(stringTest7));
  System.out.println("-----------------------------------------");



  /*

  Repeat a selection of the tests above and put multiple spaces
  between the words to check that Utilities02.withoutExtraSpaces functions correctly.

  */
  String extraSpacesTest1 = " h    e      l    l    o";

  System.out.println("Utilities02 withoutExtraSpaces test");
  System.out.println("Expected Result: helloworld");
  System.out.println(Utilities02.withoutExtraSpaces(stringTest4));
  System.out.println("Expected Result: Quick brown fox jumped over the lazy dog");
  System.out.println(Utilities02.withoutExtraSpaces(stringTest6));
  System.out.println("Expected Result: Quick brown fox jumped over the lazy dog");
  System.out.println(Utilities02.withoutExtraSpaces(stringTest7));
  System.out.println("Expected Result: h e l l o");
  System.out.println(Utilities02.withoutExtraSpaces(extraSpacesTest1));
  System.out.println("-----------------------------------------");
  /*

  Check Utilities02.splitOnSpaces for the null String, the empty String, and a String
  withe plenty of words and spaces.

  Write tests for Utilities02.splitOnSpaces1 and Utilities02.stringLengths
    */
  String splitOnSpacesTest1 = null;
  String splitOnSpacesTest2 = "";
  String splitOnSpacesTest3 = "   HELLO HOW ARE    YOU   DOING   ?";

  System.out.println("Utilities02 splitOnSpaces Test");
  System.out.println("Expected Result: null");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces(splitOnSpacesTest1)));
  System.out.println("Expected Result: []");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces(splitOnSpacesTest2)));
  System.out.println("Expected Result: [HELLO, HOW, ARE, YOU, DOING, ?]");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces(splitOnSpacesTest3)));
  System.out.println("-----------------------------------------");

  System.out.println("Utilities02 splitOnSpaces1 Test");
  System.out.println("Expected Result: null");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces1(splitOnSpacesTest1)));
  System.out.println("Expected Result: []");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces1(splitOnSpacesTest2)));
  System.out.println("Expected Result: [HELLO, HOW, ARE, YOU, DOING, ?]");
  System.out.println(Arrays.toString(Utilities02.splitOnSpaces1(splitOnSpacesTest3)));
  System.out.println("-----------------------------------------");

  String stringLengthsTest1 = null;
  String stringLengthsTest2 = "";
  String stringLengthsTest3 = "   HELLO HOW ARE    YOU   DOING   ?";

  System.out.println("Utilities02 strLengths Test");
  System.out.println("Expected Result: null");
  System.out.println(Arrays.toString(Utilities02.strLengths(stringLengthsTest1)));
  System.out.println("Expected Result: [0]");
  System.out.println(Arrays.toString(Utilities02.strLengths(stringLengthsTest2)));
  System.out.println("Expected Result: [5, 3, 3, 3, 5, 1]");
  System.out.println(Arrays.toString(Utilities02.strLengths(stringLengthsTest3)));
  System.out.println("-----------------------------------------");


  System.out.println("Utilities02 countNulls Test");
  int x = 0;
  String nullTest = null;
  Object[] tester = {null, null,1,2,x,nullTest,2.0};
  System.out.println("Expected Result: 3");
  System.out.println(Utilities02.countNulls(tester));
  System.out.println("-----------------------------------------");

  InstanceMethodVersion countSpacesInstanceTest1 = new InstanceMethodVersion(countSpacesTest1);
  InstanceMethodVersion countSpacesInstanceTest2 = new InstanceMethodVersion(countSpacesTest2);
  InstanceMethodVersion countSpacesInstanceTest3 = new InstanceMethodVersion(countSpacesTest3);
  InstanceMethodVersion countSpacesInstanceTest4 = new InstanceMethodVersion(countSpacesTest4);
  System.out.println("InstanceMethodVersion Countspaces Test");
  System.out.println(countSpacesInstanceTest1.countSpaces());
  System.out.println("Expected Result: -1");
  System.out.println(countSpacesInstanceTest2.countSpaces());
  System.out.println("Expected Result: 0");
  System.out.println(countSpacesInstanceTest3.countSpaces());
  System.out.println("Expected Result: 0");
  System.out.println(countSpacesInstanceTest4.countSpaces());
  System.out.println("Expected Result: 7");
  System.out.println("-----------------------------------------");

  InstanceMethodVersion stringInstanceTest1 = new InstanceMethodVersion(stringTest1);
  InstanceMethodVersion stringInstanceTest2 = new InstanceMethodVersion(stringTest2);
  InstanceMethodVersion stringInstanceTest3 = new InstanceMethodVersion(stringTest3);
  InstanceMethodVersion stringInstanceTest4 = new InstanceMethodVersion(stringTest4);
  InstanceMethodVersion stringInstanceTest5 = new InstanceMethodVersion(stringTest5);
  InstanceMethodVersion stringInstanceTest6 = new InstanceMethodVersion(stringTest6);
  InstanceMethodVersion stringInstanceTest7 = new InstanceMethodVersion(stringTest7);

  System.out.println("InstanceMethodVersion first Test");
  System.out.println("Expected Result: null");
  System.out.println(stringInstanceTest1.first());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest2.first());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest3.first());
  System.out.println("Expected Result: helloworld");
  System.out.println(stringInstanceTest4.first());
  System.out.println("Expected Result: helloworld");
  System.out.println(stringInstanceTest5.first());
  System.out.println("Expected Result: Quick");
  System.out.println(stringInstanceTest6.first());
  System.out.println("Expected Result: Quick");
  System.out.println(stringInstanceTest7.first());
  System.out.println("-----------------------------------------");

  System.out.println("InstanceMethodVersion rest Test");
  System.out.println("Expected Result: null");
  System.out.println(stringInstanceTest1.rest());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest2.rest());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest3.rest());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest4.rest());
  System.out.println("Expected Result: ");
  System.out.println(stringInstanceTest5.rest());
  System.out.println("Expected Result: brown fox jumped over the lazy dog   ");
  System.out.println(stringInstanceTest6.rest());
  System.out.println("Expected Result: brown fox jumped over the lazy dog");
  System.out.println(stringInstanceTest7.rest());
  System.out.println("-----------------------------------------");

  System.out.println("InstanceMethodVersion withoutExtraSpaces Test");
  InstanceMethodVersion extraSpacesInstanceTest1 = new InstanceMethodVersion(extraSpacesTest1);
  System.out.println("Expected Result: helloworld");
  System.out.println(stringInstanceTest4.withoutExtraSpaces());
  System.out.println("Expected Result: Quick brown fox jumped over the lazy dog");
  System.out.println(stringInstanceTest6.withoutExtraSpaces());
  System.out.println("Expected Result: Quick brown fox jumped over the lazy dog");
  System.out.println(stringInstanceTest7.withoutExtraSpaces());
  System.out.println("Expected Result: h e l l o");
  System.out.println(extraSpacesInstanceTest1.withoutExtraSpaces());
  System.out.println("-----------------------------------------");

  InstanceMethodVersion listTestInstance1 = new InstanceMethodVersion(splitOnSpacesTest1);
  InstanceMethodVersion listTestInstance2 = new InstanceMethodVersion(splitOnSpacesTest2);
  InstanceMethodVersion listTestInstance3 = new InstanceMethodVersion(splitOnSpacesTest3);
  System.out.println("InstanceMethodVersion splitOnSpaces Test");
  System.out.println("Expected Result: null");
  System.out.println(Arrays.toString(listTestInstance1.splitOnSpaces()));
  System.out.println("Expected Result: []");
  System.out.println(Arrays.toString(listTestInstance2.splitOnSpaces()));
  System.out.println("Expected Result: [HELLO, HOW, ARE, YOU, DOING, ?]");
  System.out.println(Arrays.toString(listTestInstance3.splitOnSpaces()));
  System.out.println("-----------------------------------------");

  InstanceMethodVersion listTestInstance4 = new InstanceMethodVersion(splitOnSpacesTest1);
  InstanceMethodVersion listTestInstance5 = new InstanceMethodVersion(splitOnSpacesTest2);
  InstanceMethodVersion listTestInstance6 = new InstanceMethodVersion(splitOnSpacesTest3);

  System.out.println("InstanceMethodVersion strLengths Test");
  System.out.println("Expected Result: null");
  System.out.println(Arrays.toString(listTestInstance4.strLengths()));
  System.out.println("Expected Result: [0]");
  System.out.println(Arrays.toString(listTestInstance5.strLengths()));
  System.out.println("Expected Result: [5, 3, 3, 3, 5, 1]");
  System.out.println(Arrays.toString(listTestInstance6.strLengths()));
  System.out.println("-----------------------------------------");

  }
}
