
import java.util.Scanner;

public class d4 {
  public static void main(String[] args) {
      //Determine whether a number is positive, negative or zero
      Scanner newNum = new Scanner(System.in);
      System.out.println("give me a number");
      int num = newNum.nextInt();
      if(num > 0){
        System.out.println("is positive");
      }else if(num < 0){
        System.out.println("is negative");
      }else{
        System.out.println("is zero");
      }
      /////////////////////////////////////////
      
  }
}
