package idea.src.Oopmethod.polymorphic;

public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "ok for connect");

    }

    @Override
    public void unconnect() {
        System.out.println(name + "ok for unconnect");
    }

    // just for KeyBoard method
    public void keyDown() {
        System.out.println(name + "warnning...............");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
