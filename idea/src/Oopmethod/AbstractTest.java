package idea.src.Oopmethod;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractGoldCar c = new AbstractGoldCar();
        c.setMoney(5000);
        c.setName("tom");
        c.pay(300);
        System.out.println(" new money:" + c.getMoney());

        TemplateMiddle m = new TemplateMiddle();
        m.write();

    }
}

abstract class Animal {// abstract method need add"abstract" to class,if not abstract will not work
    public abstract void run();// abstract method cant make method code
}