import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
    // Hashtable is synchronized version of HashMap
    private Map<Integer, String> nameMap = new HashMap<>(); // differs to Hashtable

    public Map<Integer, String> getNameMap() {
        return this.nameMap;
    }

    public static void main(String[] args) {
        // Hashtable VS HashMap
        DemoHashtable demo = new DemoHashtable();
        Runnable addNames1 = () -> {
            for (int i = 0; i < 100; i++) {
                demo.getNameMap().put(i, "x");
            }
        };
        Runnable addNames2 = () -> {
            for (int i = 0; i < 100; i++) {
                demo.getNameMap().put(i, "y");
            }
        };
        Thread thread1 = new Thread(addNames1);
        Thread thread2 = new Thread(addNames2);
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // main thread will stop here to wait for thread 1
                            // completes
            thread2.join(); // main thread will stop here to wait for thread 2
                            // completes
        } catch (InterruptedException e) {
        }
        // ! Map.size() may not reflect the actual number of entries at all times
        // (multi thread)
        System.out.println(demo.getNameMap().size()); // 129
        // Lambda
        demo.getNameMap()
                .forEach((k, v) -> System.out.println("key=" + k + ", value=" + v)); // 100 entries
        System.out.println(demo.getNameMap().size()); // 129
        demo.getNameMap().put(1001, "abc");
        System.out.println(demo.getNameMap().size()); // 129
        // Other differences of Hashtable and HashMap
        Map<String, String> table = new Hashtable<>();
        // ! 1. Not support null key
        // table.put(null, "hello"); // java.lang.NullPointerException
        // ! 1. Not support null value
        // table.put("abc", null); // java.lang.NullPointerException
    }
}