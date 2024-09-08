package idea.src.Oopmethod;

public abstract class TemplateStudent {

    public final void write() {// final修饰可以防止子类重写父类方法
        System.out.println("start");
        System.out.println(writeMain());

        System.out.println("end");
    }

    public abstract String writeMain();
}
