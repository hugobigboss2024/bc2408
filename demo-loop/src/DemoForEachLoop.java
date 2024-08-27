public class DemoForEachLoop {
  public static void main(String[] args) {
    // Main Difference between for-loop and for-each loop
    // for loop -> able to access all elements during each iteration
    // for-each -> easy to read/use, because no index

    // for loop
    int[] arr = new int[] {2, 9, 10, -3};

    // i -> array index
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " " + arr[arr.length - 1]);
    }
    // print out elements

    // for-each loop
    // i -> element
    int sum = 0;
    for (int i : arr) { // supports continue, break
      // System.out.println(i);
      sum += i;
    }
    // print out elements

    Integer a = null;
    a = 3;
    a = new Integer(10);

    String[] fruits = new String[] {"apple", "orange", null, "", "o", "banana"};
    // for-each loop string array
    // if
    for (String fruit : fruits) {
      if (fruit != null && fruit.length() >= 1
          && "o".equals(fruit.substring(0, 1))) {
        System.out.println(fruit.charAt(fruit.length() - 1));
      }
    }

    // default value - Wrapper Class / String
    Integer x = null;
    System.out.println(x); // null
    // x.intValue(); // error

    String s = null;
    System.out.println(s);
    // s.charAt(0); // error, Null Pointer Exception

    s = ""; // empty is an String object
    // s.charAt(0); // error, not NPE, StringIndexOutOfBoundsException
    s.length(); // 0




  }
}
