package idea.src.Oopmethod;

public class InterfacePingPongMan implements InterfaceSportMan, InterfaceLaw {
    private String name;

    public InterfacePingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "need run test");

    }

    @Override
    public void competition() {
        System.out.println(name + "need run competition to win");

    }

    @Override
    public void rule() {
        System.out.println(name + "need run rule");
    }

}
