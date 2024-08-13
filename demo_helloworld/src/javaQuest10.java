
import java.util.Scanner;

public class javaQuest10 {
  public static void main(String[] args) {
      


    /**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array


    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

  int[] newArr = new int[my_array.length];

  for (int i = 0, j = 0; i < my_array.length; i++, j++) {
      if (i == indexPosition) {
          newArr[j] = newValue;  
          j++;  
      }
      if (j < my_array.length) {
          newArr[j] = my_array[i]; 
      }}
  
  //my_array = newArr;  
 //my_array = newArr;
     System.out.println("New Array: " + Arrays.toString(newArr));
  }}

