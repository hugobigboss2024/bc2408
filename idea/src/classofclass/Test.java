package idea.src.classofclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();// public static class inside class -> Object
        in.setName("aa");
        in.setAge(18);
        in.show();
        Outer.Inner2 in2 = new Outer().new Inner2();// public class inside class -> Object
        in2.show();
        Outer.Inner2.test();

        class Cat {// !!! no one will do that, just need to know have this class,(a class make int
                   // the mian)

            private String name;
            public static int onLineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }
        Cat c = new Cat();
        c.setName("boby");

        Animal a = new Animal() {// !!anonymous inner class??
            // !!!// = class Tiger extends Animal{
            // @Override
            // public void run(){
            // System.out.println("tiger run");
            // }
            // }
            @Override
            public void run() {
                System.out.println("tiger run");
            }
        };
        a.run();
    }
}

abstract class Animal {// abstract class for anonymous class
    public abstract void run();

}