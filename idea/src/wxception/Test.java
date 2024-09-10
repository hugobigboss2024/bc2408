package idea.src.wxception;

public class Test {
    // 异常处理//try-catch-finally
    public static void main(String[] args) {
        try {// try语句块
            System.out.println(1 / 0);// 除数为0
        } catch (ArithmeticException e) {// catch语句块//ArithmeticException是除数异常,ArithmeticException is keyword or
                                         // identifier?
            System.out.println("除数ERROR");// if the exception is ArithmeticException, print "除数ERROR"
        } catch (Exception ex) {// catch语句块//ArithmeticException and Exception do not have the same name
            System.out.println("something error");// if the exception is not ArithmeticException, print "something
                                                  // error"
        } finally {// finally语句块,finally意思is ??????
            System.out.println("whatever allso will print out .....");
        }

    }
}
