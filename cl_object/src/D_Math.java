
public class D_Math {
  public static void main(String[] args) {
      //min
      System.out.println(Math.min(7, 3));
      System.out.println(Math.min(2, 8));
      System.out.println(Math.min(5, 5));
      //max
      System.out.println(Math.max(7, 3));
      System.out.println(Math.max(2, 8));
      System.out.println(Math.max(5, 5));
      //fine max
      int[] arr = new int[] {3, 6, -1, 100, 4};
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        //if (arr[i] > max) max = arr[i];
        max = Math.max(arr[i], max);

        
      }System.out.println(max);
      //fine  min
  }
}
