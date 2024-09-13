import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int age;
    private String name;
    private List<Address> addresses;

    public Customer(int age) {
        this.age = age;
        this.addresses = new ArrayList<>();
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public Customer(int age, String name, List<Address> addresses) {
        this.age = age;
        this.name = name;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return this.addresses;
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

    public static class Address {
        private String line1;
        private String line2;

        public Address(String line1, String line2) {
            this.line1 = line1;
            this.line2 = line2;
        }

        @Override
        public String toString() {
            return "Address(" //
                    + "line1=" + this.line1 //
                    + ", line2=" + this.line2 //
                    + ")";
        }
    }
}