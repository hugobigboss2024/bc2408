import java.util.Arrays;
import java.util.Scanner;

public class JavaQust10 {
  public static void main(String[] args) {
       int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...
    int[] newArr = new int[my_array.length + 1];//+1 for input new number

    for (int i = 0; i < indexPosition; i++) {
      newArr[i] = my_array[i];//every time loop send 1 number to newARR[1]
    }

    newArr[indexPosition] = newValue;//newValue 直接賦值給新數組 newArr 在索引 indexPosition 位置的元素????
    //指定位置插入新值的目的。

    for (int i = indexPosition + 1; i < newArr.length; i++) {
      newArr[i] = my_array[i - 1];
    }

    System.out.println("New Array: " + Arrays.toString(newArr));
  }
}
  

