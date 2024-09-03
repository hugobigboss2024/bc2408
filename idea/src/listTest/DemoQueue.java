import java.util.ArrayDeque;
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

    // queue.addFirst("zzz") // Queue has addLast & removeFirst ONLY

    System.out.println(queue.size()); // 3, Collection method

    String removedString = queue.remove(); // remove head element
    System.out.println(queue); // [def, ijk]
    System.out.println(removedString); // abc

    queue.remove("ijk"); // [def] (for loop)
    System.out.println(queue);

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()

    // You may use "instanceOf" for checking
    // Usually we check the same type of instance before downcast
    // i.e. if (queue instanceOf Deque) {}
    Deque<String> deque = (Deque) queue;
    deque.addFirst("jjj");

    Deque<String> deque2 = new ArrayDeque<>(); //
    Queue<String> queue2 = new ArrayDeque<>();

    // poll()
    String head = queue.poll(); // similar to "remove"
    System.out.println(head); // jjj
    System.out.println(queue); // [def]

    // peek()
    String head2 = queue.peek(); // look up the head element
    System.out.println(head2); // def
    System.out.println(queue); // [def], still exist

    // While Loop
    queue.add("Vincent");
    queue.add("Jenny");
    queue.add("Oscar");
    System.out.println(queue.size()); // 4

    // look up the queue (likely you won't loop the queue element)
    // instead, you may consider using List if you treat it as a simple data collection
    for (String s : queue) {
      System.out.println(s);
    }

    // for loop
    System.out.println(queue.contains("Vincent")); // true
    System.out.println(queue.contains("Katie")); // false

    
    // Testing
    System.out.println(queue); // [def, Vincent, Jenny, Oscar]
    String element;
    // int count = 0;
    // while (queue.size() != 0) {
    //   // System.out.println();
    //   element = queue.poll();
    //   queue.add(element);
    //   // if (++count > 5) break; // 6 times
    // }
    // System.out.println(queue); // [Jenny, Oscar, def, Vincent]
 
    // For-Each - consumption
    while (!queue.isEmpty()) {
      element = queue.poll();
      System.out.println(element);
    }
    System.out.println(queue);

    // As a Developer, you can choose the Interface and the implementation separately
    // 1. Queue -> LinkedList or ArrayDeque
    // 2. Deque -> LinkedList or ArrayDeque
    // 3. List -> LinkedList or ArrayList

    // Choose between Queue, Deque, List
    // 1. All the above have ordering
    // 2. Queue/Deque cannot access the middle element DIRECTLY
    // 3. Deque has addFirst & removeLast
    // 4. Queue/ Deque for consumption
  }
}