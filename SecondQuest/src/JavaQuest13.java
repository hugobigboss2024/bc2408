public class JavaQuest13 {
  public static void main(String[] args) {
    double celsius = 23.56d;
    double[] arr = new double[] {convertKelvin(celsius), convertFahrenheit(celsius)};//method ->new array ->array??

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.println("Temperature in Kelvin: " + arr[i]);
      } else if (i == 1) {
        System.out.println("Temperature in Fahrenheit: " + arr[i]);
      }
    }
    // code here ...
  }public static double convertKelvin(double celsius) {// 在這裡寫一個方法，透過輸入攝氏溫度來返回華氏溫度
    return celsius + 273.15;
  }

  // Method to convert Celsius to Fahrenheit
  public static double convertFahrenheit(double celsius) {// 在這裡寫一個方法，透過輸入攝氏溫度來返回華氏溫度
    return celsius * 1.80 + 32.00;
  } 
}
