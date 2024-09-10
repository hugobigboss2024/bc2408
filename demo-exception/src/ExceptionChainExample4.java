public class ExceptionChainExample4 {
    // !!!! No Exception
    public static void main(String[] args) {
        int result = 0;
        try {
            result = method1(10, 0); //
        } catch (ArithmeticException e) {
            result = -1;
        }

    }

    public static int method1(int x, int y) {
        return method2(x, y);
    }

    public static int method2(int x, int y) {
        return x / y;
    }
}