import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList (Queue vs Deque vs List)
    Queue<String> queue = new LinkedList<>();
    // 10000 lines ....
    queue.add("abc"); // Collection method
    queue.add("def"); // Collection method
    queue.add("ijk"); // Collection method
    System.out.println(queue.size()); // 3, Collection method

    String removedString = queue.remove(); // remove head element
    System.out.println(queue); // [def, ijk]
    System.out.println(removedString); // abc

    queue.remove("ijk"); // [def] (for loop)
    System.out.println(queue);

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()

    //
    Deque<String> deque = (Deque) queue;
    deque.addFirst("jjj");



  }
}