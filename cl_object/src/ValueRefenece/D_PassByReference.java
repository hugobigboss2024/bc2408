package cl_object.src.ValueRefenece;

import java.util.Arrays;

public class D_PassByReference {
  public static void main(String[] args) {
   int[] integers = new int[] {10, 20, -3, 9};
    // move the max value to the tail -> [x, x, x, 20]
    // algorithm (static method)
    moveMaxToTail(integers);
    System.out.println(Arrays.toString(integers)); // [10, -3, 9, 20]

    String s = "hello";
    String capString = toUpperCase(s); // pass a copy of String value
    System.out.println(s); // hello
    System.out.println(capString); // HELLO

    Dog dog = new Dog();
    dog.setName("John");
    int y = 10;
    changeDogName(dog, y);// y -> pass by value, dog -> pass by reference
    System.out.println(dog.getName()); // Peter, pass by reference
    System.out.println(y); // 10

    Dog dog2 = new Dog();
    dog2.setName("Sally");
    changeDog(dog2);
    System.out.println(dog2.getName()); // Sally
  }

  public static void changeDog(Dog original) {
    original = new Dog();
    original.setName("Benny");
  }

  public static void changeDogName(Dog dog, int x) {
    x++;
    if (x > 0) {
      dog.setName("Peter");
    } else {
      dog.setName("Jenny");
    }
  }

  // Definition:
  // primitives, wrapper class object, String object -> pass by value
  // otherwise, pass by reference

  // String object -> pass by value
  public static String toUpperCase(String s) {
    return s.toUpperCase();
  }

  // So, array is one of type that is "pass by reference"
  public static void moveMaxToTail(int[] arr) {
    int backup;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        backup = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = backup;
      }
    }
  }
}
