import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoVector {
    // private List<String> names = new ArrayList<>(); // non-atomic
    // Solution
    // private List<String> names = new Vector<>(); // Vector.add() differs to
    // ArrayList.add()
    private List<String> names = Collections.synchronizedList(new LinkedList<>());
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public List<String> getNames() {
        return this.names;
    }

    public static void main(String[] args) throws InterruptedException {
        DemoVector demo = new DemoVector();
        Runnable addNames = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                threadLocalValue.set(threadLocalValue.get() + 1); // !
                demo.getNames().add("x");
            }
            System.out.println("Thread Name=" + Thread.currentThread().getName()
                    + ", local value=" + threadLocalValue.get());
        };
        Thread thread1 = new Thread(addNames);
        Thread thread2 = new Thread(addNames);
        thread1.start();
        thread2.start();
        thread1.join(); // main thread will stop here to wait for thread 1 completes
        thread2.join(); // main thread will stop here to wait for thread 2 completes
        Thread thread3 = new Thread(addNames);
        thread3.run(); // Thread Name=main, local value=1000000
        System.out.println(demo.getNames().size()); // 2000000
    }
}