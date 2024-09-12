public class Customer {
    private int age;
    private String name;

    public Customer(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
