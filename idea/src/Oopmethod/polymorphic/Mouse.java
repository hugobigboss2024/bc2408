package idea.src.Oopmethod.polymorphic;

public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
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

    // just for Mouse method
    public void click() {
        System.out.println(name + "double click");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
