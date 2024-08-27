public class DemoSwitch {
  public static void main(String[] args) {
    int age = 19;
    boolean isAdult = false;
    if (age >= 18) {
      isAdult = true;
    }
    System.out.println("isAdult=" + isAdult);

    isAdult = false;
    // 1. if you do not "break" the switch case, the flow will go through all
    // cases.
    // 2. for case, you can only define one value for checking. No range
    // checking.
    // 3. "Switch" statment is only for finite scenario
    // 4. For "Switch", Java will check your case value, it alerts when there is duplicated.
    switch (age) {
      case 18:
        isAdult = true; //
        System.out.println("18");
        break;
      case 17:
        isAdult = false;
        System.out.println("17");
        break;
      case 16:
        isAdult = false;
        System.out.println("16");
        break;
    }
    System.out.println("isAdult=" + isAdult);

    //
    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("it is weekday");
        // break;
      case "Tuesday":
        System.out.println("it is weekday"); // print
        // break;
      case "Wednesday":
        System.out.println("it is weekday"); // print
        // break;
      case "Thursday":
        System.out.println("it is weekday"); // print
        // break;
      case "Friday":
        System.out.println("it is weekday"); // print
        // break;
      default:
        System.out.println("it is weekend"); // print
    }

    int x = 3;
    int y = (x++ + 3) * x--;
    // (3 + 3) * 4
    System.out.println(y); // 24
    System.out.println(x); // 3

  }
}
