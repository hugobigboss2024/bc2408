
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
      int  min = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
        min = Math.min(arr[i], min);
      }
      System.out.println(min);
      // ABS
      int[] arr2 = new int[]{3, 6, -1, -400, 3500};
      //sum up of ABS value
      int sum = 0;
      for (int i = 0; i < arr2.length; i++) {
        sum += arr2[i] < 0 ? arr2[i] * -1 : arr2[i];
      }
      System.out.println(sum);
      //sum = 0;
      //for (int i = 0; i < arr2.length; i++) {
        //sum += Math.abs(arr2[i];)  }
        //sqr()
        int x = 81;
        System.out.println(Math.sqrt(x));//9
        //Math.round() -> nearest ingeger
        Math.round(10.456789);//10 (round to INteger)
        System.out.println(Math.floor(3.9));//3
        System.out.println(Math.ceil(3.9));//4
        System.out.println(Math.log(2));
        System.out.println(Math.log10(1000));//3.0 //
        /////////////////////////////////////
        double angleDegree = 45.0;///game need?
        double angleRedian = Math.toRadians(angleDegree);
        double sinValue = Math.sin(angleRedian);
        ///// random()
        // 0.0 (inclusive) - 1.0 (exclusive)
        System.out.println(Math.random());//

  }
}
