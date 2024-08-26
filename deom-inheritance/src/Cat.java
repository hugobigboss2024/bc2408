public class Cat extends Animal {
  private String color;

  // empty constructor

  // In Java, we never inherit constructor from Parent Class
  // but we can call parent constructor
  public Cat(int age, String name, String color) {
    super(age, name); // call parent constructor
    this.color = color;
  }

  public Cat(String color) {
    this.color = color;
  }

  public Cat() {

  }

  public String getColor() {
    return this.color;
  }

  // implicitly
  public String getName() {
    // return super.getName();
    return "Vincent";
  }

  // public void eat() {
  //   System.out.println("Cat is eating ...");
  // }

  public String toString() {
    return "Cat(" //
        + "name=" + super.getName() //
        + ", age=" + this.getAge() //
        + ", color=" + this.color //
        + ")";
  }

  public static void main(String[] args) {
    // Parent Class -> Animal.class
    // Child Class -> Cat.class

    // Child object inherits Parent object attributes & behaviors
    Cat cat = new Cat();
    // Cat object inherits Parent object
    System.out.println(cat.getAge()); // 0 (default value of int)
    System.out.println(cat.getColor()); // null (default value of String)

    Animal animal = new Animal();
    System.out.println(animal.getAge()); // 0
    // animal.getColor(); // error

    String yellow = "Yellow";
    // Cat -> 10, John, Yellow
    Cat cat2 = new Cat(yellow);
    System.out.println(cat2.getAge()); // 0
    cat2.setAge(10);

    Cat cat3 = new Cat(10, "John", "Yellow"); // super(10, "John")
    System.out.println(cat3);

    // if there is NO eat() method in Cat.class
    cat3.eat(); // Animal is eating ...


  }
}
