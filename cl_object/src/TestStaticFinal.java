package cl_object.src;

public class TestStaticFinal {
  static int y;
  final int z;
  static final int x; // error
  // static final variable should be created and finalized before object creation

  // Constructor (main method: create object)
  public TestStaticFinal(int value) {
    z = value; // Constructor can assign value to final variable
    y = value; // Constructor can assign value to static variable
    x = value;   // error
    // static final variable should be created and finalized before object creation
  } 

  // static method (main method: Class to call static method)
  public static void test(int value) {
    y = value; // static method can access static variable
    z = value; // error, static method never access instance variable
    x = value; // OK
    // static final variable should be created and finalized before object creation
  }

  public static void main(String[] args) {
    TestStaticFinal s = new TestStaticFinal(10);
    System.out.println(s.x); // should be accessed in a static way
  }
}
