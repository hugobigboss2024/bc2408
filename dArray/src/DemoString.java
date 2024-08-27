
public class DemoString {
  public static void main(String[] args) {
    // isEmpty() vs isBlank()
    String s1 = "hello";
    System.out.println(s1.isEmpty()); // false
    System.out.println(s1.isBlank()); // false

    String s2 = "";
    System.out.println(s2.isEmpty()); // true
    System.out.println(s2.isBlank()); // true

    String s3 = " ";
    System.out.println(s3.isEmpty()); // false
    System.out.println(s3.isBlank()); // true

    String s4 = " hello ";
    System.out.println(s4.isEmpty()); // false
    System.out.println(s4.isBlank()); // false

    String s5 = "Hello";
    System.out.println(s5.toLowerCase()); // hello
    System.out.println(s5); // Hello
    System.out.println(s5.toUpperCase()); // HELLO

    // indexOf()
    s5.indexOf('e'); // 1
    System.out.println(s5.indexOf('E')); // -1 (case sensitive)
    System.out.println(s5.indexOf("ll")); // 2
    System.out.println(s5.indexOf('e', 2)); // -1
    System.out.println(s5.indexOf("ll", 3)); // -1
    System.out.println(s5.indexOf("ll", 2)); // 2

    // lastIndexOf()
    System.out.println(s5.lastIndexOf('l')); // 3
    System.out.println(s5.lastIndexOf("ll")); // 2

    // +, +=
    // concat()
    String s6 = "hello";
    s6 = s6 + "!!!";

    String s7 = "hello";
    s7 += "!!!";

    String s8 = "hello";
    s8 = s8.concat("!!!");

    // startsWith()
    // endsWith()
    System.out.println(new String("bootcamp").startsWith("boot")); // true
    System.out.println(new String("bootcamp").indexOf("boot") == 0); // true

    System.out.println(new String("bootcamp").endsWith("boot")); // false
    System.out.println("bootcamp".endsWith("boot")); // false

    // replace()
    String s9 = "hello!!!";
    s9 = s9.replace('!', '?');
    System.out.println(s9); // hello???

    s9 = "abcdef";
    s9 = s9.replace("bcd", "ijk");
    System.out.println(s9); // aijkef

    System.out.println(s9.contains("ijk")); // true
    System.out.println(s9.contains("IJK")); // false
    System.out.println(s9.contains("bcd")); // false

    // trim() -> remove leading & tailing spaces
    String s10 = "  Vincent Lau ";
    s10 = s10.trim();
    System.out.println(s10); // "Vincent Lau"

    // 錯誤示範
    String s11 = "abc";
    String s12 = "abc";
    System.out.println(s11 == s12); // true
    String s13 = new String("abc");
    System.out.println(s12 == s13); // false

    // compareTo() -> 8 Wrapper Class + String.class
    // a.compareTo(b) > 0 -> a > b
    // a.compareTo(b) == 0 -> a == b
    // a.compareTo(b) < 0 -> a < b

    // String -> >, <
    // Ascii
    System.out.println("abc".compareTo("bbc")); // -1
    System.out.println("bbc".compareTo("abc")); // 1
    System.out.println("abc".compareTo("acc")); // -1
    System.out.println("abc".compareTo("abc")); // 0

    // "abc" -> "cde"
    char[] characters = "abc".toCharArray();
    System.out.println(Arrays.toString(characters)); // [a, b, c]

    char c = ' ';
    String result = "";
    for (int i = 0; i < characters.length; i++) {
      c = (char) (characters[i] + 2); // char + 2 -> int
      result += c; // String + char
    }
    System.out.println(result); // cde

    String name = "VINcENT";
    // vincent
    c = ' ';
    result = "";
    char[] names = name.toCharArray();
    for (int i = 0; i < names.length; i++) {
      c = names[i];
      if (names[i] >= 65 && names[i] <= 91) {
        c = (char) (names[i] + 32); // char + 2 -> int
      }
      result += c; // String + char
    }
    System.out.println(result);

    // indexOf()
    String jenny = "Jenny";
    // 2, not found -> -1
    char target = 'n';
    int idx = -1;
    for (int i = 0; i < jenny.length(); i++) {
      if (jenny.charAt(i) == target) {
        idx = i;
        break;
      }
    }
    System.out.println(idx); // 2

    // lastIndexOf()
    for (int i = jenny.length() - 1; i >= 0; i--) {
      if (jenny.charAt(i) == target) {
        idx = i;
        break;
      }
    }
    System.out.println(idx); // 3
    


  }
    
  }

