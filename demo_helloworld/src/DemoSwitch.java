public class DemoSwitch {
  public static void main(String[] args) {
      int age = 18;
      boolean isAdult = false;
      if (age >= 18) {
        isAdult = true;
System.out.println("isAdult=" + isAdult);}
//switch,  case  ,break , default
//switch only for finite scenario
//for case, you can only define one value for checking. no range checking
      String day = "2";
      switch (day){
       case "1":
       System.out.println("it is weekday");
      break;
      case "2":
      System.out.println("it is weekday");
      break;
      case "3":
      System.out.println("off");
      break;
      default:
      System.out.println("off");
      
      }

  }
}
