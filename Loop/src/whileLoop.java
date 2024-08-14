package Loop.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class whileLoop {
  public static void main(String[] args) { //i -> counter
    int sum = 0;
    for(int i = 0; i < 5; i++){
      sum += i;
    }
    System.out.println(sum);
    //////////////////////////////
    int count = 0;
    sum = 0;
    while(count < 5) {  //when count == 5, exit loop
      sum += count;
      count++;
    }
    System.out.println(sum);
    ///////////////////////////
    //Random
    int value =new Random().nextInt(5) + 1;
    System.out.println(value);
    //guess a number
    Scanner sc = new Scanner(System.in);
    int number = -1;
    while (true) { 
       System.out.println("plz input a num 1-5: ");
      number = sc.nextInt();
      System.out.println("CCCCC");
       
    //leetcode
    //approach1
    int code = 1234;
    char[] codes = new Integer(code).toString().toCharArray();
    System.out.println(Arrays.toString(codes));
    //approach2 //Tips: % and / 
    //1234%10 ->4 //1234/10 _>123 //how to convert 1 to '1'
    int a = 0;
    int arrLength = 0;
    while (a > 0) { 
    //(char) (a % 10 + '0');
    a =a / 10;
    arrLength++;
    
    }
    } 
       
       


    }
  }

