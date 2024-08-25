
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DBigDecimal {
  public static void main(String[] args) {
      // A special type in Java
    // Problem (double, float in Math Operation +,-,*,/)
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    System.out.println(0.2f * 0.1f); // 0.020000001
    System.out.println(0.2f / 0.1f); // 2.0
    System.out.println(0.2f - 0.1f); // 0.1
    System.out.println(0.2 * 0.1); // 0.020000000000000004
    System.out.println(0.2 + 0.2); // 0.4

    // System.out.println(10 / 0); // NOT OK

    double x = 0.2 + 0.1;
    if (x == 0.3) {
      System.out.println("x = 0.3");
    } else {
      System.out.println("x != 0.3");
    }

    // BigDecimal (double)
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    // instance method for Math operations
    double result = bd1.add(bd2).doubleValue();
    System.out.println(result); // 0.3

    // multiply
    System.out.println(bd1.multiply(bd2).doubleValue()); // 0.02
    System.out.println(bd1.multiply(bd2).intValue()); // 0

    // subtract
    System.out.println(bd1.subtract(bd2).doubleValue()); // 0.1
    // divide
    System.out.println(bd1.divide(bd2).doubleValue()); // 2.0

    // for most the cases, you should start with a double primitve
    bd1 = BigDecimal.valueOf(10);
    bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); // 3.0
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP)); // 3.333 ->
                                                                  // 3.33
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING)); // 3.333 ->
                                                                  // 3.34

    // Non-terminating decimal expansion
    // bd1.divide(bd2).setScale(2, RoundingMode.HALF_UP).doubleValue(); //
    // 3.3333333....

    // For divided by zero, you should have specific handling before divide()
    double m = 0.0;
    if (m == 0.0) {
      result = 0.0;
    } else {
      result = bd1.divide(BigDecimal.valueOf(m), 2, RoundingMode.HALF_UP)
          .doubleValue();
    }
    // java.lang.ArithmeticException
    // System.out.println(bd1.divide(BigDecimal.valueOf(m), 2,
    // RoundingMode.HALF_UP));

    System.out.println(BigDecimal.valueOf(3.440).setScale(2, RoundingMode.UP)); // 3.44
    System.out.println(BigDecimal.valueOf(3.441).setScale(2, RoundingMode.UP)); // 3.45
    System.out
        .println(BigDecimal.valueOf(3.444).setScale(2, RoundingMode.HALF_UP)); // 3.44
    System.out
        .println(BigDecimal.valueOf(3.445).setScale(2, RoundingMode.HALF_UP)); // 3.45

    // equals()
    System.out
        .println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); // false
    System.out
        .println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); // true
    System.out.println(BigDecimal.valueOf(10L).doubleValue() == BigDecimal
        .valueOf(10.0).doubleValue()); // true

    // compareTo()
    System.out
        .println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); // 0
    System.out
        .println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
    System.out
        .println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1

    // new BigDecimal
    double d1 = new BigDecimal("0.1").add(new BigDecimal("0.2")).doubleValue();
    System.out.println(d1); // 0.3

    double d2 = new BigDecimal(0.1).add(new BigDecimal(0.2)).doubleValue();
    System.out.println(d2); // 0.30000000000000004

    double d3 =
        BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue(); // 0.3
    System.out.println(d3); // 0.30000000447034836

    
    // float (0.1f) -> double (0.1d)
    // problem
    double d4 =
        BigDecimal.valueOf(0.1f).add(BigDecimal.valueOf(0.2f)).doubleValue(); // 0.3.....
    float f1 = 0.1f;
    float f2 = 0.2f;
    // !!!!!
    System.out.println("float+float=" + new BigDecimal(String.valueOf(f1))
        .add(new BigDecimal(String.valueOf(f2)))); // 0.3

    // BigDecimal.valueOf("0.1"); // error
    // 0.1d -> 64-bit
    System.out.println(BigDecimal.valueOf(0.1d)); // 0.1000000000000000055511151231257827021181583404541015625
    System.out.println(BigDecimal.valueOf(0.2d)); // 0.20000000000000000xxxxxxx
    // 0.1f -> 32-bit
    // 0.1f -> 0.1d
    System.out.println(BigDecimal.valueOf(0.1f)); // 0.10000000149011612 ->
                                                  // 0.10000000149011612
  }
}
