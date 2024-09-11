
public class Person {
    private String name;
    private int age;

    // You can add other public constructors if required.如果需要，您可以新增其他公共構造函數。

    private Person(Person.Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Person.Builder builder() {
        return new Person.Builder(); //
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Builder {
        // copy all Person's attribute複製所有 Person 的屬性
        private String name;
        private int age;

        public Person.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Person.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        // Traditional Constructor Pattern
        // Person p = new Person("John", 30);
        // p.setAge(40);
        // System.out.println(p.getAge());

        // Task 1: builder()
        // Task 2: build() -> return Person Object

        Person p2 = Person.builder() //
                .name("Peter") //
                .age(20) //
                .build(); // build() -> instance method -> return Person object

        System.out.println(p2.getName()); // Peter
        System.out.println(p2.getAge()); // 20

        // Advantages/Functionality of Builder Pattern (建造者模式):
        // 1. Serve different pattern of constructors.服務於不同模式的建構函數。
        // 2. Builder method name assists the value assignment in case there are
        // lots of attributes.建構器方法名稱有助於在屬性較多的情況下進行值分配。
        // 3. We can disable/private (encapsulate) constructor of Outer
        // Class我們可以禁用/私有（封裝）外部類別的建構函數

    }
}
