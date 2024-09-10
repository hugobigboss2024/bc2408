public class ExceptionChainExample3 {
    // !!!! No Exception
    public static void main(String[] args) {
        method1(10, 0);
    }

    public static int method1(int x, int y) {
        try {
            return method2(x, y); // method2() throw an exception
        } catch (ArithmeticException e) { // catch the exception, and do nothing

        }
        return -1;
    }

    public static int method2(int x, int y) {
        return x / y;
    }
}
