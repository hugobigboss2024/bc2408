package uncheck;

public class DividedByZero {
    public static void main(String[] args) {
        int x = 10 / 2;
        System.out.println(x); // 5

        int count = 0;
        // x = 10 / count; // java.lang.ArithmeticException, / by zero

        // Solution 1:
        if (count == 0)
            x = 0;
        else
            x = 10 / count;
        System.out.println(x);

        // Solution 2:
        try {
            x = 10 / count; // JVM will throw ArithmeticException object when count = 0
        } catch (ArithmeticException e) { // catch specific Exception Event
            // send sms to someone for the event of count = 0
            x = 0;
        }

    }
}