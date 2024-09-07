package idea.src.Oopmethod;

public class EnumTest {
    public static void main(String[] args) {

    }

    public static void move(EnumOrientation o) {
        switch (o) {
            case UP:
                System.out.println("UP");
                break;
            case DOWN:
                System.out.println("DOWN");
                break;
            case LEFT:
                System.out.println("LEFT");
                break;
            case RIGHT:
                System.out.println("RIGHT");
                break;

        }
    }
}
