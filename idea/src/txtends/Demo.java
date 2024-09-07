package idea.src.txtends;

public class Demo {
    public static void main(String[] args) {
        /*
         * Fu f = new Fu();
         * f.show();
         * Zi z = new Zi();
         * z.method();
         * z.show();
         */
        Zi z = new Zi();
        z.show();
        Teacher t1 = new Teacher();
        t1.setName("miss");
        t1.setAge(25);
        System.out.println(t1.getName() + " " + t1.getAge());
        t1.teach();
        Teacher t2 = new Teacher("mr", 26);
        System.out.println(t2.getName() + " " + t2.getAge());
        t2.teach();

    }
}
