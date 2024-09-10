package staticnested;

public class Outer2 {

    public static class StaticNestedClass {

    }

    public static void main(String[] args) {
        // !!!! They are different class object
        Outer.StaticNestedClass object = new Outer.StaticNestedClass();
        Outer2.StaticNestedClass object2 = new Outer2.StaticNestedClass();

        // !!! In Conclude, we have 4 different classes
        // Outer.class, Outer2.class, Outer.StaticNestedClass.class,
        // Outer2.StaticNestedClass.class
    }
}