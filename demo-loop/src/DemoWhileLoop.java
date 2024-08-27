import java.util.Arrays;
import java.util.Random;

public class DemoWhileLoop {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 5; i++) { // i -> counter
      sum += i;
    }
    System.out.println(sum); // 10

    // while
    int count = 0;
    sum = 0;
    while (count < 5) { // when count == 5, exit loop
      if (count % 2 != 0) {
        sum += count;
      }
      count++;
    }
    System.out.println(sum); // 10

    // random
    int value = new Random().nextInt(5) + 1; // 1 - 5
    System.out.println(value);

    // Guess a number
    // Scanner scanner = new Scanner(System.in);
    // int number = -1;
    // while (number != value) { //
    // System.out.print("Please input a number between 1 - 5: ");
    // number = scanner.nextInt(); // capture user input
    // }
    // System.out.println("Congrats!!!");

    // leetcode
    int code = 1234;

    // Approach 1
    // int -> Integer -> String -> char[]
    char[] codes = new Integer(code).toString().toCharArray();
    System.out.println(Arrays.toString(codes)); // [1, 2, 3, 4]

    // Approach 2
    // Tips: % and /
    int a = code;
    int arrLength = 0;
    while (a > 0) {
      // 1234 % 10 -> 4
      // (char) (a % 10 + '0'); // int -> char
      // how to convert 4 to '4'
      // 1234 / 10 -> 123
      a = a / 10;
      arrLength++;
    }
    codes = new char[arrLength];
    a = code;
    int idx = 0;
    while (a > 0) {
      codes[idx++] = (char) (a % 10 + '0'); //  0 -> '0', 1 -> '1'
      a = a / 10;
    }
    System.out.println(Arrays.toString(codes)); // [4, 3, 2, 1]
    // reverse
    char backup = ' ';
    for (int i = 0; i < codes.length / 2; i++) {
      backup = codes[i];
      codes[i] = codes[codes.length - i - 1];
      codes[codes.length - i - 1] = backup;
    }
    System.out.println(Arrays.toString(codes)); // [1, 2, 3, 4]

    char c = (char) ('a' + 1);
    System.out.println(c); // b

    count = 0;
    sum = 0;
    while (true) { // by default infinite loop
      // 1000 lines ... 6 break
      sum += count;
      count++;
      if (count > 4)
        break;
    }
    System.out.println(sum); // 10

    //
    int num = 54321;
    String result = "";
    while (num > 0) {
      result += num % 10; // retrieve, String + int
      num /= 10; // 54321 -> 5432 -> 543 -> 54 -> 5 -> 0 (exit)
    }
    System.out.println(result); // 12345
    

  }
}