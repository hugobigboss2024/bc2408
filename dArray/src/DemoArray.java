
import java.util.Arrays;

public class DemoArray {
public static void main(String[] args) {
//8 primitives + String
int x = 3;
int x2 = 6;
int x3 = -4;

  
int[] arr = new int[3];
arr[0] = 3;
arr[1] = 6;
arr[2] = -4;
System.out.println(arr[0]);
//System.out.println(arr.length)
//for(int i = 0; i < arr.length;)
//EX1 find the max num from the arry//loop
int[] arr3 = new int[3];
arr3[0] = 3;
arr3[1] = 6;
arr3[2] = -4;
int maxNum = -11111111;
for (int i = 0; i < arr3.length; i++){
  if(arr3[i] > maxNum){
    maxNum = arr3[i];
    System.out.println(arr[i]);
  }
}
for (int i = 1; i < arr3.length; i++) {
    if (arr3[i] > maxNum) {
        maxNum = arr3[i];
    }
}System.out.println( maxNum);
//find the min number
int[] ar = new int[3];
ar[0] = 3;
ar[1] = 6;
ar[2] = -1;
int min = 10;
for(int i = 0; i < ar.length; i++){
  if(ar[i] > min){
    min = ar[i];
  }System.out.println(min);
}
//WX4
double[] pr = new double[4];
pr[0]=10.3;
pr[1]=7.7;
pr[2]=1.5;
pr[3]=2.3;
int[] qu = new int[4];
qu[0]=10;
qu[1]=2;
qu[2]=5;
qu[3]=4;

double ttlAmount = 0.0;
for(int i = 0; i < pr.length; i++){
  ttlAmount += pr[i] * qu[i];
}
System.out.println("ttl amount" + ttlAmount);

//Ex5//average score
int[] scores = new int[5];
scores[0]=79;
scores[1]=70;
scores[2]=50;
scores[3]=100;
scores[4]=90;
//loop
double average = 0.0d;
for(int i = 0; i < scores.length; i++){
  average += scores[i];
}
System.out.println("Average score=" + average);
//declare and intialize an array
//Ex6
int[] arr8 = new int[]{100,-20,40,33,90,44,66};
//find all number that >40 and divided by 3
int[] as= new int[7];
int a = 0;
for(int i = 0; i < arr8.length; i++){
  if(arr8[i] > 40 && arr8[i] % 3 == 0){
    as[a++] = arr8[i];
    System.out.println(Arrays.toString(as));
  }
}
//Ex7
char[] arr9 = new char[2];
arr9[0] = 'h';
arr9[1] = 'a';
//swap
char backup;
backup = arr9[0];
arr9[0] = arr9[1];
arr9[1] = backup;
System.out.println(arr9[0]);
System.out.println(arr9[1]);
//Ex8 //loop&swap
//move the first character to the tall
//you cannot careate another array
//
//char[] arr10 = new char[]{'9','4','3','2','1','0'};
//char a1 = arr10[0];
//backup = ' ';
//for(int i = 0; i < arr10.length -1; i++){
//arr10[i] = arr10[i=1];
//arr10[arr10.length -1] = a1;
//}
//arr10[arr10.length -1] = a1;
//System.out.println(Arrays.toString(arr10));
//Ex9
///int[] arr11 = new int[]{100, -100, -4, 5, -2, 200, 9};
//move the max vlue to tall
//100,-100,-4,5,-2,9,200
///int a2 = arr11[0];
///int backup2 = -1;
///for (int i = 0; i < arr11.length; i++) {
   /// if(arr11[i] > arr11[i + 1]){
      ///backup2 = arr11[i];
      ///arr11[i] = arr11[i + 1];
      ///arr11[i + 1] = backup2;
      //
      //if()
      //Ex10 sum all values +
      int[] arr12 = new int[]{100, -100, -4, 5, -2, 200, 9};
      int sum = 0;
      for(int j = 0; j < arr12.length; j++){
      sum += arr12[j];
      }System.out.println("sum" + sum);

      //Ex11 refer to ex9//sorting
      long[] arr13 = new long[]{10,3,-4,9,100,70} ;
      //-4,3,9,10,70,100
      long bcakup3 = -1;
      ///for (int o = 0; o < arr13; 0++) {
          for(int j = 0; j < arr13.length; j++){
      bcakup3 = arr13[j];
      arr13[j] = arr13[j + 1];
      arr13[j + 1] = bcakup3;          }

      //default value for int[]
      int[] arr4 = new int[4];
      System.out.println(Arrays.toString(arr4));
      //default value for boolean[]
      boolean[] arr5 = new boolean[3];
      System.out.println(Arrays.toString(arr5));
      //default value for char[]
      char[] arr6 = new char[3];
      System.out.println(Arrays.toString(arr6));
      //Ex length 3// 2 way to declare String array
      String[] arr7 = new String[]{"hello","hey","yo"};
      System.out.println(arr7[2]);
      arr7 = new String[4];
      System.out.println(Arrays.toString(arr7));//nill,null,null,null
      ////////////////
      //2d array
      int[][] arr18 = new int[2][3];
      arr18[1][1] = 100;
      arr18[2][2] = -99;
      arr18[2][1] = 1;
      System.out.println(Arrays.deepToString(arr18));
      //for loop -> access 2d array
      for (int i = 0; o < arr18.length; i++) {
        for(int j = 0; j < arr18[0].length; j++){
          System.out.println("[" + i +"}{" + j +"}");
        }
          
      }
      /////////////bubble sort
      //Ex12
      int[] arr19 = new int[]{9,4,2,2,3,9,3};
      //the numbersof 2 = 2
      int count = 0;
      for(int i = 0; i < arr19.length; i++){
        if(arr19[i] == 2){
          count++;
        }
      }System.out.println(count);
      // find the max. count's value ->9
      int[] arr20 = new int[]{9,4,2,2,0,3,9,9,3};
      int[] counts = new int[10];
      //這一行定義了一個整型數組 counts，用於記錄 arr20 中每個數字出現的次數。counts 數組的長度為 10,因為 arr20 中的數字範圍為 0-9。
      for(int i = 0; i < arr20.length; i++){
        //這個循環遍歷了 arr20 數組中的每個元素。對於每個元素,我們將 counts 數組中對應下標的值加 1,這樣就記錄了每個數字在 arr20 中出現的次數。
        counts[arr20[i]]++;
     }
     int max2 = 0;
     //這兩行分別定義了變量 max2 和 target。max2 用於記錄目前找到的出現次數最多的數字的出現次數,而 target 用於記錄這個出現次數最多的數字。
     int target = -1;
     for(int i = 0; i < counts.length; i++){
      //這個循環遍歷了 counts 數組中的每個元素。對於每個元素,我們檢查它的值是否大於目前記錄的最大值 max2。如果是,我們就更新 max2 和 target。這樣最終,max2 就記錄了 arr20 中出現次數最多的數字的出現次數,而 target 則記錄了這個數字的值。
      if(counts[i] > max2){
        max2 = counts[i];
        target = i ;
      }
     }System.out.println("max. counts value=" + target);
     //這段代碼的目的是找出 arr20 數組中出現次數最多的數字的值。通過使用 counts 數組記錄每個數字的出現次數,然後遍歷 counts 數組找到出現次數最多的數字,最終輸出它的值。

     

     
}
      }
                
     







