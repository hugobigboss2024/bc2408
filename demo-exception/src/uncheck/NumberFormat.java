package uncheck;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            double dp = Double.parseDouble("100.7");
            System.out.println(dp);
            double dp2 = Double.parseDouble("100..3"); // run-time error, goes to "catch" session
            System.out.println(dp2); // skip
        } catch (NumberFormatException e) {
            double dp2 = 0.0;
            System.out.println(e.getMessage());
        }
    }
}