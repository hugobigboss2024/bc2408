package exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciseStream {
        public static void main(String[] args) {
                // 1 basic stream operations // output[64,36,16,4]
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                List<Integer> result = numbers.stream()
                                .filter(n -> n % 2 == 0) // 過濾出偶數
                                .map(n -> n * n).sorted((a, b) -> b - a) // .sorted to排序
                                .collect(Collectors.toList()); //
                System.out.println(result); // [100, 64, 36, 16, 4]

                // 2 filtering and collecting // output[Alice,Annie,Alex] easy
                List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
                List<String> result1 = names.stream().filter(c -> c.startsWith("A")).collect(Collectors.toList());
                System.out.println(result1);// [Alice,Annie,Alex]

                // 3 finding maximum and minimum // output max:30 min: 5
                List<Integer> numbers1 = Arrays.asList(10, 20, 5, 30, 15);
                List<Integer> result2 = numbers1.stream().sorted().collect(Collectors.toList());// .sorted to排序
                System.out.println("max:" + result2.get(result2.size() - 1) + " min:" + result2.get(0));//

                // 4 mapping to a list of lengths // output [5,6,4] (List) easy
                List<String> words = Arrays.asList("apple", "banana", "pear");
                List<Integer> result3 = words.stream().map(c -> c.length()).collect(Collectors.toList());
                System.out.println(result3);// [5, 6, 4]

                // 5 counting elements // output4 easy
                List<String> works1 = Arrays.asList("hi", "hello", "java", "stream");
                List<String> result4 = works1.stream().collect(Collectors.toList());
                System.out.println(result4.size());// 4

                // 6 filtering and collecting to a Set // output[15,20] easy if [20,15]is ok!!
                List<Integer> numbers2 = Arrays.asList(5, 10, 15, 20, 10, 5);
                Set<Integer> result5 = numbers2.stream().filter(n -> n > 10)
                                // .collect(Collectors.toSet()); // [20,15]
                                // .collect(Collectors.toCollection(TreeSet::new));//[15, 20]
                                .collect(Collectors.toCollection(LinkedHashSet::new));// what is LinkedHashSet :: new
                                                                                      // //what is
                                                                                      // TreeSet::new??
                // 使用 Collectors.toCollection(TreeSet::new) 是一個收集操作，它將流中的元素收集到一個 TreeSet 中。這裡的
                // TreeSet::new 是 Java 8 引入的 方法引用（method reference）語法，用於創建一個 TreeSet 的新實例。
                // TreeSet::new 是一個方法引用，它告訴 Java 創建一個新的 TreeSet 實例。自動排序：TreeSet
                // 會根據元素的自然順序或提供的比較器進行排序。不允許重複元素：TreeSet 不會存儲重複的元素。
                // 使用 Collectors.toCollection(LinkedHashSet::new) 是一種收集操作，將流中的元素收集到一個
                // LinkedHashSet 中。這裡的 LinkedHashSet::new 是 Java 8 中的方法引用（method
                // reference）語法，用於創建一個新的 LinkedHashSet 實例。
                // LinkedHashSet::new 是一個方法引用，用於創建一個新的 LinkedHashSet 實例。保持插入順序：LinkedHashSet
                // 使用鏈表來維護元素的插入順序，因此當您遍歷 LinkedHashSet 時，元素將按照它們被添加的順序排列。不允許重複元素：與其他 Set
                // 實現一樣，LinkedHashSet 不允許有重複的元素。

                System.out.println(result5);// [15, 20]

                // 7 mapping to a map(key-value-pairs) // output[Alice=85, Bob=75] easy
                List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
                List<String> result6 = students.stream().map(s -> s.getName() + "=" + s.getScore())
                                .collect(Collectors.toList());
                System.out.println(result6);// [Alice=85, Bob=75]

                // 8 filtering and mapping to a List of Objects // output [john, jane] 50%easy
                List<Employee> employees = Arrays.asList(// >50000 del it, name to List<String>?
                                new Employee("john", 65000),
                                new Employee("Jane", 55000),
                                new Employee("Doe", 40000));
                List<String> result7 = employees.stream().filter(e -> e.getSalary() > 50000)
                                .map(e -> e.getName()).collect(Collectors.toList());
                System.out.println(result7);// [john, jane]

                // 9 grouping and collecting to a Map (group by Age) output {30=[Alice,
                // Charlie],
                // 25=[Bob]} (Map)
                List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25),
                                new Person("Charlie", 30));
                Map<Integer, List<String>> result8 = people.stream().collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName, Collectors.toList())));
                // Collectors.groupingBy()Person的年龄(age)value进行分组。put to Integer??
                // Collectors.mapping(Person::getName, Collectors.toList())Person
                // Object转换为其名称(name)put to List<String>

                System.out.println(result8);// {30=[Alice, Charlie], 25=[Bob]}

                // 10 partitioning and collecting to a Map(partition by Gender) output{fallse =
                // [Alice], true = [Bob, Charlie]}
                List<Person> people1 = Arrays.asList(new Person("Alice", "Female"), new Person("Bob", "Male"),
                                new Person("Charlie", "Male"));
                Map<Boolean, List<Person>> result9 = people1.stream().collect(Collectors.partitioningBy(
                                p -> p.getSex().equals("Male"), Collectors.toList()));
                System.out.println(result9.toString());// {false=[Alice], true=[Bob, Charlie]}
                // Collectors.partitioningBy()Person的性别(sex)value进行分组

                // 11 filtering, mapping, and collecting to a List output [30,40,60] easy
                List<Integer> number3 = Arrays.asList(5, 15, 20, 7, 30);
                List<Integer> result10 = number3.stream().filter(e -> e > 10).map(e -> e * 2).toList();
                System.out.println(result10);// [30, 40, 60]

                // 12 mapping to a custom object and collecting to a List //
                // output[Person(name=Alic, Age=30),Person(name=Bob,
                // Age=30),Person(name=Charlie, Age=30)]
                List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
                int defaultAge = 30;
                List<Person> persons1 = names1.stream().map(name -> new Person(name, defaultAge))
                                .collect(Collectors.toList());
                // List<Person> persons1 = names1.stream().map(name -> new Person(name,
                // defaultAge)).toList();
                // have or not have .collect(Collectors) at the end output is same,
                // maybe justneed .toList every time??
                System.out.println(persons1.toString());// [Person(name=Alic, Age=30),Person(name=Bob,
                                                        // Age=30),Person(name=Charlie, Age=30)]
                // 13 mapping and collecting to a deque // output[HELLO,WORLD,JAVA]
                List<String> words2 = Arrays.asList("hello", "world", "java");
                // List<String> result11 = words2.stream().map(e ->
                // e.toUpperCase()).collect(Collectors.toList());
                // easy upCase
                // Deque<String> result11a = new LinkedList<>(result11);
                // List put to Deque
                Deque<String> result11 = words2.stream().map(e -> e.toUpperCase())
                                .collect(Collectors.toCollection(ArrayDeque::new));
                // .toCollection(方法引用,用了 ArrayDeque创建一个新的 ArrayDeque Object)
                System.out.println(result11);// [HELLO, WORLD, JAVA]

                // 14 transforming and collecting to an Array // output[1,4,9,16]
                List<Integer> number4 = Arrays.asList(1, 2, 3, 4);
                int[] intArr = number4.stream().map(e -> e * e).mapToInt(Integer::intValue).toArray();
                System.out.println(Arrays.toString(intArr));// [1, 4, 9, 16]

                // 15 Map and Reduce // output 22
                List<Product> products = Arrays.asList(new Product("Book", 10), new Product("Pen", 5),
                                new Product("Notebook", 7));
                // int sum1 = products.stream().mapToInt(Product::getPrice).sum();
                int sum1 = products.stream().mapToInt(Product::getPrice).reduce(0, Integer::sum);
                // (frome wherer[class]::want to get what)
                // The reduce() method takes two arguments:
                // .reduce(start Value from where::method ) //(T identity, BinaryOperator<T>
                // accumulator)
                System.out.println(sum1);// 22

                // 16 grouoping // output{HR=[Alice, Charlie], IT=[Bob,David]}
                List<Employee> employee2 = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"),
                                new Employee("Charlie", "HR"), new Employee("David", "IT"));

                Map<String, List<Employee>> result12 = employee2.stream().collect(Collectors.groupingBy(
                                Employee::getDepartment));
                // Map<String, List<Employee>> // String:department, List<Employee>:employee
                // (frome wherer[class]::want to get what[method])
                System.out.println(result12.toString());// {HR=[Alice, Charlie], IT=[Bob,David]}

                // 17 parallel streams // output 55
                List<Integer> number5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                // int sumByArr = number5.parallelStream().reduce(0, Integer::sum); //55
                // System.out.println(number5.stream().parallel().reduce(0, Integer::sum));// 55
                List<Integer> sumList = Arrays.asList(number5.stream().mapToInt(Integer::intValue).sum());
                // Arrays.asList again//get all value at List<Integer> andthen get sum//
                // no need to toList because i coded Arrays.asList in start
                System.out.println(sumList);

                // 18 flatMap // output [6,7,8,9]
                List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
                                Arrays.asList(7, 8, 9));
                List<Integer> result13 = listOfLists.stream().flatMap(List::stream).filter(e -> e > 5)
                                .collect(Collectors.toList());
                // flatMap(List::stream)
                // flattens the stream of inner lists into a single streaof integers.
                System.out.println(result13);// [6, 7, 8, 9]
                // 19 distinct and Sorting // output[apple,banana,grape,arange]
                List<String> words3 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
                List<String> result14 = words3.stream().distinct().sorted().collect(Collectors.toList());
                System.out.println(result14);// [apple, banana, grape, orange]
                // .distinct()去除重复的,只保留唯一的 //.sorted()排序

                // 20 partitioning by // output {false=[Alice, Charlie], true=[Bob,David]} easy
                List<Student> students2 = Arrays.asList(new Student("Alice", 45), new Student("Bob", 55), new Student(
                                "Charlie", 40), new Student("David", 70));
                Map<Boolean, List<Student>> result15 = students2.stream().collect(Collectors.partitioningBy(
                                student -> student.getScore() > 50));
                System.out.println(result15.toString());// {false=[Alice, Charlie], true=[Bob,David]}

                // 21 joining Strings //output "Java, Streams, Are, Fun"
                List<String> words4 = Arrays.asList("Java", "Streams", "Are", "Fun");
                // String result16 = words4.stream().collect(Collectors.joining(", "));
                // List<String> result16 = words4.stream().collect(Collectors.toList());
                // System.out.println(words4);// [Java, Streams, Are, Fun]
                // System.out.println(result16);// Java, Streams, Are, Fun
                String result16 = words4.stream().collect(Collectors.joining(", ", "\"",
                                "\""));
                System.out.println(result16);// "Java, Streams, Are, Fun"
                // joining is frome Collectors class method//作用是将一个流中的元素连接成一个字符串。
                // joining(String delimiter分隔符, String prefix前綴, String suffix後綴)

                // 22 find first and any // output 9
                List<Integer> number6 = Arrays.asList(4, 7, 9, 12, 16, 21);
                List<Integer> result17 = number6.stream().filter(e -> e % 3 == 0).collect(Collectors.toList());
                System.out.println(result17.get(0));// 9

                // 23 limit and skip //output [4,5,6,7,8]
                List<Integer> number7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                // List<Integer> result18 =
                // number7.stream().limit(4).collect(Collectors.toList());
                // System.out.println(result18);// [4,5,6,7]
                // List<Integer> result19 =
                // number7.stream().skip(3).collect(Collectors.toList());
                // System.out.println(result19);// [4,5,6,7,8,9,10]
                List<Integer> result20 = number7.stream().limit(8).skip(3).collect(Collectors.toList());
                // limit:取前n个，skip:跳过前n个
                System.out.println(result20);// [4,5,6,7]

                // 24 Peek (Debugging in Streams)// Intermedidte output 2,4,6,8 // final
                // output[2,4,6,8]
                List<Integer> number8 = Arrays.asList(1, 2, 3, 4);
                List<Integer> result21 = number8.stream().map(e -> e * 2).peek(System.out::print)
                                .collect(Collectors.toList());
                System.out.println(result21);// 2468[2, 4, 6, 8]

                // 25 optional and Streams // output Optional[hello] easy
                List<String> words5 = Arrays.asList("hi", "hello", "cat", "dog");
                Optional<String> result22 = words5.stream().filter(e -> e.length() > 4).findFirst();
                System.out.println(result22);// Optional[hello]

                // 26 Custom collector //output [1,2,3,4,5,6] (in any order)
                List<Integer> number9 = Arrays.asList(1, 2, 3, 4, 5, 6);
                HashSet<Integer> result23 = number9.stream().collect(Collectors.toCollection(LinkedHashSet::new));
                // just elemets in LinkedHashSet??//LinkedHashSet按照添加顺序put to new, LinkedHashSet
                // put to HashSet??
                System.out.println(result23);// [1, 2, 3, 4, 5, 6]

                // 27 using stream to manipulate arrays // output15
                int[] arr = { 1, 2, 3, 4, 5 };
                // List<Integer> result24 = Arrays.asList(Arrays.stream(arr).sum());
                // System.out.println(result24);// [15]
                int sum = Arrays.stream(arr).sum();
                System.out.println(sum);// 15

                // 28 String Length Calculation // output 19
                List<String> words6 = Arrays.asList("Java", "Streams", "Practice");
                int sumLength = words6.stream().mapToInt(String::length).sum();
                System.out.println(sumLength);// 19

        }
}
