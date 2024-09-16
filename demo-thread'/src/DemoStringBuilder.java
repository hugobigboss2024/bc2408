import java.io.IOException;

public class DemoStringBuilder {
    private static Appendable sb = new StringBuilder("");
    // append() -> non-atomic

    // Solution: StringBuffer

    public static void append(Appendable sb, String value) {
        try {
            sb.append(value);
        } catch (IOException e) {
        }
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();

        Runnable task1 = () -> {
            for (int i = 0; i < 10_000_000; i++) {
                append(sb, "1");
            }
            // sleep(1000); // 1 second
        };
        Thread thread1 = new Thread(task1);
        thread1.start(); // run()

        Runnable task2 = () -> {
            for (int i = 0; i < 10_000_000; i++) {
                append(sb, "2");
            }
        };
        Thread thread2 = new Thread(task2);
        thread2.start(); // run()

        try {
            thread1.join();

            thread2.join();
        } catch (InterruptedException e) {

        }

        System.out.println(sb.toString().length()); // 20_000_000 (StringBuffer), 1xxxxx (StringBuilder)
        long after = System.currentTimeMillis();
        System.out.println(after - before); // ~500ms (StringBuffer) vs ~50ms (StringBuilder)

    }
}