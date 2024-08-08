
import java.util.Scanner;


public class DemoScanner {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("plz input a number:");
    //e1
    int input = s.nextInt();
    //e2
    //choose an option: 1.deposit 2.withdraw 3.check balance
    //1 plz input the deposit amount:
    //2 plz input the withdraw amount:
    //3 plz out current balance
    double currentBalance = 300.0;
    if (input == 1){
      System.out.println("plz input the deposit amount:");
    }
    else if  (input == 2){
      System.out.println("plz input the withdraw amount:");
    }
    else{
      System.out.println("current balance" + currentBalance);
    }
//////////////////////////////////////////////////

  }
}
