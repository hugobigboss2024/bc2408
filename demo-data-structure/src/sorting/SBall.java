package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SBall implements Comparable<SBall> {
  private Color color;
  private String name;

  public SBall(Color color, String name) {
    this.color = color;
    this.name = name;
  }

  // getter ..
  public Color getColor() {
    return this.color;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int compareTo(SBall ball) {
    // this (John) -1, ball (Benny) 1
    if (this.color == ball.getColor())
      return this.name.compareTo(ball.getName()) > 0 ? -1 : 1;
    // Different Color (Order: YELLOW -> GREEN -> RED)
    if (this.color == Color.YELLOW || ball.getColor() == Color.RED)
      return -1;
    if (this.color == Color.RED || ball.getColor() == Color.YELLOW)
      return 1;
    if (this.color == Color.GREEN) {
      if (ball.getColor() == Color.YELLOW)
        return 1;
      return -1;
    }
    if (ball.getColor() == Color.GREEN) {
      if (this.color == Color.YELLOW)
        return -1;
      return 1;
    }
    return -1;
  }

  @Override
  public String toString() {
    return "Sball(" //
        + "color" + this.color.name() //
        + ", name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    // !!! You don't have to use new ArrayList object for Collections.sort()
    // Collection.sort() doesn't use add(), remove() modification method.
    List<SBall> balls = Arrays.asList(new SBall(Color.RED, "Vincent"),
        new SBall(Color.YELLOW, "John"), new SBall(Color.YELLOW, "Benny"),
        new SBall(Color.GREEN, "Susan"), new SBall(Color.RED, "Alex"));
    Collections.sort(balls);
    System.out.println(balls);

    System.out.println(balls.get(3)); // Sball(colorRED, name=Vincent)
  }
  // sorting
  // 1. YELLOW -> GREEN -> RED
  // 2. If same color, name descending order.

  // After sorting:
  // i.e. SBall(Yellow, "John") -> SBall(Yellow, "Benny") -> SBall(Green,
  // "Susan")
  // -> SBall(RED, "Vincent") -> SBall(RED, "Alex")
}