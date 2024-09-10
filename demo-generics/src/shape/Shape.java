package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// !!!!! The design/result of totaArea() and totalArea2() are different
public abstract class Shape {
    private Color color;

    abstract double area();

    // With Generics (lower boundary - <T extends Shape>)
    // !!!!!!!! List<Shape> OR List<Circle> OR List<Square>
    public static <T extends Shape> double totalArea(List<T> shapes) {
        BigDecimal bd = BigDecimal.valueOf(0.0);
        for (Shape shape : shapes) {
            bd = bd.add(BigDecimal.valueOf(shape.area()));
        }
        return bd.doubleValue();
    }

    // With Generics (lower boundary - <? super Shape>)
    // !!!!!!!! List<Shape> OR List<Circle> OR List<Square>
    // !!!!!!!! Same as totalArea()
    public static double totalArea4(List<? extends Shape> shapes) {
        BigDecimal bd = BigDecimal.valueOf(0.0);
        for (Shape shape : shapes) {
            bd = bd.add(BigDecimal.valueOf(shape.area()));
        }
        return bd.doubleValue();
    }

    // With Generics (upper boundary - <? super Shape>)
    // !!!!!!!! List<Shape> OR .... List<Any Parent Type of Shape>, i.e.
    // List<Object>
    public static double totalArea3(List<? super Shape> shapes) {
        int count = 0;
        for (Object shape : shapes) {
            count++;
        }
        return count;
    }

    // Without Generics
    // !!!!!!!! List<Shape>
    public static double totalArea2(List<Shape> shapes) {
        BigDecimal bd = BigDecimal.valueOf(0.0);
        for (Shape shape : shapes) {
            bd = bd.add(BigDecimal.valueOf(shape.area()));
        }
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        // Without Generics
        List<Shape> shapes = new ArrayList<>(
                Arrays.asList(new Circle(3.0), new Square(3.0), new Circle(4.0)));
        System.out.println(totalArea2(shapes)); // 87.53981633974483

        List<Circle> circles = new ArrayList<>(
                Arrays.asList(new Circle(3.0), new Circle(3.0), new Circle(4.0)));
        // System.out.println(totalArea2(circles)); // !!! compile error

        // With Generics (Lower Boundary)
        System.out.println(totalArea(shapes)); // 87.53981633974483
        System.out.println(totalArea(circles)); // !!! OK, 106.81415022205297

        System.out.println(totalArea4(shapes)); // 87.53981633974483
        System.out.println(totalArea4(circles)); // !!! OK, 106.81415022205297

        // With Generics (Upper Boundary)
        System.out.println(totalArea3(shapes)); // 3.0
        // System.out.println(totalArea3(circles)); // !!! Cannot pass List<Circle>
        List<Object> objects = Arrays.asList(new Object(), new Object());
        System.out.println(totalArea3(objects)); // 2.0
    }
}