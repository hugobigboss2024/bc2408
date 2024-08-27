

public class DemoChartInt {
  public static void main(String[] args) {
    char c = 'A';
    int x = c; // upcasting / promotion
    System.out.println(x); // 65 (ASCII code)

    // char c2 = x; // NOT OK, downcasting

    char c3 = '0'; // ascii -> 48
    int x2 = c3;
    System.out.println(x2); // 48

    // char[] -> String.class
    System.out.println("hello".substring(0, 2)); // he

    // long -> float
    float f1 = 10L;
    System.out.println(f1); // 10.0
    // long -> double
    double d1 = 100L;
    System.out.println(d1); // 100.0
    // int -> float
    float f2 = 10;
    System.out.println(f2); // 10.0
    // char -> float ?
    float f3 = 'c';
    System.out.println(f3); // 99.0
    // char -> double ?
    double d2 = 'B';
    System.out.println(d2); // 66.0

    // Char Math Operation -> +, -, *, /
    int sum = 'a' + 'a'; // char + char -> int + int
    System.out.println(sum); // 194 (ascii)

    // Counting Example
    char[] arr = new char[] {'a', 'y', 'z', 'b', 'a'};
    // Max count value=a
    int[] counts = new int[26];
    for (int i = 0; i < arr.length; i++) {
      counts[arr[i] - 97]++;
    }
    int max = -1;
    char target = ' ';
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max) {
        max = counts[i];
        // int -> char
        // In Java, you can still downcast the value to lower level type by
        // explicitly conversion
        target = (char) (i + 97);
      }
    }
    System.out.println(target); // a

    int s = 12360;
    char c2 = (char) s;
    System.out.println(c2); // え
    // Japanese -> 12352-12447

    // Overflow
    s = 77896; // 66535 + 12361
    char c4 = (char) s;
    System.out.println(c4); // OK, but overflow -> え

    // int -> byte
    byte b1 = (byte) 128; // 127 + 1
    System.out.println(b1); // -128
    b1 = (byte) 129;
    System.out.println(b1); // -127
    b1 = (byte) 384;
    System.out.println(b1); // -128

    int asset = (int) 2_200_000_000L;
    // overflow
    System.out.println(asset); // -2094967296

    // double -> int (precision loss)
    double d10 = 10.25;
    int x5 = (int) d10;
    System.out.println(x5); // 10.25 -> 10
    d10 = 10.99;
    x5 = (int) d10;
    System.out.println(x5); // 10.99 -> 10

    // overflow + for loop (careless mistake)
    // for (int i = 0; i < 2_200_000_000L; i++) {
       // System.out.println("hello");
    // }

    byte b20 = 7;
    int i20 = 8;
    boolean result = b20 < i20; // true

    // byte b21 = 128; // compile error, NOT overflow;
    int i21 = 128;
    byte b22 = (byte) i21; // overflow

    int[] arr2 = new int[3];
    max = Integer.MIN_VALUE; // -2.1 b
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] > max) {
        max = arr2[i];
      }
    }

    long l2 = Long.MIN_VALUE; // -9223372036854775808
    System.out.println(l2); // 2^-63

    

  }
      
      }


  
