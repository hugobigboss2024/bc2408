package deom-inheritance.src;

public class Child extends Parent {
  private double y;
  private byte age; // !!!

  // Two meanings of "super"
  // 1. call parent class constructor
  // 2. super class object address

  // calling super() implicitly
  public Child() {

  }

  public Child(String s) {
    super(s);
  }

  public Child(int x) {
    super(x, (byte) 0); // pick one of the parent constructor to call
  }

  public Child(int x, byte age, double y) {
    super(x, age);
    this.y = y;
  }

  public void setAge(byte age) {
    super.age = age;
  }

  public void run() {
    super.sleep(); // "super" here is something like parent object address
  }

  @Override
  public void sleep() {
    super.sleep();
    System.out.println("something else after super.sleep() ...");
  }

  public byte getAge() {
    return this.age; // super.b;
  }

  // JVM machine -> java object (heap)
  public static void main(String[] args) {
    // Once you decided to extend a parent class
    // all child object has an "inside object"
    // so, all child constructor has to "super"
    Child child = new Child(); // inside object

    Child c2 = new Child(10);

    // value 20 goes to "Parent object"
    // value 99.9 goes to "Child Object"
    Child c3 = new Child(20, (byte) 3, 99.9);

    c3.sleep();
    // c2's parent object is not same as c3's parent object

    c3.setAge((byte) 10);
    System.out.println(c3.getAge()); // !!! 0, why?

    // We have attribute "age" in both child and parent class

    // Chapter 17: Polymorphism
    Child c = new Child(); // OK
    Parent p = new Child(); // upcast, Also OK

    c.run();
    c.sleep();

    p.sleep();
    // p.run(); // At compile-time, p cannot call run() method
    // because the scope of object is determined by the type of object
    // reference.

    Child c4 = (Child) p; // safe
    c4.run();
    c4.sleep();

    // On the other hand,
    Parent p2 = new Parent(); 
    if (p2 instanceof Child) { // avoid the error
      Child c5 = (Child) p2; // runtime error, java.lang.ClassCastException
      c5.run();
    }
  }
}