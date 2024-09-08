package idea.src.Oopmethod;

public interface InterfaceJDK8 {

    default void run() {
        System.out.println("run run");
        go();
    }

    static void inAdde() {
        System.out.println("read java");
    }

    private void go() {
        System.out.println("start run");
    }

}

class PingPong implements InterfaceJDK8 {

}

class Test {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        pingPong.run();
        InterfaceJDK8.inAdde();
    }
}
