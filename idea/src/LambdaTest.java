public class LambdaTest {
    // ava Lambda 表達式是一種簡潔的語法，用於表示函數式接口的實現。旨在簡化代碼並提高可讀性，特別是在處理集合時。
    // Lambda 表達式使得書寫匿名函數變得更加簡單，並且可以用於簡化事件處理、並行處理和其他函數式編程的場景。
    // Lambda 表達式的基本語法
    // (parameters) -> expression //(parameters) -> { statements; }//參數 -> 語句//聲明
    // parameters：一組參數，可以是空的、單個或多個。
    // ->：箭頭操作符，將參數與函數體分開。
    // expression 或 statements：函數體，可以是一個表達式或者多條語句。
    @FunctionalInterface // 專門用來標記函數式接口。函數式接口是一種只包含一個抽象方法的接口，它可以被隨意實現，並且可以用作 Lambda 表達式的目標類型。
    interface Calculator {
        public Integer square(Integer s);// 是一個方法的聲明，它包含了方法的可見性、返回類型、方法名稱和參數。
    }

    @FunctionalInterface
    interface Fun {
        public double fun(double x);
    }

    public static void main(String[] args) {

        // msg -> { System.out.println(msg); };
        // Calculator calculator = (Integer s) -> {return s * s;}; //test1
        Calculator calculator = (Integer s) -> {
            return s * 2 - 1;
        };
        // System.out.println("5*5=" + calculator.square(5));//25 test1
        System.out.println("5*2-1=" + calculator.square(5));// 9
        calculator = c1 -> c1 * c1 - c1;
        System.out.println("4x4-4=" + calculator.square(4));// 12
        ///////////////////////

        Calculator calculator2 = s -> {
            Integer square = s * s;
            System.out.println(square);
            return square;
        };
        // 這行代碼在 Lambda 表達式中打印計算得到的平方。它會顯示 a 的平方值。return 這個 Lambda 表達式返回計算得到的平方值。
        System.out.println("5x5=" + calculator2.square(5));// 25
        // String square = "square";//如 果 放 在 lambda前 會 error,因同名,但放在lambda後就不會因同名而error

        // double d = Integral(new Fun(){public double fun(double x){ return
        // Math.sin(x);}}, 0, Math.PI, 1e-5);
        // d = Integral( x -> Math.sin(x), 0, Math.PI, 1e-5);
    }
}
