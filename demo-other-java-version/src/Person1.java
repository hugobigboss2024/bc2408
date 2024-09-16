// !!! immutable - final attribute
public record Person1(String name, int age) implements Walkable {

    public static final double PI = 3.14;

    // public Person1() {}

    // Support Override
    @Override
    public String name() {
        return this.name + "...";
    }

    // Support Custom Method
    // public

    // "final" attributes
    // public void setName(String name) {
    // this.name = name;
    // }

    public static int sum(int x, int y) {
        return x + y;
    }
}
