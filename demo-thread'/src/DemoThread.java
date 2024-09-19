public class DemoThread {
    public static void main(String[] args) {
        Runnable x = () -> System.out.println("hello");
        // x.run();

        // ! Process vs Thread
        // Example of Process: Lanuch a MS word software
        // Example of Thread: Something listen to you keyboard, and then execute
        // different tasks.
        // Example 2 of Thread: Something is checking your grammer mistakes, and
        // then underlined red.

        // ! What is thread in Java? How to create THread?
        // Define a task
        Runnable task1 = () -> print10();
        Thread thread1 = new Thread(task1);
        thread1.start(); // run()

        Runnable task2 = () -> task2();
        Thread thread2 = new Thread(task2);
        thread2.start(); // run()

        // ! But we have one heap memory only (Process)
        System.out.println("main() method ends ...");
    }

    public static void print10() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        throw new RuntimeException();
    }
}