public class LinkedList1<T> {
    private Node<T> head;
    private Node<T> last;

    public void add(T value) {

    }

    private class Node<T> {
        private T value;
        private Node<T> next;
        // constructor, getter, setter ...
    }

    public static void main(String[] args) {
        LinkedList1<String> strings = new LinkedList1<>();
        strings.add("Abc");
    }
}