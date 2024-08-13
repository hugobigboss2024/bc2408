
import java.util.Arrays;

public class DemoChart {
  public static void main(String[] args) {
      char c = 'A';
      int x = c;// upcasting / promotion
      System.out.println(x);// 65 // ASCII code
      char c3 = '0';
      int x2 = c3;
      System.out.println(x2);
//char[] -> String.class
      long al = 100L;
      float af = al;
      System.out.println(af);
      double ad = al;
      System.out.println(ad);
      int a1 = 10;
      float a2 = a1;
      double d2 = 'B';
      System.out.println(d2);
      //char math operation?
      int aa = 'a' + 'a';
      System.out.println(aa);
      //char + char =  int + int
      //counting wxample
      ///char[] arr = new char[]{'a','y','z','b','z'};
      ///int[] count = new int[10];
      ///for (int i = 0; i < arr.length; i++) {
         /// count[arr[i]-97]++; }
      ///int max = -1;
      ///char counts = ' ';
      ///for(int i = 0; i < counts.length; i++){
        ///if(counts[i] > max){
          ///max = counts[i];
          ///target = (char) (i + 97);
      
        //double -> int (precision loss)
        double d10 = 10.25;
        int x5 = (int) d10;
        System.out.println(x5);//10.25 -> 10
        d10 = 10.99;
        x5 = (int)d10;
        System.out.println(x5);//10.99 -> 10
        ///////////
        //byte b21 = 128// copmile error,not overflow
        int i21 = 128;
        byte b22 = (byte) i21;//overflow
        //Arrays.copyof()//problem
        int[] arr4 = new int[] {1,2,3};
        //arr4 -> obj ref //int array object
        arr4 = new int[] {2,3,4};
        //we have two object reference, but one object
        int[] arr21 = new int[]{1,2,3};
        int[] arr22 = arr21;
        System.out.println(arr21[2]);//3
        System.out.println(arr22[2]);//3
        arr21[1] = 100;
        System.out.println(arr22[1]);//100
        //conclusion
        //8 primitives+8wrapper classes+string -> pass by value
        //other then -> pass by reference
        //how to backup arrays
        int[] backupA = Arrays.copyOf(arr21, arr21.length);
        //System.out.println(Array.toString(backupA));
        

      }
      
      }


  
