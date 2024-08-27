public class DemoForLoop{
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3;
    System.out.println(x); // 81

    int y = 3;
    for (int i = 0; i < 3; i++) {
      // (counter initialization; continue condition; counter +1)
      y = y * 3;
    }
    System.out.println(y); // 81
    // Step 1: int i = 0
    // Step 2: i < 3 -> true
    // Step 3: y = y * 3
    // Step 4: i++ -> 1
    // Step 5: i < 3 -> true
    // Step 6: y = y * 3
    // Step 7: i++ -> 2
    // Step 8: i < 3 -> true
    // Step 9: y = y * 3
    // Step 10: i++ -> 3
    // Step 11: i < 3 -> false
    // Step 12: Exit the loop

    // Example 1
    // print 5 times Hello World
    for (int i = 0; i < 5; i++) { // 0 1 2 3 4
      System.out.println("Hello world");
    }

    // Example 2
    // We can use i for other purpose.
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
    }

    // Example 3
    // Print all odd numbers between 0 - 10
    // Loop and if
    for (int i = 0; i < 11; i++) { // 0 1 2 3 4 5 6 7 8 9 10 -> 11 times
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // Example 4
    // Approach 1
    for (int i = 10; i > 0; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    // Approach 2
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println(10 - i);
      }
    }
    // 10
    // 8
    // 6
    // 4
    // 2

    // Example 5
    String str = "abcdefghijk"; // the index of last character 'k' is length() -
                                // 1
    // "acegik"
    // Loop, if, charAt, length
    String str2 = "";
    for (int i = 0; i < str.length(); i++) { // String's index
      if (i % 2 == 0) {
        str2 += str.charAt(i);
      }
    }
    System.out.println(str2);

    // Example 6 - counting
    String s2 = "bbaeaaacceef";
    char target = 'e';
    int count = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println("The number of character " + target + " is " + count);
    // The number of character e is 3

    // Example 7 - counting
    // 1 - 100
    // how many numbers can be divided by 3 or divided by 4?
    count = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        count++;
      }
    }
    System.out.println("count=" + count);

    // Example 8
    // 1 - 50
    // Find the total number, which sum up all odd numbers and subtract all even
    // numbers between 1 - 50
    int total = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 == 1) {
        total += i;
      } else {
        total -= i;
      }
      System.out.println(total); // -25
    }

    // Example 9
    String s3 = "abcdxyzijk";
    // Print the index of j. If j is not found, print -1
    boolean found = false;
    int pos = -1;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == 'j') {
        found = true;
        pos = i;
      }
    }
    int idx = -1;
    if (found) {
      idx = pos;
    }
    System.out.println("Position of j=" + idx);

    // Alternative
    System.out.println(s3.indexOf('j')); // 8
    s3 = "abc";
    System.out.println(s3.indexOf('j')); // -1

    // Example 10
    String s4 = "hello";
    char targetEndWith = 'o';
    // check if the last character is o -> true
    System.out.println(s4.charAt(s4.length() - 1) == targetEndWith); // true

    // endsWith(), startsWith()
    System.out.println(s4.endsWith("o")); // true
    System.out.println(s4.startsWith("he")); // true
    System.out.println(s4.startsWith("eh")); // false

    // substring
    String s5 = "abcdefghik";
    // Find "def"
    System.out.println(s5.contains("def")); // true
    // Find the index between 2 and 4
    System.out.println(s5.substring(2, 5)); // cde
    System.out.println(s5.indexOf("abc")); // 0
    System.out.println(s5.substring(0, 3)); // abc

    System.out.println(s5.substring(s5.length() - 1, s5.length())); // k, last
                                                                    // character
    System.out.println(s5.substring(0, 1)); // a, first character

    // Example 11
    String s6 = "cdegdef";
    String subString = "def";
    // Don't use indexof() or contains()
    // for loop, break
    // Found or not found
    found = false;
    String temp = "";
    for (int i = 0; i < s6.length() - subString.length() + 1; i++) {
      temp = "";
      for (int j = 0; j < subString.length(); j++) {
        temp += s6.charAt(i + j);
      }
      if (subString.equals(temp)) {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println(subString + " is found.");
    } else {
      System.out.println(subString + " is not found.");
    }

    // Nested Loop
    for (int i = 0; i < 3; i++) { // outer loop
      for (int j = 0; j < 2; j++) { // inner loop
        System.out.println("i=" + i + ",j=" + j);
      }
    }
    // i=0,j=0
    // i=0,j=1
    // i=1,j=0
    // i=1,j=1
    // i=2,j=0
    // i=2,j=1

    // Example 12
    // break -> exit the loop
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      if (i >= 3) {
        break;
      }
    }
    // hello
    // hello
    // hello
    // hello

    // Example 13
    // break - searching
    String s7 = "ijkdef";
    found = false;
    for (int i = 0; i < s7.length(); i++) {
      if (s7.charAt(i) == 'k') {
        found = true;
        break; // break the loop
      }
    }
    // Example 14
    // continue - skip some patterns
    for (int i = 0; i < 50; i++) { // 0 - 49
      if (i % 2 == 0) {
        continue; // skip the rest of code for current iteration
      }
      if (i > 30) {
        break;
      }
      System.out.println(i); // odd number and < 30
    }

    // Example 15
    // *****
    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    System.out.println("");

    // Example 16
    // ***** -> i = 0
    // **** -> i = 1
    // *** -> i = 2
    // ** -> i = 3
    // * -> i = 4

    // Nested Loop (i and j)
    for (int i = 0; i < 5; i++) { // control the number of rows
      for (int j = 0; j < 5 - i; j++) { // every row
        System.out.print("*");
      }
      System.out.println("");
    }

    // Example 17
    // ******
    // ****
    // **

    // infinite loop
    // for ( ; ; ) {
    // System.out.println("hello");
    // }

    // Mistake in condition (i >= 0)
    // for (int i = 0; i >= 0; i++) {
    //   System.out.println("hello");
    // }

    String searchMe = "peter piper picked a peck of pickled peppers";
    int num = 0;
    for (int i = 0; i < searchMe.length(); i++) {
      // without continue
      if (searchMe.charAt(i) == 'p') {
        num++;
      }
    }
    System.out.println("Found " + num + " p's in the string."); // num = ?


    // String 
    // char[] , ASCII, int

    // Method -> 3 types
    // 1. searching (contains, indexOf, lastIndexOf)
    // 2. presentation (length, charAt, isEmpty, isBlank, substring)
    // 3. transform (replace, trim, toLowerCase, toUpperCase)
  }
}