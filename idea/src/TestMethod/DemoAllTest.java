package idea.src.TestMethod;

public class DemoAllTest {
    public static void main(String[] args) {
        // Singleinstance s1 = new Singleinstance();//error
        Singleinstance s1 = Singleinstance.si;
        Singleinstance s2 = Singleinstance.si;
        System.out.println(s1 == s2);
        Singleinstance2 s3 = Singleinstance2.getInstance();
        Singleinstance2 s4 = Singleinstance2.getInstance();
    }
}
