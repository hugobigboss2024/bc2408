import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// List<List<Item>> orders; // customer.getOrder(orderId); customer.getOrders.getItemList(id); 
// List<Order> orders; // customer.getOrderList().getOrder(id).getItemList().getItem(id);

public class Box<T> {
    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Define "The range of K" between "static" and "return type"
    public static <K> Box<K> createBox(K value) {
        return new Box<>(value);
    }

    // The range of P -> all types under Number.class
    public static <P extends Number> Box<P> createNumberBox(P value) {
        return new Box<>(value);
    }

    // We use "extends" for interface as well
    public static <U extends CharSequence> Box<U> createStringBox(U value) {
        return new Box<>(value);
    }

    // T -> implement Comparable.class
    // "? super T" -> any parent class of T or T itself
    // !!! <T extends Comparable<T>> -> smaller range of T
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        // T -> String
        Box<String> stringBox = new Box<>();
        StringBox stringsBox2 = new StringBox(); // the world without Generics

        // T -> Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(3); // 3 is Integer
        // integerBox.setValue("abc");
        IntegerBox integerBox2 = new IntegerBox(); // the world without Generics

        // Map<K, V>
        Map<String, Integer> integerMap = new HashMap<>();

        // List is similar to List<Object>
        List list = new ArrayList(); // Java 1.3, runtime JVM -> ArrayList of Object
        list.add("abc");
        list.add(10);
        System.out.println(list.size()); // 2
        System.out.println(list);

        // You cannot use charAt() after get()
        // System.out.println(list.get(0).charAt());
        System.out.println(((String) list.get(0)).charAt(1)); // b
        System.out.println(((Integer) list.get(1)).doubleValue()); // 10.0

        // Java 1.5 Generics
        List<Integer> integers = new ArrayList<>(); // right hand side aligns left
                                                    // hand side

        // List<Integer> list2 = new ArrayList<>();
        // list2.add("abc");

        // Array of Object
        Object[] objects = new Integer[3];
        objects[0] = 100;
        objects = new String[3];
        // objects[0] = 100; // Runtime error, java.lang.ArrayStoreException

        Object s = "abc";
        s = 10;
        s = new IntegerBox();

        // After Java 1.5, define the type of List "at compile time"
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        // !!!! At compile time, Java confirm the type of "get(0)" must be String
        // object
        // !!!! so you can use charAt() right after get(0)
        System.out.println(strings.get(0).charAt(1)); // b

        ArrayList<String> strings2 = new ArrayList<>();
        // add()
        strings2.add("hello");
        strings2.add("abc");
        strings2.remove(1);

        Box<int[]> arrayBox = new Box<>();
        arrayBox.setValue(new int[] { 2, 3, 1 });
        Arrays.sort(arrayBox.getValue());
        System.out.println(Arrays.toString(arrayBox.getValue())); // [1,2,3]

        Box<String> box10 = createBox("abc");
        Box<Integer> box11 = createBox(100);
        Box<Number> box12 = createNumberBox(0.3);
        Box<Number> box13 = createNumberBox(3);
        Box<Number> box14 = createNumberBox(3L);
        // Box<Number> box15 = createNumberBox("abc");

        Box<CharSequence> box16 = createStringBox("abc");
        Box<CharSequence> box17 = createStringBox(new StringBuilder("abc"));
        Box<CharSequence> box18 = createStringBox(new StringBuffer("abc"));
    }
}