import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // Collection.class -> Basic operation of collection
    Collection<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("xyz");
    System.out.println(strings); // [abc, xyz]

    // 
    strings = new HashSet<>();
    strings.add("ijk");
    strings.remove(new String("ijk")); // HashSet equals()
    System.out.println(strings.size()); // 0

    // Why do we need HashSet?
    strings.add("xyz");
    // !!! HashSet is used to avoid duplicated value
    boolean isAdded = strings.add(new String("xyz"));
    System.out.println(isAdded); // false, because "xyz" exists
  
    System.out.println(strings.size()); // 1
    strings.add("xyz2");
    System.out.println(strings.size()); // 2

    // !!! clear()
    strings.clear(); // after clear, it is still HashSet object
    System.out.println(strings.size()); // 0
    // if you want to have duplicated values -> ArrayList object
    strings = new ArrayList<>();
    strings.add("abc");
    strings.add("abc");
    System.out.println(strings.size()); // 2

    // ArrayList (array) vs HashSet (hash + array)
    // Same:
    // !!! 1. HashSet has NO ordering
    // 2. Add/ remove -> array -> recreate array object

    // Difference:
    // !!! 1. Polymorphism -> different implementation -> add() -> return false if duplicated
    // 2. Searching by hash code to find out duplicated

  }
}