package d_Method.src;

public class method1 {
  public static void main(String[] args) {
      getSum(10,20);
  }
  public static char xharAt(String s, int i){
    return s.charAt(i);
  }
  public static double calculateSquareArea(double length){
    return Math.pow(length, 2.0);
  }
  public static void getSum(int num1, int num2) {
    int reault = num1 + num2;
    System.out.println(reault);
  }
  public static void method(int num1, int num2) {
      int result = num1 + num2;
      System.out.println(result);
  }
  public static double calculateCircleArea(double radius) {
    return Math.pow(radius, 2.0) * Math.PI;
  }
}
