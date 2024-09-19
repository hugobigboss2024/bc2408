// ! Another way to create a task
public class MyTask implements Runnable {
    private int x;
  
    @Override
    public void run() {
      x++;
      System.out.println("MyTask is running ....");
    }
  
    public int getX() {
      return this.x;
    }
  
    public static void main(String[] args) {
      MyTask task = new MyTask();
      // ! You can only put an object implemented Runnable
      Thread thread1 = new Thread(task);
      // ! if you execute run(), instead of start(), you didn't create one more
      // thread
      // ! You have main thread ONLY
      thread1.run(); // MyTask is running ....
      // ! You will create another thread once you execute start() method
      // thread1.start();
  
      Thread thread2 = new Thread(task);
      thread2.start();
  
      // !!! Potentially != 2
      System.out.println(task.getX()); // 2 (may be 1)
  
    }
  }