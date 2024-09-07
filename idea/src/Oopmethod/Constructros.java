package idea.src.Oopmethod;

public class Constructros {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1);
        // "Animal created..."
        // "Dog created..."
        Dog d2 = new Dog("bb");
        System.out.println(d2);
        // "Animal created..."
        // " new Dog created..."

    }

}

class Animal {
    public Animal() {
        System.out.println("Animal created...");
    }

}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog created...");

    }

    public Dog(String name) {
        System.out.println(" new Dog created...");
    }

}
