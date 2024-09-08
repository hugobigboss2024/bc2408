package idea.src.Oopmethod.polymorphic;

public class Test {
    public static void main(String[] args) {
        Compter c = new Compter();// 创建计算机
        USB u = new Mouse("samsung");// 创建鼠标
        c.installUSB(u);// 计算机安装鼠标
        USB k = new KeyBoard("LG");// 创建键盘
        c.installUSB(k);// 计算机安装键盘
    }
}
