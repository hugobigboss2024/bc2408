
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
      // ArrayList vs LinkedList
      // Same:
      // 1. Implement List Interface: add(), remove(), size(), get() ...
      // 2. With Ordering
  
      // Difference:
      // 1. Polymorphism -> different implementation for same method (almost all
      // methods)
      // 2. Performance: Add/remove head/tail element -> LinkedList perform better
      // if we know the exact index of position for searching, ArrayList will be better
    }
  
    // CharSequence (String, StringBuilder)
    // List<String> (ArrayList<String>, LinkedList<String>)
    public static int search(List<String> strings, String target) {
      for (int i = 0; i < strings.size(); i++) {
        if (target.equals(strings.get(i))) // ArrayList will perform better in get() method
          return i;
      }
      return -1;
    }
  }