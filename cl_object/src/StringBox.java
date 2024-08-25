import java.util.Arrays;

public class StringBox {
  private char[] character;
  private char[] characters; // obj ref

  // new String
  public StringBox(String s) { // abc
    // s -> char[]
    this.characters = new char[s.length()]; // !
    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }

  public char[] getCharacters() {
    return this.characters;
  }

  // design: revise the data of the object
  // differene between setCharAt() and replace()
  public void setCharAt(char c, int index) {
    this.characters[index] = c;
  }

  // sb.charAt
  public char charAt(int index) {
    return this.characters[index];
  }

  public int length() {
    return this.characters.length;
  }

  // firstIndexOf
  public int indexOf(char c) {
    for (int i = 0; i < this.characters.length; i++) {
      if (this.characters[i] == c) {
        return i;
      }
    }
    return -1;
  }

  // replace('c', 'x')
  public String replace(char o, char n) {
    char[] arr = new char[this.characters.length];
    for (int i = 0; i < this.characters.length; i++) {
      arr[i] = this.characters[i] == o ? n : this.characters[i];
    }
    return String.valueOf(arr); // new String(arr)
  }

  public String substring(int beginIndex, int endIndex) {
    char[] arr = new char[this.characters.length];
    for (int i = beginIndex; i < endIndex; i++) {
      arr[i] = this.characters[i];
    }
    return String.valueOf(arr); // char[] -> String
  }

  public String toString() {
    return String.valueOf(this.characters);
  }

  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    System.out.println(s.charAt(1));
    System.out.println(sb.charAt(1));

    System.out.println(s.length()); // 3
    System.out.println(sb.length()); // 3

    System.out.println(s.indexOf('c')); // 2
    System.out.println(sb.indexOf('c')); // 2

    String newStr = s.replace('c', 'x');
    System.out.println(newStr); // "abx"
    System.out.println(s); // "abc"

    String newStr2 = sb.replace('c', 'x');
    System.out.println(newStr2); // "abx"
    System.out.println(sb); // "abc"

    System.out.println(s.substring(0, 2)); // ab
    System.out.println(sb.substring(0, 2)); // ab

    // Pass by reference
    StringBox sb2 = sb; // StringBox Object address
    System.out.println(sb); // abc
    System.out.println(sb2); // abc
    sb.setCharAt('a', 2); // abc -> aba
    System.out.println(sb); // aba
    System.out.println(sb2); // aba

    char[] arr = sb.getCharacters();
    arr[0] = 'm';

    System.out.println(sb); // mba
    System.out.println(sb2); // mba

    // remove the linkages between sb/sb2 and StringBox Object
    sb = null;
    sb2 = null;
    // but the char array still exit
    System.out.println(Arrays.toString(arr)); // [m, b, a]
  }
}
