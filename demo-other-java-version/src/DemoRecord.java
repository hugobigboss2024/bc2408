public class DemoRecord {
    public static void main(String[] args) {
        // !!! Record (Java 16), supports:
        // ! READ-ONLY (by default)
        // 1. All-arg constructor
        Person1 person = new Person1("John", 13);
        // 2. getter
        System.out.println(person.name()); // getter (Overrided)
        System.out.println(person.age()); // getter
        // 3. No Setter
        // 4. No empty constructor
        // Person1 person1 = new Person1();
        // 5. Support @Override - i.e. getter
        System.out.println(person.name());
        // 6. Attributes by default is "final" (So, no setter)
        // 7. toString()
        System.out.println(person.toString()); // Person1[name=John, age=13]
        // 8. equals(), hashCode()
        System.out
                .println(new Person1("Peter", 15).equals(new Person1("Peter", 15))); // true
        System.out.println(new Person1("Peter", 15)
                .hashCode() == new Person1("Peter", 15).hashCode()); // true
        // 9. static variable & methods
        System.out.println(Person1.sum(3, 2)); // 5
        System.out.println(Person1.PI); // 3.14
        // 10. extends? implements?
        Object object = new Person1("Peter", 30);
        Walkable person2 = new Person1("Steven", 15);
        // 11. As parent class?
        // ! Cannot be extended by child class

    }
}
