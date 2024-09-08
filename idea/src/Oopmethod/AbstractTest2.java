package idea.src.Oopmethod;

public class AbstractTest2 {// abstract class can not make object, cant to new
    public static void main(String[] args) {

    }
}

class Cat extends Animal {
    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }

}

abstract class Animal {
    public abstract void run();

    public abstract void eat();
}
