// ! Another way to create thread
public class MyThread extends Thread { // Worker

    // Task
    @Override
    public void run() { // Collections.sort() -> compareTo()
        // start() -> run()
        System.out.println("MyThread is runnging ...");
    }

    public static void main(String[] args) {
        int y = 3;
        Thread thread3 = y >= 3 ? new MyThread() : new Thread(() -> System.out.println("hello"));
        thread3.start(); // open-close coding style
    }

}