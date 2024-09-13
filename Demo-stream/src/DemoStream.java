import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    // Stream 的基本概念
    // 流（Stream）：流是一個元素序列，這些元素可以是來自集合、數組或 I/O 通道等的數據。流不會存儲數據，而是從數據源動態計算其內容。
    // 操作（Operations）：流支持兩類操作：中間操作和終端操作。
    // 中間操作：返回一個新的流，並且是懶加載的（如 filter(), map() 等）。
    // 終端操作：產生結果或副作用，並且會觸發流的計算（如 collect(), forEach(), reduce() 等）。
    // Stream 的特性
    // 不存儲數據：流不會持有數據，它們是對數據源的引用。
    // 惰性評估：流的計算是懶加載的，只有在需要時才會計算結果。
    // 可消耗性：流只能遍歷一次，一旦操作完成，流就無法再次使用。
    // 常用的 Stream 操作
    // filter(Predicate<T> predicate)：過濾流中的元素，僅保留符合條件的元素。
    // map(Function<T, R> mapper)：對流中的每個元素應用一個函數，生成一個新流。
    // collect(Collector<T, A, R> collector)：將流中的元素收集到集合中，如列表或映射。
    // forEach(Consumer<T> action)：對流中的每個元素執行操作。
    // reduce(T identity, BinaryOperator<T> accumulator)：對流中的元素進行聚合操作。
    public static void main(String[] args) throws Exception {
        // Stream.class
        Stream<String> strings = Stream.of("abc", "def");
        // for each (Stream) vannot user foreach//old for each cant
        // for(String s : strings){
        // System.out.println(s);}

        strings.forEach(s -> {
            System.out.println(s);
        });

        Stream<Customer> customers = Stream.of(new Customer(18, "john"), new Customer(20, "stever"));
        customers.forEach(c -> {
            System.out.println(c.getName() + "," + c.getAge());
        });

        // After java8 ,we have Stream.class, which contains lots of powerful methods /
        // finctionality
        // !!! 1 Convert List to Stream (Stream())
        List<Customer> customers2 = Arrays.asList(new Customer(18, "john"), new Customer(20, "stever"));
        Stream<Customer> customerStream = customers2.stream();
        // !!! 2 Convert Stream to List - collect()
        List<Customer> customers3 = customerStream.collect(Collectors.toList());

        // Stream Object -> filter() + collect()
        // Similar to for loop + if
        // return Stream<Customer> //List<Customer> customers4 = customers2.stream()
        // return Stream<Customer> //.filter(c -> c.getAge() > 18)
        // return List<Customer> //.collect(Collectors.toList());
        List<Customer> customers4 = customers2.stream().filter(c -> c.getAge() > 18).collect(Collectors.toList());
        System.out.println(customers4);//
        // Stream Object -> map() + collect()
        // similar to for loop + new Arrays() + add()
        List<String> names = customers2.stream()// return Stream<Customer>
                .map(customer -> customer.getName())// !!! return Stream<String>
                .collect(Collectors.toList());// !!! return List<String>
        System.out.println(names);// [john, stever]

        // filter() can work together with map()
        // 1 filter() before map() //filter()過濾==if?? //map提取??
        List<Integer> ages = customers2.stream().filter(c -> c.getName().startsWith("S")).map(c -> c.getAge())
                .collect(Collectors.toList());
        System.out.println(ages);// [20]
        // 2 map() before filter() //map提取?? //filter()過濾==if??
        List<String> name2 = customers2.stream().map(e -> e.getName()).filter(name -> name.endsWith("en"))
                .collect(Collectors.toList());
        System.out.println(name2);// [john]

        // count()
        long count = customers2.stream().count();
        System.out.println(count);// 2

        // mapToInt -> IntStream -> sum()
        int sumOfAges = customers2.stream().mapToInt(c -> c.getAge()).sum();
        System.out.println(sumOfAges);// 38

        // IntStream object -> max(), min(), distinct(), average()
        int maxAge = customers2.stream().mapToInt(c -> c.getAge()).max().getAsInt();
        System.out.println(maxAge);// 20

        int minAge = customers2.stream().mapToInt(c -> c.getAge()).min().getAsInt();
        System.out.println(minAge);// 18

        // IntStream -> distinct()
        // Collect to Set
        // average()

        // Array to Stream
        // Arraays to IntStream to Strieam<Integer> to Set<Integer>
        int[] arr = new int[] { 3, 2, 1 };
        IntStream ints = Arrays.stream(arr);
        Stream<Integer> integers = ints.boxed();
        Set<Integer> integerSet = integers.collect(Collectors.toSet());
        System.out.println(integerSet);

        // FlatMap.
        List<Customer> customers5 = List.of( //
                new Customer(20, "John", //
                        List.of(new Customer.Address("john1", "john2"),
                                new Customer.Address("john3", "john4"))),
                new Customer(40, "Peter", //
                        List.of(new Customer.Address("peter1", "peter2"),
                                new Customer.Address("peter3", "peter4"))), //
                new Customer(13, "Sally", //
                        List.of(new Customer.Address("sally1", "sally2"))) //
        );

        // List<Address>, which includes all addresses from all customers
        // for loop

        // stream -> flatmap
        List<Customer.Address> addresses = customers5.stream() // Stream<Customer>
                // !!! // flatMap(): input stream object, return Stream<Address>
                .flatMap(c -> c.getAddresses().stream()).collect(Collectors.toList());

        System.out.println(addresses);
        // [Address(line1=john1, line2=john2), Address(line1=john3, line2=john4),
        // Address(line1=peter1, line2=peter2), Address(line1=peter3, line2=peter4),
        // Address(line1=sally1, line2=sally2)]

    }
}
