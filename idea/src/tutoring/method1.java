public class method1{
    public static int sum(int n){//1-n return to sum
    int sum = 0;
    for(int i = 0; i < n; i++){
       sum += i;
    }
    return sum;
  }
  public static void check(int number){
    if(number % 2 == 0){
      System.out.println("a");
    }else{
      System.out.println("b");
    }
  }
  public static int getMax(int[] a){
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if(a[i] > max){
        max = a[i];
      }
    }
    return max;
  }
  public static void printArr(int[] a){

    for (int i = 0; i < a.length; i++) {
      System.out.print(" " + a[i]);
    }
  }
  public static int fine(int[] a, int b){
      int f = 0;
    for (int i = 0; i < a.length; i++) {
      if(a[i] == b){
       return i;
      }
    }return -1;
  }
  public static boolean tf(int[] a, int[] b){
    if(a.length == b.length){
      for (int i = 0; i < a.length; i++) {
          if(a[i] != b[i]){
               return false;
          }
      }return true;
    }else{
      return false;
    }
  }
  public static void main(String[] argd){
    System.out.println(sum(5));
    int[] ages = {18,23,28,30,12};
    int max = getMax(ages);
    System.out.println(max);
    ///////////////////////////////
    int[] arr = {1,2,3,4};
    //printArr(arr);
    int a = fine(arr, 2);
    System.out.println(a);//1 or 2
    boolean two = tf(ages, arr);
    System.out.println(two);
  }
}