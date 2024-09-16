import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class home {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] copyArr = copyofRange(arr, 3, 7);
    for (int i = 0; i < copyArr.length; i++) {
      System.out.print(copyArr[i]);
    }
    //////////////////////////////////////
    int number = 100;
    System.out.println("change" + number);// 100
    change(number);
    System.out.println("change" + number);// is 100, not 200???
    ////////////////////////////////////
    int[] arr1 = { 10, 20, 30 };
    System.out.println("change" + arr1[1]);// 20
    change(arr1);
    System.out.println("change" + arr1[1]);// no need return change to 200
    ////////////////////////////////////
    int count = 0;
    for (int i = 101; i < 200; i++) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.println(i);
        count++;
      }
    }
    System.out.println("ttl have" + count);
    //////////////////////////////////////
    // verification code
    char[] chs = new char[52];// input a-z + A-Z to char[]
    for (int i = 0; i < chs.length; i++) {
      if (i <= 25) {// ASCII
        chs[i] = (char) (97 + i);// add a-z
      } else {
        chs[i] = (char) (65 + i - 26);// add A-Z
      }
    }
    String result = "";
    // randomly deaw 4 times
    // randomly deaw array address
    Random r = new Random();
    for (int i = 0; i < 4; i++) {
      int randomIndex = r.nextInt(chs.length);
      // System.out.print(chs[randomIndex]);
      result = result + chs[randomIndex];
    }
    // System.out.println(result);
    // randomly deaw a anumber of 0 - 9
    int Number = r.nextInt(10);
    result = result + Number;
    System.out.println(result);
    /*
     * for (int i = 0; i < chs.length; i++) {
     * System.out.print(chs[i] +" ");
     * }
     */
    /*
     * int i = 100;
     * boolean flag = true;
     * for(int ii = 2; ii < i; ii++){
     * if(i % ii == 0){
     * flag = false;
     * break;
     * }
     * }
     * if(flag){
     * System.out.println("is");
     * }else{
     * System.out.println("not");
     * }
     */
    //////////////////////////////////////////////////////
    // array number copy to other array(not copy address)
    // 1,make a array and input something//2,make a new array(length need same with
    ////////////////////////////////////////////////////// old array//3,set old
    ////////////////////////////////////////////////////// array and send to new
    ////////////////////////////////////////////////////// array
    int[] arr2 = { 1, 2, 3, 4, 5 };
    int[] arr3 = new int[arr2.length];
    for (int i = 0; i < arr2.length; i++) {
      // i is old array or new array every one address//arr2[i} is old array elements.
      arr3[i] = arr2[i];
    } //
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
    //////////////////////////////////////////////////////////
    // digital encryptiom
    int[] arr4 = { 1, 9, 8, 3 };
    for (int i = 0; i < arr4.length; i++) {
      arr4[i] = arr4[i] + 5;
    }
    for (int i = 0; i < arr4.length; i++) {
      arr4[i] = arr4[i] % 10;
    }
    for (int i = 0, j = arr4.length - 1; i < j; i++, j--) {// number reversal
      int temp = arr4[i];
      arr4[i] = arr4[j];
      arr4[j] = temp;
    }
    int numbers = 0;
    for (int i = 0; i < arr4.length; i++) {
      numbers = numbers * 10 + arr4[i];// array change to int(int[] -> int)
    }
    System.out.println(numbers);
    ////////////////////////////////////
    int number1 = 12345;
    int temp1 = number1;
    int count1 = 0;
    while (number1 != 0) {
      number1 = number1 / 10;
      count1++;
    }
    int[] arr5 = new int[count];
    int index1 = arr5.length - 1;
    while (temp1 != 0) {
      int ge = temp1 % 10;
      temp1 = temp1 / 10;
      arr5[index1] = ge;
      index1--;
    }
    for (int i = 0; i < arr5.length; i++) {
      System.out.print(arr5[i] + " ");
    }
    ////////////////////////////////////////////
    int a = 10;
    if (a % 2 == 0) {
      a = a * a;
    } else {
      a = a++;
    }
    System.out.println(a);//

    var r1 = 'a' + 5;// ascii
    var r2 = '5' + 5;// ascii
    var r3 = "5" + 5;// string
    var r4 = 'z' + 999999999999l;
    System.out.println("r1 = " + r1);// int 102
    System.out.println("r2 = " + r2);// int 58
    System.out.println("r3 = " + r3);// String "55"
    System.out.println(r4);// long
    ///////////////////////////////////
    String[] w1 = { "abc", "aaaaa", "bcdef" };
    String t1 = "aabcdabc";
    String[] w2 = { "abababab", "ab" };
    String t2 = "ababaababa";

    System.out.println(minValidStrings(w1, t1));// 3
    System.out.println(minValidStrings(w2, t2));// 2
  }

  public static void change(int[] arr1) {
    arr1[1] = 100;
  }

  public static int change(int number) {
    number = 200;
    return number;
  }

  public static int[] copyofRange(int[] arr, int from, int to) {
    int[] newArr = new int[to - from];
    int index = 0;
    for (int i = from; i < to; i++) {
      newArr[index] = arr[i];
      index++;
    }
    return newArr;
  }

  public static int minValidStrings(String[] words, String target) {
    // Minimum Number of Valid Strings to Form Target I
    // You are given an array of strings words and a string target.
    // A string x is called valid if x is a prefixof any string in words.
    // Return the minimum number of valid strings that can be concatenated to form
    // target. If it is not possible to form target, return -1.
    // A prefix of a string is a substring that starts from the beginning of the
    // string and extends to any point within it.
    // Example 1:Input: words = ["abc","aaaaa","bcdef"], target = "aabcdabc".
    // Output: 3
    Set<String> wordSet = new HashSet<>(Arrays.asList(words));
    int n = target.length();
    int[] dp = new int[n + 1];
    Arrays.fill(dp, n + 1);
    dp[0] = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        if (wordSet.contains(target.substring(j, i))) {
          dp[i] = Math.min(dp[i], dp[j] + 1);
        }
      }
    }

    return dp[n] > n ? -1 : dp[n];
  }
}
