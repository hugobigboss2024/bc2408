package d_Method.src;

public class method1 {
  public static void main(String[] args) {
    // Approach 1:
    // Bad -> careless mistake -> wrong formula
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 * 3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 * 3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 * 3.14);

    // Approach 2:
    // Bad ->
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    double area = 0.0;
    for (int i = 0; i < radiusList.length; i++) {
      area = radiusList[i] * radiusList[i] * 3.14;
      System.out.println(area);
    }

    // Approach 3:
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    // Sum up all circle area
    double totalArea = 0.0;
    for (int i = 0; i < radiusList2.length; i++) {
      totalArea += calculateAreaForCircle(radiusList2[i]);
    }
    System.out.println(totalArea);

    // input (parameters) -> "abc"
    String encrypted = encrypt("abc");
    System.out.println(encrypted); // ÈÊÌ

    String original = decrypt(encrypted);
    System.out.println(original); // abc

    // if output type = String, then you must return String value inside the
    // method

    // Static Method
    // encrypt("abc") / System.out.println("hello")
    // charAt("abc", 1)

    // Instance Method
    // "abc".charAt(0) -> "abc" is an object, and "charAt()" is object
    // presentation

    System.out.println(charAt("abc", 1)); // b

    // Compiler knows which method the caller is referring during compile time.
    System.out.println(sum(1, 2)); // (int, int)

    // during compile time, checked that there is no sum(double, double)
    // System.out.println(sum(1.3, 2.2)); // compile error

    System.out.println(sum(1L, 2L)); // (long, long) -> (float, float)
    System.out.println(sum((byte) 1, (byte) 2)); // (byte, byte) -> (int, int)
    System.out.println(sum(1.2f, 8.8f)); // (float, float)

    // during compile time, checked that there is no sum(String, String)
    // System.out.println(sum("123", "234"));

    System.out.println(sum(1, 2, 3)); // (int, int, int)

    double d1 = sum(1.2f, 2.0f); // float -> double
    long l1 = sum(1.2f, 2.0f).longValue(); // float -> long

    // 10.longValue(); // NOT OK
    new Integer(10).longValue(); // OK, longValue() -> instance method

    print(5, 6); // sysout

    calculateAreaForCircle(3.0);
    calculateAreaForSquare(3.0);

  }

  // calculateSquareArea
  public static double calculateAreaForSquare(double length) {
    return Math.pow(length, 2.0);
  }

  public static char charAt(String s, int i) {
    return s.charAt(i);
  }

  // input String -> output String
  public static String encrypt(String password) {
    char[] characters = password.toCharArray();
    String encrypted = "";
    for (int i = 0; i < characters.length; i++) {
      encrypted += (char) ((characters[i] + 3) * 2);
    }
    return encrypted;
  }

  public static String encrypt2(String password) {
    char[] characters = password.toCharArray();
    String encrypted = "";
    int left = -1, right = -1;
    for (int i = 0; i < characters.length; i++) {
      left = characters[i] / 4;
      right = characters[i] % 4;
      encrypted += left + right;
    }
    // sum=17, result1 = 4, result2 = 1
    return encrypted;
  }

  public static String decrypt(String encrypted) {
    char[] characters = encrypted.toCharArray();
    String original = "";
    for (int i = 0; i < characters.length; i++) {
      original += (char) (characters[i] / 2 - 3);
    }
    return original;
  }

  // input String , String -> output Integer
  // public static String abc(String a, String b) {

  // }

  // if input is able to produce output, then it is a static method.
  // double java.lang.Math.pow(double a, double b)
  // Method name -> start with verb

  // input double, output double
  public static double calculateAreaForCircle(double radius) {
    // return radius * radius * Math.PI;
    // pow(base, index) -> base ^ index
    return Math.pow(radius, 2.0) * Math.PI;
  }

  // Method Signature = Method Name + Number of Parameters & Type of Parameters
  // You can reuse the method name as long as they have different method
  // signature
  public static int sum(int x, int y) {
    System.out.println("Method sum(int x, int y)");
    return x + y;
  }

  public static int sum(int x, int y, int z) {
    System.out.println("Method sum(int x, int y, int z)");
    return x + y + z;
  }

  // Method Signature
  // sum(float x, float y) != sum(int x, int y)
  public static Float sum(float x, float y) {
    System.out.println("Method sum(double x, double y)");
    float result = x + y;
    return new Float(result); // return Float object
  }

  // Return Type: primitives + wrapper + String
  // void -> return nothing (No "return" keyword)
  public static void print(int x, int y) {
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }
}
