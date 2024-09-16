import java.util.ArrayList;
import java.util.function.Supplier;

public class DemoTypeInference {
    // !!! class attribute type, error
    // private var x;

    // public void setX(var x) {
    // this.x = x;
    // }

    public static void main(String[] args) {
        int age = 5;
        var age2 = 5;
        // !!! Java Compiler convert "var" to int
        // !!! because you assign int value 5 to it (first assignment).
        // !!! var type never exists in byte code (class file)
        // age2 = 5.0; // double value -> int type

        String name = "John";
        var name2 = "John";

        name2.charAt(2); // VSCode help you identify name2 is String variable

        var strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("def");

        for (var string : strings) {
            System.out.println(string);
        }

        // re-assign value to var type variable
        age2 = 10; // OK (same type value)
        // age2 = "abc"; // error
        // age2 = 5.0; // error

        // assign null value to var type variable
        // !!! var y = null; // first assignment has to be an non-null value

        // !!!! lambda expression (Not Support)
        // var nameLength3 = () -> "abc".length();

        // downcast
        var nameLength2 = (Supplier<Integer>) () -> "abc".length();

    }

    // !!! method input parameter type, error
    // !!! method out parameter type, error
    // public static var sum(var number1, var number2) {

    // }
}