package idea.src.txtends;

public class Zi extends Fu {
    public double hight = 175.1;
    public int age = 10;

    public void show() {
        // System.out.println("我是子类的方法");
        int age = 20;
        System.out.println(hight);
        // System.out.println(age);
        // System.out.println(weight);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
