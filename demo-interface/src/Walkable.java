// Interface:
// 1. 100% abstraction - no implementation in Interface
// 2. No attribute
// 3. allow and implicit "public static final" only
// 4. No constructor
// 5. After Java 8, default & static keyword inside Interface
public interface Walkable {
    // Constant
    public static final double PI = 3.14;
    // This is Constant too
    int x = 24; // implicitly "public static final"
    static int y = 20; // public static final
    final int z = 20; // public static final
    static final int o = 20; // public static final
    public int w = 20; // public static final
  
    // After Java 8
    // it is instance method, by default inherited by the implementation class
    // Can be overriden
    default int sum(int x, int y) { // implicit public
      return x + y;
    }
  
    static int subtract(int x, int y) { // implicit public
      return x - y;
    }
  
    void walk();
  
    public static void main(String[] args) {
      System.out.println(Walkable.PI); // 3.14
      System.out.println(Walkable.x); // 24
  
      // How to call sum()
      System.out.println(new Person().sum(3, 2)); // 5
  
      System.out.println(Walkable.subtract(3, 2)); // 1
  
      // Person.subtract(3, 2); // NOT OK
    }
  }
