
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x = 3;
    int x2 = 6;
    int x3 = -4;

    int max;
    if (x > x2) {
      if (x > x3) {
        max = x;
      } else {
        max = x3;
      }
    } else { // x2 > x
      if (x2 > x3) {
        max = x2;
      } else {
        max = x3;
      }
    }
    System.out.println("max=" + max); // 6

    // how about we compare 10 numbers?
    // You have to define the length of array before you use it.
    int[] arr = new int[3]; // 3 means the length of array
    // Assign the values to array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    // print out all numbers from the array
    System.out.println(arr[0]); // 3
    System.out.println(arr[1]); // 6
    System.out.println(arr[2]); // -4
    System.out.println(arr.length); // 3

    // for loop -> print the values in array
    for (int i = 0; i < arr.length; i++) { // 0 1 2
      // System.out.println(i);
      System.out.println(arr[i]); // 3 6 -4
    }

    // declare an array for double
    // for loop
    double[] arr2 = new double[5];
    arr2[0] = 16.1;
    arr2[1] = 3.4d;
    arr2[2] = 2.8f; // float -> double
    arr2[3] = -4.9;
    arr2[4] = 10; // int -> double
    // arr2[5] = 10.2; // java.lang.ArrayIndexOutOfBoundsException

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
    // char[], boolean[], byte[], short[], long[], float[], String[]

    // Example 1
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    // Find the max num from the array
    // Loop
    int maxNum = -2_100_000_000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > maxNum) {
        maxNum = arr3[i];
      }
    }
    System.out.println("maxNum=" + maxNum); // 6

    // Example 2
    // Find the min. number
    int minNum = 2_100_000_000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < minNum) {
        minNum = arr3[i];
      }
    }
    System.out.println("minNum" + minNum); // -4

    // Example 3
    // Find the longest string.
    String[] strings = new String[3];
    strings[0] = "abcd";
    strings[1] = "hello";
    strings[2] = "12309000";
    String longestString = ""; // length = 0

    // code here ...
    // strings[i].length() -> A String Value length
    // strings.length -> string array length
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > longestString.length()) {
        longestString = strings[i];
      }
    }
    System.out.println("The longest string=" + longestString);

    // Example 4
    // prices.length = quantities.length
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];
    }
    System.out.println("Total Amount=" + totalAmount);

    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    // loop
    double total = 0.0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i]; // double + int
    }
    System.out.println("Average score=" + total / scores.length);

    // declare and initialize an array
    // approach 1
    String[] arr5 = new String[3];
    // approach 2
    String[] arr6 = new String[] {"abc", "def", "ijk"}; // length = 3
    // approach 3
    String[] arr7 = {"abc", "def", "ijk"};
    // arr6[3]; // error

    // Example 6 *****
    // from array to array
    int[] arr8 = new int[] {100, -20, 40, 33, 90, 44, 66};
    // Find all numbers that > 40 and divided by 3
    int[] answers = new int[7];
    int idx = 0;
    for (int i = 0; i < arr8.length; i++) {
      if (arr8[i] > 40 && arr8[i] % 3 == 0) {
        answers[idx++] = arr8[i];
      }
    }
    // Print out array
    System.out.println(Arrays.toString(answers)); // [90, 66, 0, 0, 0, 0, 0]

    // Example 7
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    char backup;
    // swap - by backup
    backup = arr9[0];
    arr9[0] = arr9[1];
    arr9[1] = backup;
    System.out.println(arr9[0]); // a
    System.out.println(arr9[1]); // h

    // Example 8
    // Move the first character to the tail
    // You cannot create another array
    char[] arr10 = new char[] {'9', '4', '3', '2', '1', '0'};
    // [9, 4, 3, 2, 1, 0]
    // [4, 9, 3, 2, 1, 0]
    // [4, 3, 9, 2, 1, 0]
    // [4, 3, 2, 9, 1, 0]
    // [4, 3, 2, 1, 9, 0]
    // [4, 3, 2, 1, 0, 9]
    // loop + swap
    backup = ' ';
    for (int i = 0; i < arr10.length - 1; i++) { // java.lang.ArrayIndexOutOfBoundsException
      // swap
      backup = arr10[i];
      arr10[i] = arr10[i + 1];
      arr10[i + 1] = backup;
    }
    System.out.println(Arrays.toString(arr10));

    // Example 9
    int[] arr11 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // Move the max value to tail
    // [x, x, x, x, x, x, 200]

    // [100, -100, -4, 5, -2, 200, 9]
    // [-100, 100, -4, 5, -2, 200, 9]
    // [-100, -4, 100, 5, -2, 200, 9]
    // [-100, -4, 5, 100, -2, 200, 9]
    // [-100, -4, 5, -2, 100, 200, 9]
    // [-100, -4, 5, -2, 100, 200, 9]
    // [-100, -4, 5, -2, 100, 9, 200]
    int backup2 = -1;
    for (int i = 0; i < arr11.length - 1; i++) {
      if (arr11[i] > arr11[i + 1]) { // swap by condition
        backup2 = arr11[i];
        arr11[i] = arr11[i + 1];
        arr11[i + 1] = backup2;
      }
    }

    // Example 10
    int[] arr12 = new int[] {100, -100, -4, 5, -2, 200, 9};
    // sum all values
    // 208
    int sum = 0;
    for (int i = 0; i < arr12.length; i++) {
      // sum = sum + arr12[i];
      sum += arr12[i];
    }
    System.out.println("sum=" + sum);

    // Example 11 - Bubble Sort
    // refer to example 9
    // Sorting
    long[] arr13 = new long[] {10, 3, -4, 9, 100, 70};
    // Move the max value to the tail repeatedly

    // 1st round: [10, 3, -4, 9, 70, 100]
    // 2nd round: [x, x, x, x, 70, 100]
    // 3rd round: [x, x, x, 10, 70, 100]
    // 4th round: ....
    // last round: [-4, 3, 9, 10, 70, 100]
    long backup3 = -1;
    for (int i = 0; i < arr13.length - 1; i++) { // 5 times, 0,1,2,3,4
      for (int j = 0; j < arr13.length - i - 1; j++) { // Move max value to tail
        if (arr13[j] > arr13[j + 1]) {
          // swap
          backup3 = arr13[j];
          arr13[j] = arr13[j + 1];
          arr13[j + 1] = backup3;
        }
      }
    }
    System.out.println("arr13=" + Arrays.toString(arr13));
    // arr13=[-4, 3, 9, 10, 70, 100]


    // default value for int[]
    int[] arr14 = new int[4];
    System.out.println(Arrays.toString(arr14)); // [0, 0, 0, 0]
    // 0.0 for double/ float
    // 0 for short, byte, long

    // default value for boolean[]
    boolean[] arr15 = new boolean[3];
    System.out.println(Arrays.toString(arr15)); // [false, false, false]

    // default value for char[]
    char[] arr16 = new char[3];
    arr16[0] = ' ';
    arr16[1] = '\u0000';
    arr16[2] = ' '; // [ , , ]
    System.out.println(Arrays.toString(arr16));

    arr16[1] = ' '; // [ , , ]
    System.out.println(Arrays.toString(arr16));

    if (arr16[0] == '\u0000') { // false
      System.out.println("Space = \u0000");
    }
    if (arr16[0] == ' ') { // true
      System.out.println("it is a space character.");
    }

    // String[], length 3
    // 2 ways to declare String array
    String[] arr17 = new String[] {"hello", "abc", "def"}; // fixed length 3
    System.out.println(arr17[1]); // abc
    arr17 = new String[4];
    // Create String array object (heap memory)
    // arr17 -> Object Reference (Variable)
    arr17[2] = "ijk";
    // Create String object, and assign String address to one of the addresses
    // inside the array
    System.out.println(Arrays.toString(arr17)); // [null, null, "ijk", null]


    // 2D Array
    int[][] arr18 = new int[2][3]; // 2 rows (index 0,1) x 3 columns (0,1,2)
    arr18[1][1] = 100;
    arr18[1][2] = -99;
    arr18[0][1] = 1;
    // arr18[2][1] = 11; // error
    System.out.println(Arrays.deepToString(arr18)); // [[0, 1, 0], [0, 100,
                                                    // -99]]

    System.out.println(arr18.length); // row length -> 2
    System.out.println(arr18[0].length); // column length -> 3
    System.out.println(arr18[1].length); // column length -> 3
    System.out.println(Arrays.deepToString(arr18)); // [[0, 1, 0], [0, 100, -99]]

    // for loop -> access 2D array
    for (int i = 0; i < arr18.length; i++) { // row -> 2
      for (int j = 0; j < arr18[0].length; j++) { // column -> 3 -> reset
        System.out.println("[" + i + "][" + j + "]=" + arr18[i][j]);
      }
    }

    // Example 12
    int count = 0;
    int[] arr19 = new int[] {9, 4, 2, 2, 3, 9, 3};
    // The number of 2 = 2
    for (int i = 0; i < arr19.length; i++) {
      if (arr19[i] == 2) {
        count++;
      }
    }
    System.out.println("The number of 2 = " + count);

    // Given int value: 10 <= x <= 99
    int[] arr20 = new int[] {99, 14, 12, 12, 10, 13, 99, 99, 13};
    // Find the Max. Count's value -> 9

    // value -> index
    int[] counts = new int[90]; // 0 - 89
    for (int i = 0; i < arr20.length; i++) {
      counts[arr20[i] - 10]++;
    }
    int max2 = 0;
    int target = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max2) {
        max2 = counts[i];
        target = i + 10;
      }
    }
    System.out.println("Max. Count's value=" + target); // Max. Count's value=99

    // Arrays.copyof()
    // Problem
    // arr4 -> obj ref
    // int array object
    int[] arr4 = new int[] {1, 2, 3};
    arr4 = new int[] {2, 3, 4};

    // We have 2 object reference, but one object
    // Example 1
    int[] arr21 = new int[] {1, 2, 3};
    int[] arr22 = arr21; // Pass by reference
    System.out.println(arr21[2]); // 3
    System.out.println(arr22[2]); // 3

    arr21[1] = 100;
    System.out.println(arr21[1]); // 100
    System.out.println(arr22[1]); // 100

    // Example 2 (Primitive)
    int x1 = 10;
    int x4 = x1; // Pass by value
    System.out.println(x4); // 10

    x1 = 100;
    System.out.println(x1); // 100
    System.out.println(x4); // 10

    // Example 3 (Wrapper Class/ String)
    String s1 = "abc";
    String s2 = s1; // Pass by value
    s1 = "def";
    System.out.println(s1); // def
    System.out.println(s2); // abc

    // Conclusion
    // 8 Primitives + 8 Wrapper Classes + String -> Pass by value
    // Other than that -> Pass by reference

    // For Pass by reference -> you can refer to example 1.
    // For Pass by valuef -> you can refer to example 2 and 3.

    // How to backup an array?
    // Arrays.copyOf()
    // Heap memory -> create another int array
    // define the length of new array
    int[] backupArray = Arrays.copyOf(arr21, arr21.length); 
    System.out.println(Arrays.toString(backupArray));

    // Bubble Sort/ Insertion Sort (Nested Loop)
    int[] beforeSort = new int[] {30, -3, 100, -102};
    Arrays.sort(beforeSort); // performance: nlogn
    System.out.println(Arrays.toString(beforeSort));

  }
      }
                
     







