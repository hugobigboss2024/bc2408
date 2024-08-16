public class testMethod {
  public static void main(String[] args) {
      //
      int sum = getsum(10, 20, 30);
      System.out.println(sum);
    //////////////////////////////////
    double area1 = getArea(5.3, 1.7);
    double area2 = getArea(2.4, 2.7);
    if(area1 > area2){
      System.out.println("first rectangle bigger");
    }else{
      System.out.println("second rectangle bigger");
    }
    //////////////////////////////// 
    int[] arr = {11,22,33,44,55};
    printArr(arr);
    ////////////////////////////////
    int[] arr1 ={1,5,6,3,8,10};
    int max = getMax(arr1);
    System.out.println(max);
    //////////////////////////////////
    int[] arr2 = {1,5,8,12,56,89,34,67};
    boolean flag = contains(arr2, 89);
    System.out.println(flag);
    /////////////////////////////////
    }
    public static boolean contains(int[] arr2, int number){
      for (int i = 0; i < arr2.length; i++) {
        if(arr2[i] == number){
          return true;
        }
      }
      return false;
    }
    public static int getMax(int[] arr1){
      int max = arr1[0];
      for(int i = 0; i < arr1.length; i++){
        if(arr1[i] > max){
          max = arr1[i];
        }
      }
      return max;
    }
    public static void printArr(int[] arr){
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
        if(i == arr.length -1){
        System.out.print(arr[i]);
        }else{
          System.out.print(arr[i] + ",");
        }
      }
      System.out.print("}");
    }
  public static int getsum(int num1, int num2, int num3){
    int result = num1 + num2 + num3;
    return result;}
  
  public static double getArea(double len, double width){
    double area = len * width;
    return area;
  }
/*public static void compare(double len1,double width1, double len2, double width2){
  double area1 = len1 * width1;
  double area2 = len2 * width2;
  if(area1 > area2){
    System.out.println("first rectangle is bigger");
  }else{
    System.out.println("second rectangle is bigger");
  }}*/
}
