public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 2 };
        int idx = 3;
        try {
            System.out.println(arr[idx]); // error, must be fail
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("idx is out of the range of array. Please input again.");
        }
    }
}