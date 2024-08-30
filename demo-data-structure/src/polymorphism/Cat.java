public class Cat implements Eatable { // Cat similar to LinkedList.class
    @Override
    public void eat() {
      System.out.println("Cat is eating ...");
    }
  
    public static void main(String[] args) {
      Eatable animal = new Dog();
      animal.eat(); // Dog is eating ...
  
      Eatable animal2 = new Cat();
      animal2.eat(); // Cat is eating ...
  
    }
  }
