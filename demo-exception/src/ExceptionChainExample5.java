public class ExceptionChainExample5 {
    // !!!! Convert Exception
    public static void main(String[] args) {
        try {
            method1(10, 0); //
        } catch (RuntimeException e) {
            System.out.println("runtime exception ...");
        }
    }

    public static int method1(int x, int y) {
        try {
            return method2(x, y);
        } catch (ArithmeticException e) {
            throw new RuntimeException(); // re-throw another exception
        }
    }

    public static int method2(int x, int y) {
        return x / y;
    }
}