package shape;

import java.awt.Color;
import java.math.BigDecimal;

// The implications of "extends Shape": obtains color attribute
public class Circle extends Shape { // Circle.class -> concrete class has to implement all abstract method
  private double radius;

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  // Override -> Same Method Signature
  // "@" -> annotation (for compiler to read)
  @Override // Ask compiler to check if the parent class contains area() method.
            // if no, compile error.
  // If you do not annotate it, it still override the method, coz they are same
  // method signature
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    System.out.println(circle.area()); // 38.48451000647496
  }
}