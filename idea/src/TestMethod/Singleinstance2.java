package idea.src.TestMethod;

public class Singleinstance2 {
    private static Singleinstance2 si2;

    private Singleinstance2() {

    }

    public static Singleinstance2 getInstance() {
        if (si2 == null) {
            si2 = new Singleinstance2();
        }
        return si2;
    }
}
