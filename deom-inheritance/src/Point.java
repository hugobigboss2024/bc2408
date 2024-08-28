import java.util.Objects;

public class Point {
     private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX())
        && Objects.equals(this.y, point.getY());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  @Override
  public String toString() {
    return "Point("//
        + "x=" + this.x //
        + ", y=" + this.y //
        + ")";
  }

  // !!! Method Signature is Case Sensitive
  // !!! But you should NOT design the method name like this
  // !!! Confuse when you call the method
  public int hashcode() {
    return -1;
  }

  public String tostring() {
    return "";
  }

  public static void main(String[] args) {
    // before override equals(), it is false
    System.out.println(new Point(1, 1).equals(new Point(1, 1))); // true

    // Create a person located at Point(1, 2)
    Person person = new Person(new Point(1, 2));

    // asking if the person located at Point (1, 2)
    // I am not asking if the point objects
    if (person.getPoint().equals(new Point(1, 2))) { // true
      System.out.println("this person is located at Point (1, 2)");
    }

    // alternative
    if (person.getPoint().getX() == 1 || person.getPoint().getY() == 2) {

    }


  }

}
