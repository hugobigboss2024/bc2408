public class Animal {
  private int age;
  private String name;

  public Animal() {

  }

  public Animal(int age, String name) {
    this.age = age;
    this.name = name;
  }

  // getters
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void eat() {
    System.out.println("Animal is eating ...");
  }
}
