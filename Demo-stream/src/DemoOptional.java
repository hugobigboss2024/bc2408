import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOptional {
    public static void main(String[] args) {
        // String[] -> List<String>
        // !!! Arrays.asList() is just for non-primitive
        String[] strings = new String[] { "abc", "ijk" };
        System.out.println(Arrays.asList(strings)); // [abc, ijk]

        int[] arr = new int[] { 3, 10, 2, -9 };
        // int[] -> List<Integer>
        // stream() + boxed()
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        // [3, 10, 2, -9]

        // int[] -> IntStream
        Arrays.stream(arr) // IntStream
                .filter(e -> e > 1) //
                .forEach(e -> System.out.println(e));

        System.out.println(Arrays.stream(arr) //
                .filter(e -> e > 1) //
                .sum()); // 15

        List<Customer> customers = Arrays.stream(arr).boxed() // Stream<Integer>
                .filter(e -> e >= 0) //
                .map(age -> new Customer(age)) // Stream<Customer>
                .collect(Collectors.toList());

        System.out.println(customers); // [Customer(name=null, age3),
                                       // Customer(name=null, age10),
                                       // Customer(name=null, age2)]

        // Stream + Optional
        int[] arr2 = new int[] { 3, 10, 100, 1, 11 };
        List<Integer> integers = Arrays.stream(arr2).boxed() //
                .filter(e -> e > 10) //
                .collect(Collectors.toList()); // new ArrayList<>()

        System.out.println(integers.size()); // 0

        Optional<Integer> result = Arrays.stream(arr2).boxed() //
                .filter(e -> e > 10) //
                .findFirst(); // !!! or findAny()

        System.out.println(result); // Optional[100]

        if (result.isPresent()) {
            System.out.println(result.get()); // 100
        } else {
            System.out.println("Not Found.");
        }

        // !!! consumer (void)
        // !!! result.ifPresent() -> if(result.isPresent()) + do something
        result.ifPresent(e -> System.out.println(e)); // 100

        // Optional
        Optional<String> string = Optional.of("abc");
        // System.out.println(Optional.of(null)); // java.lang.NullPointerException

        Optional<String> string2 = Optional.ofNullable(null);
        System.out.println(string2); // Optional.empty

        Optional<String> string3 = Optional.empty(); // ! same as
                                                     // Optional.ofNullable(null)
        System.out.println(string3.isPresent()); // false

        // ! How to resolve Optional of value
        // 1. isPresent() -> get()
        // 2. ifPresent()
        // 3. orElse(), from Optional<T> to T
        System.out.println(result.orElse(10)); // 100
        // 4. orElseThrow(), from Optional<T> to T
        System.out.println(
                result.orElseThrow(() -> new RuntimeException("No value > 10"))); // 100
        // 5. orElseGet()
        System.out.println(result.orElseGet(() -> 10)); // 100

        // !!! Use cases for Optional<T>
        // ! Good:
        // 1. Optional should be used for return type ONLY!!! (Similar to throw checked
        // exception)
        // ! Bad:
        // 2. Never use Optional in method parameters
        // 3. Never use Optional as type of class attribute, because it does not support
        // Serialization

        Optional<Customer> customer = get("Peter");

        concat(null, "hello");
    }

    // Good Use Case
    public static Optional<Customer> get(String name) {
        // select from Database
        List<Customer> resultSet = List.of(new Customer(10, "John"), new Customer(20, "Sally"));

        return resultSet.stream() //
                .filter(e -> name.equals(e.getName())) //
                .findAny();
    }

    // Bad idea
    // ! Optional Parameter design doesn't help solving the chance of null value
    public static String concat(Optional<String> s1, String s2) {
        if (s1 != null && s1.isPresent())
            return s1.get().concat(s2);
        throw new IllegalArgumentException();
    }
}
