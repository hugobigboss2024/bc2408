public class DemoCharSequence {
    public static void main(String[] args) {
      // String implements CharSequence
      // StringBuilder implements CharSequence
  
      String s = "hello";
      CharSequence s2 = "hello";
      // s2.startsWith("a");
      String s3 = (String) s2;
  
      System.out.println(s3.startsWith("he"));
      s3.substring(3);
      s3.replace("h", "H");
  
      s2.charAt(1);
      s2.length();
      s2.isEmpty();
  
      Swimable person = new Person();
      person.swim();
      // person.walk();
  
      System.out.println(concatHello2(String.valueOf("abc"))); // abchello
      System.out.println(concatHello2(new StringBuilder("abc"))); // abchello
      System.out.println(concatHello2(new StringBox("abc"))); // abchello
  
      System.out.println(lastCharacter(String.valueOf("abc"))); // c
      System.out.println(lastCharacter(new StringBuilder("abc"))); // c
      System.out.println(lastCharacter(new StringBox("abc"))); // c
    }
  
    // A design makes use of Interface to handle of different type of object (implemented CharSequence)
    public static char lastCharacter(CharSequence s) { // contract
      return s.charAt(s.length() - 1); // Polymorphism
    }
  
    // Not good design
    public static String concatHello2(CharSequence s) {
      if (s instanceof String)
        return ((String) s).concat("hello");
      if (s instanceof StringBuilder)
        return ((StringBuilder) s).append("hello").toString();
      if (s instanceof StringBox)
        return ((StringBox) s).append("hello").toString();
      return null; // throw
    }
  
    public static String concatHello1(String s) {
      return s.concat("hello");
    }
  }