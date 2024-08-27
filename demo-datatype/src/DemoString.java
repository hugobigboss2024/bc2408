public class DemoString {
  public static void main(String[] args) {
    System.out.println("hello world!!!!");
    // "hello world!!!!" -> String value

    // String is not a primitive!!!
    String s;
    s = "abc";

    String s2 = "def"; // "def" is a String value, and then assign to String
                       // variable
    // String s3 = 3
    // String s4 = true;

    String s3 = "3"; // Its ok, but you cannot perform Math Operation
    s3 = s3 + 1; // append meaning, but not + 1
    // String value + int value
    // String value + String value
    System.out.println(s3); // "31"

    s3 = s3 + true;
    System.out.println(s3); // "31true"

    // In String, there is no -, *, /, %

    // Example 1
    int age = 40;
    String message = "I'm " + age + " years old.";
    System.out.println(message);
    // String + int + String -> String

    // Example 2
    char grade = 'A';
    System.out.println("My grade of History is " + grade);
    // String + char -> String

    // +=
    String firstName = "Vincent";
    String lastName = "Lau";
    String fullName = ""; // empty String value

    fullName += firstName + " " + lastName;
    // fullName = fullName + firstName + " " + lastName;
    System.out.println(fullName); // Vincent Lau

    // Primitive -> Math Operation, Comparsion (>,<,>=,<=,==,!=)
    // String -> Not Primitive, we use method (tool) to compare their values
    String s10 = "hello";
    String s20 = "hello";

    // equals()
    System.out.println(s10.equals(s20)); // true
    boolean isValueSame = "abc".equals(s20); // false

    // charAt()
    char result = s10.charAt(1); // 2nd char of String value
    System.out.println(result); // e
    System.out.println(s10.charAt(0)); // h
    // System.out.println(s10.charAt(-1)); // index negative -> rummtime error
    // System.out.println(s10.charAt(5)); // out of range -> runtime error
    // s10.charAt(1L);
    // s10.charAt(1.0);

    System.out.println(s10.charAt(2) == 'l'); // true
    System.out.println(s10.charAt(2) != 'l'); // false

    // length()
    System.out.println(s10.length()); // 5
    System.out.println(s10.length() >= 5); // int 5 >= 5 ? -> true

  }
}
