public class Person {
    public static void main(String[] args) {
        // !!! because inner class Ball.Size is public
        Ball.Size ballSize = Ball.Size.MEDIUM;

        // !!! because Ball.Color is private
        // Ball.Color ballColor = Ball.Color.RED;

        // Ball ball = new Ball(Ball.Color.RED);
        Ball ball = Ball.ofRed();
        // System.out.println(ball.getColor() == Ball.Color.RED);
        System.out.println(ball.isRed());
    }
}