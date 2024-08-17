
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DBigDecimal {
  public static void main(String[] args) {
      //A special type in java
      // problem
      //big decimal (double)
      BigDecimal bd = new BigDecimal("0.2");
      BigDecimal bd1 = new BigDecimal("0.1");
      //instance method for math operation
      double result = bd.add(bd1).doubleValue();
      System.out.println(result);

      // multiply * // subtract - // add + //cdivide /
      //for most the cases, you dhould start with a double  primtve
      bd = BigDecimal.valueOf(10);
      bd1 = BigDecimal.valueOf(3);
      System.out.println(bd.divide(bd1, RoundingMode.HALF_UP).doubleValue());//3.0
      System.out.println(bd.divide(bd1, 2, RoundingMode.HALF_UP));//
      System.out.println(bd.divide(bd1, 2, RoundingMode.CEILING));

      //System.out.println(bd.divide(bd1).setScale(2, RoundingMode.HALF_UP). doubleValue());
      //BigDecimal.valueOf(3.444).setScale(2, RoundingMode.HALF_UP)
      System.out.println(BigDecimal.valueOf(3.455).setScale(2, RoundingMode.HALF_UP));
      System.out.println(BigDecimal.valueOf(3.444).setScale(2, RoundingMode.UP));

      // equals()
      System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0)));
      System.out.println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0)));

      //compareTo()
      System.out.println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0)));//0
      System.out.println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0)));//1
      System.out.println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0)));//-1
      


      
  }
}
