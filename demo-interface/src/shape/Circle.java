package shape;

import java.math.BigDecimal;

public class Circle implements Shape {
  private double radius;
  private String color;

  public Circle(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return this.color;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }
}
