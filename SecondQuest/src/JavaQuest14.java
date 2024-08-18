public class JavaQuest14 {
  public static void main(String[] args) {
       // Given an integer x, return true if x is a palindrome (迴文), and false
  // otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or
  // from right to left
 // Case 1: 13431// true// Case 2: -123// false// Case 3: 1// true// Case 4: 22// true// Case 5: 1231// false
// Do not change anything in main method
    boolean res1 = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);

  }
  public static boolean palindrome(int num) {
    //負數false
    if (num < 0) {
      return false;
    }

    //反轉字
    int original = num;// backup function
    int reversed = 0; //end of all numbers input to here

    while (num != 0) {
      int lastDigit = num % 10;//take last number
      reversed = reversed * 10 + lastDigit;//reverse
      num /= 10;//del end extract number
    }

    //just make a == and retur,
    return original == reversed;
  }
}
