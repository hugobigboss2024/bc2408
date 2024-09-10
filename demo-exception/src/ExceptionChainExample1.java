public class ExceptionChainExample1 {
    public static void main(String[] args) {
        method1(10, 0); // if there is no one handling the exception along the call stack
        // finally, main() method wil throw the exception to JVM.
    }

    public static int method1(int x, int y) {
        return method2(x, y);
    }

    public static int method2(int x, int y) {
        return x / y; // error
    }

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // at ExceptionChainExample.method2(ExceptionChainExample.java:11)
    // at ExceptionChainExample.method1(ExceptionChainExample.java:7)
    // at ExceptionChainExample.main(ExceptionChainExample.java:3)
}
