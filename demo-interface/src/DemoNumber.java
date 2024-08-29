public class DemoNumber {
    public static void main(String[] args) {
      // public abstract class Number
      Number l = new Long(3);
      Number i = new Integer(3);
      Number s = new Short((short) 3);
      Number b = new Byte((byte) 3);
      Number f = new Float(3.99);
      Number d = new Double(3.0);
  
      s.intValue();
      s.longValue();
      s.floatValue();
  
      System.out.println(new Long(1).compareTo(new Long(3))); // -1
      // System.out.println(l.compareTo(f)); // Number.class does not have compareTo()
    }
  }
