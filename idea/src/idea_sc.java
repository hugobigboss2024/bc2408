
import java.util.Scanner;

public class idea_sc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("give me a number for start");
    int start = sc.nextInt();
    System.out.println("give me a number for emd");
    int end = sc.nextInt();
    int count = 0;
    for(int i = start; i <= end; i++){
    if(i % 3 == 0 && i % 5 ==0){
     // System.out.println(i);
     count++;
    }
    }System.out.println(count);
    /////////////////////////
    

  }
  
}
