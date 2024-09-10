public class NullPointer {
    public static void main(String[] args) {
        // !!!! Null Pointer Problem should never be "try/ catch"
        String s = null;

        try {
            s.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("s is null -> NPE");
        }

        // Solution
        if (s != null) {
            s.charAt(0);
        }

    }
}