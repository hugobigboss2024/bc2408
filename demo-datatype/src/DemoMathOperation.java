public class DemoMathOperation {
  public static void main(String[] args) {
    int x = 10 + 3;
    System.out.println(x); // 13

    x = x + 3 - 9;
    System.out.println(x); // 7

    x = x - 5 * 2; // 5 x 2 first
    System.out.println(x); // -3

    x = (x - 1) / 2; // (-3 - -1) / 2
    System.out.println(x); // -2

    // Speical operator -> %
    int remainder = 5 % 2;
    System.out.println(remainder); // 1

    int remainder2 = 10 % 2;
    System.out.println(remainder2); // 0

    System.out.println(0 / 10); // 0
    // System.out.println(10 / 0);
    // as developer, you should avoid divided by zero

    int j = 2;
    System.out.println(10 / j); // 5
    // You should avoid j become 0, before you decided to "10 / j"

    // double
    // +, -, *, /, %
    // / zero
    double d = 10.0 / 5.0;
    System.out.println(d); // 2.0

    double d2 = 10.0 / 5; // double/int -> double/double
    System.out.println(d2); // 2.0

    double d3 = (14.0 - 9.5) / 0.5 * 3;
    System.out.println(d3); // 27.0

    double d4 = 10.0 % 3.5;
    System.out.println(d4); // 3.0

    double d5 = 0 / 10.5;
    System.out.println(d5); // 0.0
    double d6 = 10.6 / 0;
    System.out.println(d6); // Infinity

    double d7 = 0.2 + 0.1;
    System.out.println(d7); // 0.30000000000000004

    // + 1 operations
    int a = 1;
    a = a + 1;
    a++;
    ++a;
    a += 1; // equals to "a = a + 1"
    System.out.println(a); // 5

    // + 2 operations
    int b = 1;
    b = b + 2;
    b += 2;
    System.out.println(b); // 5

    // - 1 operations
    a = a - 1;
    a--;
    --a;
    a -= 1; // equals to "a = a - 1"
    System.out.println(a); // 1

    // * 2 operations
    b = b * 2;
    b *= 2;
    System.out.println(b); // 20

    // Divide 3 operations
    int r = 99;
    r = r / 3;
    r /= 3;
    System.out.println(r); // 11

    // Example 1
    int apples = 3;
    int oranges = 10;
    double pricePerApple = 3.3;
    double pricePerOrange = 5.5;

    // code
    double totalAmount = apples * pricePerApple + oranges * pricePerOrange;
    // int * double + int * double
    // double * double + double * double
    // 3.0 * 3.3 + 10.0 * 5.5

    System.out.println(totalAmount); // 3 * 3.3 + 10 * 5.5

    // Example 2
    int maths = 90;
    int english = 78;
    int history = 62;

    double averageScore = (maths + english + history) / 3;
    // (int + int + int) / int
    // int / int 
    // -> int
    // 230 / 3 -> 76.6666

    System.out.println(averageScore); // 76.0

    // 3 is int value while 3.0 is double value

    // ++x, x++, --x, x--
    int k = 0;
    int o = k++ + 3;
    // 1. k + 3
    // 2. Assignment (assing to o)
    // 3. k + 1
    System.out.println(o); // 3
    System.out.println(k); // 1
    
    int u = 0;
    int e = ++u + 3;
    // 1. u + 1
    // 2. u + 3
    // 3. Assignment (assign to e)
    System.out.println(e); // 4
    System.out.println(u); // 1

    // You practice x-- and --x yourself, same as the above.

  }
  
}
