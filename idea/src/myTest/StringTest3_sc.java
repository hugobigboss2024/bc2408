package myTest;

import java.util.Scanner;

public class StringTest3_sc {
  public static void main(String[] args) {
      //what time need StringBuilder: 1,String append String. 2,revers String???
    //String s = getString();
    //int len = getString().substring(1).replace("A", "Q").length();
    //System.out.println(len);
    Scanner sc = new Scanner(System.in);
    System.out.println("in put");
    String str = sc.next();

    String result =new StringBuffer().append(str).reverse().toString();
    if(str.equals(result)){
      System.out.println("is");
    }else{
      System.out.println("not");
    }
  }
  //public static String getString(){
   // Scanner sc = new Scanner(System.in);
  //  System.out.println("in put something");
   // String str = sc.next();
   // return str;
  }
//}
