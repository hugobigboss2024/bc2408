package cl_object.src;

import java.math.BigDecimal;

public class Calculator {
  private double x;
  private double y;

  public Calculator() {

  }

  public Calculator(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // c.setX(3);
  // c.setY(5);
  // c.sum()
  // !!! Understand why sum() and sum(double x, double y) co-exists.
  public double sum() { // method signature
    return BigDecimal.valueOf(this.x).add(BigDecimal.valueOf(this.y))
        .doubleValue();
  }

  public double sum(double x, double y) {
    // !!! x is different to this.x
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)) //
        .add(BigDecimal.valueOf(this.x)).doubleValue();
  }

  public static double sum2(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static void main(String[] args) {
    // sum
    Calculator c = new Calculator(); // object
    System.out.println(c.sum(3, 5)); // 8.0

    System.out.println(Calculator.sum2(3, 5)); // 8.0

    Calculator c2 = new Calculator(3, 5); // or you can use setter
    System.out.println(c2.sum()); // 8.0

    Calculator c3 = new Calculator(3, 5);
    System.out.println(c3.sum(4.0, 10.0)); // 17.0 (10 + 4 + 3)
  }
}
