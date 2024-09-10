import java.util.Collections;
import java.util.List;

public class Vincent {
    // Define "The range of K" between "static" and "return type"
    public static <K> Box<K> createBox(K value) {
        return new Box<>(value);
    }

    // The range of P -> all types under Number.class
    public static <P extends Number> Box<P> createNumberBox(P value) {
        return new Box<>(value);
    }

    // We use "extends" for interface as well
    public static <U extends CharSequence> Box<U> createStringBox(U value) {
        return new Box<>(value);
    }

    // T -> implement Comparable.class
    // "? super T" -> any parent class of T or T itself
    // !!! <T extends Comparable<T>> -> smaller range of T
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Vincent.createBox("abc");
    }
}
