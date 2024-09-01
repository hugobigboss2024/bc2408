package crew;

public class Test {
    public static void main(String[] args) {
        Crew c = new Crew();
        c.setName("wan");
        c.setAge(30);
        c.setDepartment('c');
        c.setSex('m');
        c.setPosition("lv5");

        ////////////////////////////////
        Crew c2 = new Crew("tom", 23, 'm', "lv4", 'c');

    }
}
