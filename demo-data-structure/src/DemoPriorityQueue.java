import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // For PQ, it is NOT first come first serve.
    Queue<String> pq = new PriorityQueue<>(); // natural ordering of the elements
    pq.add("abc");
    pq.add("hello");
    System.out.println(pq); // [abc, hello]
    pq.add("def");
    System.out.println(pq); // [abc, hello, def] -> it is not the queue order ...
    pq.add("aaa");
    pq.add("bca");
    pq.add("bac");

    // !!! The algorithm pick the first element at poll(), but not exactly a sorting.
    // but ...  the actual ordering of this queue is ...
    System.out.println(pq.poll()); // aaa

    // Not yet sort completely
    System.out.println(pq); // [abc, bca, bac, hello, def]

    System.out.println(pq.poll()); // abc
    System.out.println(pq.poll()); // bac

    // Custom order
    // Tips: Class for sorting (Comparator)
    Queue<String> pq2 = new PriorityQueue<>(new StringDesc());

    // Person.class (name, age), isElderly()
    // PriorityQueue, Elderly always goes first.
  }
}