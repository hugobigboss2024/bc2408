

import java.util.LinkedList;
import java.util.List;

public class Box {
  // private int length;
  private Box next;
  private int value;
  // private Box tail; // LinkedList.class

  public Box() {

  }

  public Box(int value) {
    this.value = value;
  }

  public Box(int value, Box next) {
    this.value = value;
    this.next = next;
  }

  // Normal getter
  public Box getNext() {
    return this.next;
  }

  // Normal getter
  public int getValue() {
    return this.value;
  }

  // instance method
  // return this.arr[index];
  public int get(int index) {
    int count = 0;
    Box head = this;
    while (head != null) {
      if (++count > index) {
        return head.value;
      }
      head = head.next;
    }
    return -1; // throw
  }

  public Box getTail() {
    Box head = this;
    while (head.next != null) {
      head = head.next;
    }
    return head;
  }

  @Override
  public String toString() {
    Box head = this;
    StringBuilder sb = new StringBuilder("Box(");
    while (head != null) {
      sb.append(head.getValue());
      head = head.next;
      sb.append(",");
    }
    return sb.deleteCharAt(sb.length() - 1).append(")").toString();
  }

  public static void main(String[] args) {
    // 3 ways to store a list of value of same type
    // [3, 10, 7] -> 1. array 2. arraylist 3. linkedlist

    // Explaination of Linked List
    Box stringList = new Box(3, new Box(10, new Box(7)));

    // get the first element
    System.out.println(stringList.getValue()); // 3
    // get the second element
    System.out.println(stringList.getNext().getValue()); // 10
    // get the third element
    System.out.println(stringList.getNext().getNext().getValue()); // 7

    // !!! O(1) -> Constant time -> add element at head
    // Add new element at head position
    stringList = new Box(100, stringList);
    System.out.println(stringList.getValue()); // 100

    // !!! O(1) -> Constant time -> add element at tail
    // Add new element at tail position
    Box tail = stringList.getTail(); // !!! LinkedList.class store the tail
                                     // address as an attribute
    tail.next = new Box(200);

    System.out.println(stringList); // Box(100,3,10,7,200,)

    // get()
    System.out.println("get()=" + stringList.get(3)); // 7

    // !!!!
    List<Integer> integerLinkedList = new LinkedList<>();
    integerLinkedList.add(3);
    integerLinkedList.add(10);
    integerLinkedList.add(7);
    System.out.println(integerLinkedList); // [3, 10, 7]

    // Polymorphism
    // !!! LinkedList.get(2) -> loop
    integerLinkedList.get(2);

    // !!! ArrayList.get(10) -> arr[10] (head address + 10)
    // if we change the implementation of integerLinkedList -> ArrayList // line
    // 98
    // then the get() will perform better.

    // OK, for-each + LinekdList object
    // while loop (JVM doesn't know the length of integerLinkedList)
    for (Integer integer : integerLinkedList) {
      System.out.println(integer);
    }

    System.out.println(integerLinkedList.size()); // 3, while loop or cache
                                                  // store ...


  }
}