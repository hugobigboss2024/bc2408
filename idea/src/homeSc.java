
import java.util.Scanner;

public class homeSc {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz input original ticked price");
      int ticket = sc.nextInt();
      System.out.println("plz input current month");
      int month = sc.nextInt();
      System.out.println("plz input position purchased, 0 first class 1 economy class");
      int seat = sc.nextInt();
      //
      if(month >= 5 && month <= 10) {
         if(seat == 0){
          ticket = (int)(ticket * 0.9);
         }else if(seat == 1){
          ticket = (int)(ticket * 0.85);
         }else{
          System.out.println("error seat");
         }
      }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
        if(seat == 0){
          ticket = (int)(ticket * 0.9);
         }else if(seat == 1){
          ticket = (int)(ticket * 0.65);
         }else{
          System.out.println("error seat");
         }  
      }else{
          System.out.println("error");
      }
      System.out.println("your ticket is:" + ticket);
    
    ////////////////////////////////////////////////////
      
  }
 
}

