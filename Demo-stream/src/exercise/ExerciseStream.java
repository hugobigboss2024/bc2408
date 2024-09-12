package exercise;

import java.util.Arrays;
import java.util.List;

public class ExerciseStream {
    public static void main(String[] args) {
        // basic stream operations // output[64,36,16,4]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filtering and collecting // output[Alice,Annie,Alex]
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");

        // finding maximum and minimum // output max:30 min 5
        List<Integer> numbers1 = Arrays.asList(10, 20, 5, 30, 15);

        // mapping to a list of lengths // output [5,6,4] (List)
        List<String> words = Arrays.asList("apple", "banana", "pear");

        // counting elements // output4
        List<String> works1 = Arrays.asList("hi", "hello", "java", "stream");

        // filtering and collecting to a Set // output[15,20]
        List<Integer> numbers2 = Arrays.asList(5, 10, 15, 20, 10, 5);

        // mapping to a map(key-value-pairs) // output[Alice=85, Bob=75]
        List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));

        // filtering and mapping to a List of Objects // output [john, jane]
        List<Employee> employees = Arrays.asList(
                new Employee("john", 65000),
                new Employee("Jane", 55000),
                new Employee("Doe", 40000));
    }
}
