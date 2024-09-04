import java.util.Comparator;

// A comparsion formula for 2 objects
public class StringDesc implements Comparator<String> {
  @Override
  public int compare(String s1, String s2) {
    // s1 (-1), s2 (1)
    return s2.compareTo(s1) > 0 ? 1 : -1;
  }
}
