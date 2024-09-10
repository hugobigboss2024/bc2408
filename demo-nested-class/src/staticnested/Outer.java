package staticnested;

// !!! This example is to explain "static nested class"
public class Outer {
    private int x;

    public Outer(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    // !!!! StaticNestedClass is completely different to Outer.class
    public static class StaticNestedClass {
        public static int z = 100;
        private double y;

        public double getY() {
            return this.y;
        }

        public static void print1() {
            // !!! Cannot read or write Outer.x
            // System.out.println(x); // NOT OK, complie error
            // !!! static cannot read instance
            // System.out.println(this.y); // NOT OK, complie error
            System.out.println(z);
        }

        public void print2() {
            // !!! Cannot read or write Outer.x
            // System.out.println(x); // NOT OK, complie error
            System.out.println(this.y); // OK
        }
    }

    public static void main(String[] args) {
        // New Object for Outer
        Outer outerObject = new Outer(10);
        System.out.println(outerObject.getX()); // 10

        // New Object for StaticNestedClass
        Outer.StaticNestedClass staticNestedObject = new Outer.StaticNestedClass();
        staticNestedObject.print2(); // 0.0
        System.out.println(staticNestedObject.getY()); // 0.0

        Outer.StaticNestedClass.print1(); // 100
        System.out.println(StaticNestedClass.z); // 100
    }
}