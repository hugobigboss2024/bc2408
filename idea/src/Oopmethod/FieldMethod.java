package idea.src.Oopmethod;

public class FieldMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.lookDoor();
        dog.showName();

    }
}

class Animal {
    public String name = "animal name";

    public void run() {
        System.out.println("Animal can running...");
    }
}

class Dog extends Animal {
    public String name = "dog name";

    public void lookDoor() {
        System.out.println("Dog can looking door...");
    }

    public void showName() {
        String name = "void name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        run();
        super.run();
    }

    public void run() {
        System.out.println("Dog running...");
    }
}
