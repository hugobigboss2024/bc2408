import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers = numbers.stream() //
                .filter(n -> n % 2 == 0) //
                .map(n -> n * n) //
                .sorted((n1, n2) -> n1 > n2 ? -1 : 1) //
                .collect(Collectors.toList()); // ArrayList

        System.out.println(numbers); // [100, 64, 36, 16, 4]

        numbers.add(999);
        System.out.println(numbers);

        // !!! Arrays.asList - No add & remove, but set is OK
        // Mutable but fixed size
        List<String> strings = Arrays.asList("abc", "ooo", "ijk");
        // strings.add("abc"); //java.lang.UnsupportedOperationException
        strings.set(1, "hello"); // OK
        System.out.println(strings); // [abc, hello, ijk]

        // !!! List.of - Java 9 (No add, remove, set)
        // Immutable
        List<String> strings2 = List.of("abc", "ooo", "ijk", "pol"); //
        // strings2.add("xyz"); // java.lang.UnsupportedOperationException
        // strings2.set(1, "hello"); // java.lang.UnsupportedOperationException

        // strings2 = List.of(null, "abc", "hello"); // java.lang.NullPointerException

    }
}
