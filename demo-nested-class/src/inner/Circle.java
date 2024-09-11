package inner;

public class Circle implements Shape {
    public int radius;

    public int getRadius() {
        return this.radius;
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        // shape.getRadius
        // !!! NOT OK
        // shape.getRadius()
        // shape.radius
    }
}