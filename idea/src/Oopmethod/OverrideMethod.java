package idea.src.Oopmethod;

public class OverrideMethod {
    // static method cant override
    public static void main(String[] args) {
        NewPhone lg = new NewPhone();
        lg.call();
        lg.message();
    }
}

class phone {
    public void call() {
        System.out.println("Calling");
    }

    public void message() {
        System.out.println("Message");
    }
}

class NewPhone extends phone {
    @Override
    public void call() {// override
        super.call();
        System.out.println(" cam Calling");
    }

    @Override
    public void message() {// override
        super.message();
        System.out.println("send photo");
    }
}
