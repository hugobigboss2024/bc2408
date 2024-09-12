package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciseStream {
    public static void main(String[] args) {
        // basic stream operations // output[64,36,16,4]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0) // 過濾出偶數
                .map(n -> n * n).sorted((a, b) -> b - a) // .sorted to排序
                .collect(Collectors.toList()); //
        System.out.println(result); // [100,64, 36, 16, 4]

        // filtering and collecting // output[Alice,Annie,Alex] easy
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
        List<String> result1 = names.stream().filter(c -> c.startsWith("A")).collect(Collectors.toList());
        System.out.println(result1);// [Alice,Annie,Alex]

        // finding maximum and minimum // output max:30 min: 5
        List<Integer> numbers1 = Arrays.asList(10, 20, 5, 30, 15);
        List<Integer> result2 = numbers1.stream().sorted().collect(Collectors.toList());// .sorted to排序
        System.out.println("max:" + result2.get(result2.size() - 1) + " min:" + result2.get(0));//

        // mapping to a list of lengths // output [5,6,4] (List) easy
        List<String> words = Arrays.asList("apple", "banana", "pear");
        List<Integer> result3 = words.stream().map(c -> c.length()).collect(Collectors.toList());
        System.out.println(result3);// [5, 6, 4]

        // counting elements // output4 easy
        List<String> works1 = Arrays.asList("hi", "hello", "java", "stream");
        List<String> result4 = works1.stream().collect(Collectors.toList());
        System.out.println(result4.size());// 4

        // filtering and collecting to a Set // output[15,20] easy if [20,15]is ok!!
        List<Integer> numbers2 = Arrays.asList(5, 10, 15, 20, 10, 5);
        Set<Integer> result5 = numbers2.stream().filter(n -> n > 10)
                .collect(Collectors.toSet());

        System.out.println(result5);// [20,15]

        // mapping to a map(key-value-pairs) // output[Alice=85, Bob=75] easy
        List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
        List<String> result6 = students.stream().map(s -> s.getName() + "=" + s.getScore())
                .collect(Collectors.toList());
        System.out.println(result6);// [Alice=85, Bob=75]

        // filtering and mapping to a List of Objects // output [john, jane] 50%easy
        List<Employee> employees = Arrays.asList(// >50000 del it, name to List<String>?
                new Employee("john", 65000),
                new Employee("Jane", 55000),
                new Employee("Doe", 40000));
        List<String> result7 = employees.stream().filter(e -> e.getSalary() > 50000)
                .map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(result7);// [john, jane]
    }
}
