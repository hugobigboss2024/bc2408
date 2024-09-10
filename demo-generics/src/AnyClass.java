public class AnyClass {
    public static <P extends Number> Box<P> createNumberBox(P value) {
        return new Box<P>(value);
    }
}
