package sorting;

public class Ball implements Comparable<Ball> {
    private Color color;
  
    public Ball(Color color) {
      this.color = color;
    }
  
    public Color getColor() {
      return this.color;
    }
  
    @Override
    public int compareTo(Ball ball) {
      // this (-1) vs ball (1)
      if (this.color == Color.GREEN || ball.getColor() == Color.YELLOW)
        return -1;
      if (this.color == Color.YELLOW || ball.getColor() == Color.GREEN)
        return 1;
      if (this.color == Color.RED) {
        if (ball.getColor() == Color.GREEN)
          return 1;
        return -1;
      }
      if (ball.getColor() == Color.RED) {
        if (this.color == Color.GREEN)
          return -1;
        return 1;
      }
      return -1;
    }
  
    @Override
    public String toString() {
      return "Ball(" //
          + "color=" + this.color.name() //
          + ")";
    }
  
    // List<Ball> -> ordering
    // GREEN -> RED -> YELLOW
  
    public static void main(String[] args) {
  
    }
  }
  