public class Ball {
    private Ball.Color color;

    private Ball(Color color) {
        this.color = color;
    }

    public static Ball ofRed() {
        return new Ball(Color.RED);
    }

    public Color getColor() {
        return this.color;
    }

    public boolean isRed() {
        return this.color == Color.RED;
    }

    private enum Color {
        RED, GREEN, BLUE,;
    }

    public enum Size {
        SMALL, MEDIUM, LARGE,;
    }
}