package shape;

import java.math.BigDecimal;

// In this example, Shape should be designed as abstract class
public interface Shape {
  double area(); // abstract

  // Interface still support Polymorphism
  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area())); //
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    // Interface still support Polymorphism
    Shape[] circles = new Shape[] {new Circle(2.0), new Circle(1.0)};
    System.out.println(Shape.totalArea(circles));

    Shape shape = new Circle(3.0); // OK
    shape.area();
    // shape.getColor();
    Circle circle = (Circle) shape;
    System.out.println(circle.getColor());

    Shape[] shapes = new Circle[] {new Circle(1.0), new Circle(3.0)};
  }
}
