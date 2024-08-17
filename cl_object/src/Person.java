public class Person {
  private String name;
  private int age;

  // empty , all-args
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  //thstint
  public static void main(String[] args) {
      //memory // when you create one all-arg constructor only
      //compiler wouli not create the empty constructor for you anymore.
      //Person person = new Person(); compile error
      Person person = new Person("john", 66);
      //System.out.println(person.getName);


  }
}
