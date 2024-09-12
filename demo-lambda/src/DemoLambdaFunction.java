import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambdaFunction {

    public static void main(String[] args) {
        // Function, f(x) = y
        // interface Function<T, R>
        // R apply(T t);
        Function<String, Integer> stringLength = str -> str.length();// !!! Formula
        stringLength.apply("Hello");
        System.out.println(stringLength.apply("Hello"));

        // Function<Integer, String> tostr = tostr -> tostr.toString(0);
        // if(x > 3){
        Function<List<String>, Set<String>> lengthlargerThan3 = strings -> {
            Set<String> newStrings = new HashSet<>();
            for (String s : strings) {
                if (s.length() > 3)
                    newStrings.add(s);
            }
            return newStrings;
        };

        List<String> stringList = Arrays.asList("abcd", "abc", "abcd", "abcde");
        Set<String> stringSet = lengthlargerThan3.apply(stringList);
        System.out.println(stringSet); // [abcd, abcde]

        // BiFunction.vlass
        // interface BiFunction<T, U, R>
        // R apply(T t, U u);
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        add.apply(1, 2);
        System.out.println(add.apply(1, 2));
        BiFunction<String, String, String> concat = (x, y) -> x + y;
        concat.apply("Hello", "World");
        System.out.println(concat.apply("Hello", "World"));
        BiFunction<String, String, Integer> ttl = (x, y) -> x.length() + y.length();
        ttl.apply("Hello", "World");
        System.out.println(ttl.apply("Hello", "World"));// 10

        // Counsumer.class
        // interface Consumer<T> {
        // void accept(T t);
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello");
        System.out.println(print);
        BiConsumer<String, String> print2 = (x, y) -> System.out.println(x + y);
        print2.accept("Hello", "World");
        System.out.println(print2);
        BiConsumer<Integer, Integer> print3 = (x, y) -> System.out.println(x + y);
        print3.accept(1, 2);
        System.out.println(print3);
        BiConsumer<Integer, String> print4 = (x, y) -> System.out.println(x + y);
        print4.accept(1, "Hello");
        System.out.println(print4);

        Consumer<List<String>> printer = string -> {
            for (String s : string) {
                System.out.println(s);
            }
        };
        // printer.accept();

        BiConsumer<Map<Integer, String>, Integer> printValue = (map, key) -> System.out.println(map.get(key));
        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(1, "John");
        nameMap.put(2, "Jane");
        printValue.accept(nameMap, 1);

        // supplier
        // supplier<T>
        // T get();
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());

        // Predicate
        // interface Predicate<T>
        Predicate<Customer> isAdult = customer -> customer.getAge() >= 18;
        System.out.println(isAdult.test(new Customer(18)));//
        System.out.println(isAdult.test(new Customer(17)));

        BiPredicate<Customer, Customer> isOlderThan = (c1, c2) -> c1.getAge() > c2.getAge();
        System.out.println(isOlderThan.test(new Customer(20), new Customer(19)));

        Predicate<Customer> isNameStartsWithA = customer -> customer.getName().startsWith("A");

        // Test
        System.out.println(isAdult.and(isNameStartsWithA).test(new Customer(30, "Alex")));

        // UnaryOperator<T> extends Function<T, T>
        UnaryOperator<String> replaceSpaceByEmptyString = s -> s.replace(" ", "");
        System.out.println(replaceSpaceByEmptyString.apply("Hello World!!!"));
        // Alternative
        Function<String, String> replaceSpaceByEmptyString2 = s -> s.replace(" ", "");
        System.out.println(replaceSpaceByEmptyString2.apply("Hello World!!!"));

        // BinartyOperator<T>
        BinaryOperator<String> firstCharacter = (s1, s2) -> {
            String result = "";
            if (s1 != null && s1.length() > 0)
                result += s1.charAt(0);
            if (s2 != null && s2.length() > 0)
                result += s2.charAt(0);
            return result;
        };

        System.out.println(firstCharacter.apply("abc", "ijk"));// ai
    }

}
