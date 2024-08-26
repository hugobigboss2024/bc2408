package myTest;

import java.math.BigDecimal;

public class StringTest4 {
  public static void main(String[] args) {
      int a = 9;
      int b = 5;
      System.out.println(Math.random());
      double c = (Math.pow(a,b));
      int d = Mixmix(a,b);
      StringTest4 StringTest4 = new StringTest4();
      double e = StringTest4.toD(11.1, 22.2);
      double d1 = Double.valueOf(d);

      
  }
  public static int Mixmix(int a, int b){//if not static cant make int d(9)
    if(a == b){
      return a + b;
    }else if(a > b){
      return a - b;
    }else{
      return b - a;
    }
  }
  public double toD(double a, double b){//no static, so need to add the class.method(13)
    BigDecimal a1 = new BigDecimal(a);
    BigDecimal b1 = new BigDecimal(b);
    return a1.doubleValue() + b1.doubleValue();
  }
  public static String Testsb(String a, String b){
    StringBuffer a1 = new StringBuffer(a);
    StringBuffer b1 = new StringBuffer(b);
    return a1.append(b1).toString();
  }
  public static int Testsb2(String a, String b){
    
    StringBuffer a1 = new StringBuffer(a);
    StringBuffer b1 = new StringBuffer(b);
    String c1 = a1.reverse().toString();
    String c2 = b1.append(" ").toString();
    return c1.compareTo(c2);
   
  }
}
