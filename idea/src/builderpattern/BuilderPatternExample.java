package builderpattern;

public class BuilderPatternExample {// 使用BuilderPattern構建object
    public static void main(String[] args) {
        // Builder class來構建一個 Person 對象，並打印其信息。
        Person person = new Person.Builder()
                .setName("Alice")
                .setAge(30)
                .setAddress("123 Main St")
                .build();

        System.out.println(person); // 輸出: Person{name='Alice', age=30, address='123 Main St'}
    }
}
