
import java.time.DayOfWeek;
import java.time.LocalDate;

public class test5 {
  public static void main(String[] args) {
    LocalDate toDay = LocalDate.now();
    // System.out.println(toDay);
    DayOfWeek dayofweek = toDay.getDayOfWeek();
    // System.out.println(dayofweek);
    LocalDate nextWeek = toDay.plusDays(7);
    // System.out.println(nextWeek);
    Integer num1 = new Integer(99);
    Integer num2 = 88;
    Integer num3 = new Integer("123");
    Integer num4 = Integer.valueOf("456");
    // System.out.println(num1);
    // System.out.println(num2);
    // System.out.println(num3);
    // System.out.println(num4);
    Integer valuie = num1.intValue();
    // System.out.println(num1.setValue(11)); //cant
    // num1.setValue(11);//wong??
    boolean isLess = num1 > num2;
    int comp = num1.compareTo(num3);
    // System.out.println(isLess+ " " +comp);
    int num5 = num1 + num3;// can 2 Integer +-*/ to int
    int primitive = 42;
    Integer wrapper = Integer.valueOf(primitive); // 装箱
    String numstr = "123";
    Integer par = Integer.parseInt(numstr);
    String fornum = Integer.toString(par);
    // System.out.println(par + " " + par +" " + numstr+ " " + primitive);
    /////////////////////////////////
    int[] target = { 1, 2, 3, 4 };
    int[] arr = { 2, 4, 1, 3 };
    boolean ab = true;
    int a = target.length;
    int b = 0;
    for (int i = 0; i < target.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        // System.out.println(i + "," + j);
        // System.out.println(target[i] + "," + arr[j]);
        if (target[i] == arr[j]) {
          b++;
          // System.out.println(b);
        }
        // System.out.println(b);
      }
    }
    if (a != b) {
      ab = false;
    }
    System.out.println(ab);

  }
}
