package inner;

public class Anonymous {
    public static void main(String[] args) {
        Readable person = new Readable() {
            public int radius;

            // !!! Cannot access. Polymorphism
            public void setRadius(int radius) {
                this.radius = radius;
            }

            // !!! Cannot access. Polymorphism
            public int getRadius() {
                return this.radius;
            }

            @Override
            public void read() {
                System.out.println("Im reading ...");
            }
        };

        person.read();
        System.out.println(person.getClass()); // class inner.Anonymous$1

        System.out.println(Readable.a); // 100
        // person.radius // NOT OK
    }
}