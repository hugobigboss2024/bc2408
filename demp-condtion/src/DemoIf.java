public class DemoIf {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    boolean isXLargerThan30 = x >= 30; // true

    if (isXLargerThan30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    // 8 primitives, String (equals(), charAt(), length())

    // Example 1
    // 1. Else-if (Avoid event overlap)
    int number = -3;
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
    // "The number is positive."
    // "The number is negative."

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 20;
    int b = 10;
    int max; // declaration
    int min;
    if (a > b) {
      max = a; // assignment
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");
    // "20 is larger than 10."

    // Example 4
    String day = "Wednesday";
    // Sample Output:
    // "Wednesday is weekday."
    // "Sunday is weekend."
    // "Saturday is weekend."

    // Approach 1
    if ("Wednesday".equals(day)) {
      System.out.println("Wednesday is weekday.");
    } else if ("Monday".equals(day)) {
      System.out.println("Monday is weekday.");
    } else if ("Friday".equals(day)) {
      System.out.println("Friday is weekday.");
    } else if ("Tuesday".equals(day)) {
      System.out.println("Tuesday is weekday.");
    } else if ("Thursday".equals(day)) {
      System.out.println("Thursday is weekday.");
    } else if ("Saturday".equals(day)) {
      System.out.println("Saturday is weekend.");
    } else if ("Sunday".equals(day)) {
      System.out.println("Sunday is weekend.");
    }

    // Approach 2
    if ("Wednesday".equals(day) || "Monday".equals(day) || "Tuesday".equals(day)
        || "Thursday".equals(day) || "Friday".equals(day)) {
      System.out.println(day + "is weekday.");
    } else {
      System.out.println(day + "is weekend.");
    }

    // Approach 3
    boolean weekday =
        "Wednesday".equals(day) || "Monday".equals(day) || "Tuesday".equals(day)
            || "Thursday".equals(day) || "Friday".equals(day);

    if (weekday) {
      System.out.println(day + "is weekday.");
    } else {
      System.out.println(day + "is weekend.");
    }

    // Example 5
    int num = 7;
    // Sample ouput:
    // 7 is an odd number.
    // 8 is an even number.
    if (num % 2 == 1) {
      System.out.println(num + " is an odd number.");
    } else {
      System.out.println(num + " is an even number.");
    }

    // Example 6
    String str = "hello";
    // "" -> empty string

    // Sample ouput:
    // The last character of str is o
    // This is an empty String
    if (str.length() == 0) {
      System.out.println("This is an empty string.");
    } else {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    }

    // Example 7
    // Reversed String
    String s = "abc";
    s = "" + s.charAt(2) + s.charAt(1) + s.charAt(0); // char + char + char
    System.out.println(s); // cba

    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not Divided by 100
    // 3. Or divided by 400

    int year = 2003;
    boolean isLeapYear =
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    boolean isLeap = false;
    if (year % 4 == 0) { // 2004
      if (year % 100 == 0) { // 1900, 2000
        if (year % 400 == 0) { // 2000
          isLeap = true;
        } else { // 1900
          isLeap = false;
        }
      } else { // 2004
        isLeap = true;
      }
    } else { // 2003
      isLeap = false;
    }

    if (isLeap) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }

    // Sample output:
    // 1900 is not a leap year.
    // 2000 is a leap year.
    // 2004 is a leap year.
    // 2003 is not a leap year.

    // Example 9
    int age = 20;
    boolean isCitizen = false;
    // age 18 or above and he is a citizen -> eligible to vote.
    if (age >= 18) {
      if (isCitizen) {
        System.out.println("Eligible to vote.");
      } else {
        System.out.println("Not eligible. Not a citizen.");
      }
    } else { // < 18
      if (isCitizen) {
        System.out.println("Not eligible. Age < 18.");
      } else {
        System.out.println("Not eligible. Age < 18 and not a citizen.");
      }
    }
    // Eligible to vote.
    // Not eligible. Age < 18.
    // Not eligible. Not a citizen.
    // Not eligible. Age < 18 and not a citizen.

    // Example 10
    double totalPurchase = 250.0;
    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount
    double discount = 0.0d;
    if (totalPurchase >= 500.0) {
      discount = totalPurchase * 0.2;
    } else if (totalPurchase >= 200.0 && totalPurchase < 500.0) {
      discount = totalPurchase * 0.1;
    }
    double amountToPay = totalPurchase - discount;

    System.out.println("Discount amount=" + discount);
    System.out.println("Amount to Pay=" + amountToPay);

    // Example 11
    char c = 'a';
    // a e i o u -> vowel
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is vowel.");
    } else {
      System.out.println(c + " is consonant.");
    }
    // a is vowel.
    // c is consonant.

    // Teaching
    // contains()
    String s1 = "hello";
    System.out.println(s1.contains("ll")); // true
    System.out.println(s1.contains("lll")); // false
    s1 = "helloll";
    System.out.println(s1.contains("ll")); // true

    // Example 12
    String password = "Admin1234567#";

    // Strong password definition:
    // # ! @ $ -> special character
    // password length >= 12
    boolean withoutSpecialCharacter = false;
    if (password.length() >= 12) {
      withoutSpecialCharacter = !password.contains("#") //
          && !password.contains("!") //
          && !password.contains("@") //
          && !password.contains("$");
      if (!withoutSpecialCharacter) {
        System.out.println("It is a strong password.");
      } else {
        System.out.println("It is a weak password. No speical character.");
      }
    } else { // < 12
      System.out.println("It is a weak password. Length < 12.");
    }

    // It is a strong password.
    // It is a weak password. No speical character.
    // It is a weak password. Length < 12.

    // testcase
    // Admin1234567# -> xxx
    // Admin1234#
    // Admin123
    // Admin123456789

  }
}
