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
      char[] arr = new char[]{'a','y','z','b','z'};
      int[] count = new int[10];
      for (int i = 0; i < arr.length; i++) {
          count[arr[i]]++; 
      }
      
      }


  }
}
