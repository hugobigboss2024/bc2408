public class Customer {
    private int age;
    private String name;

    public Customer(int age) {
        this.age = age;
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer(" //
                + "name=" + this.name //
                + ", age" + this.age //
                + ")";
    }
}