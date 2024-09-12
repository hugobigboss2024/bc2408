package exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
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
        System.out.println(result); // [100, 64, 36, 16, 4]

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
                // .collect(Collectors.toSet()); // [20,15]
                // .collect(Collectors.toCollection(TreeSet::new));//[15, 20]
                .collect(Collectors.toCollection(LinkedHashSet::new));// what is LinkedHashSet :: new //what is
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
