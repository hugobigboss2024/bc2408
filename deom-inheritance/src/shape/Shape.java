package shape;

import java.math.BigDecimal;

// 2D
// public class Shape {
  public abstract class Shape {
     private Color color; // enum object default value -> null

  public Shape() {

  };

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // public double area() {
  // return -1.0d;
  // }

  // After defining the concrete class (non-abstract) become abstract,
  // 1. we can create abstract method (without implementation)
  // 2. Cannot create object for Abstract Class
  // 3. Abstract class can still hold its own attributes
  // 4. The constructor in abstract class is for child class to call
  // 5. All abstract method must be public
  abstract double area();
  
  // Circle object, Triangle object....
  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area())); // 
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    // Shape shape = new Shape();
    // System.out.println(shape.area()); // -1.0

    // Why do we need Polymorphism?
    Shape circle = new Circle(1.0); // Polymorphism
    Shape triangle = new Triangle(1.0, 1.0, Color.RED); // Polymorphism
    Shape[] shapes = new Shape[] {circle, triangle};
    System.out.println(Shape.totalArea(shapes)); // ~3.14 + 0.5 ~= 3.641592653589793
  }
  }