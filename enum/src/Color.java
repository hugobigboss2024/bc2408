public class Color {
  private static final String RED = "RED";
  private static final String BLUE = "BLUE";

  private String value;

  private Color(String value) {
    this.value = value;
  }

  public static Color ofRed() {
    return new Color(RED);
  }

  public static Color ofBlue() {
    return new Color(BLUE);
  }

  public void updateColor(int x) {
    if (x > 0)
      this.value = RED;
    this.value = BLUE;
  }

  public int compare(Color color) {
    if (this == color) // checking address
      return 0;
    return -1;
  }

  public static void main(String[] args) {
    Color red = Color.ofRed();
    Color red2 = Color.ofRed();
    System.out.println(red.compare(red2)); // -1

    String color = "RED";
    if (color.equals(new Color("RED"))) {

    }

  }
}