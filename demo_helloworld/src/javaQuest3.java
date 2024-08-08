
import java.util.Scanner;

public class javaQuest3 {
  

public static void main(String[] strings) {
  Scanner input = new Scanner(System.in);

  int number_Of_DaysInMonth = 0;
  String monthOfName = "Unknown";

  System.out.print("Input a month number: ");
  int month = input.nextInt();

  System.out.print("Input a year: ");
  int year = input.nextInt();

  switch (month) {
      case 1:
          monthOfName = "January";
          number_Of_DaysInMonth = 31;
          break;
      case 2:
          monthOfName = "February";
          if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
              number_Of_DaysInMonth = 29;
          } else {
              number_Of_DaysInMonth = 28;
          }
          break;
      case 3:
          monthOfName = "March";
          number_Of_DaysInMonth = 31;
          break;
      case 4:
          monthOfName = "April";
          number_Of_DaysInMonth = 30;
          break;
      case 5:
          monthOfName = "May";
          number_Of_DaysInMonth = 31;
          break;
      case 6:
          monthOfName = "June";
          number_Of_DaysInMonth = 30;
          break;
      case 7:
          monthOfName = "July";
          number_Of_DaysInMonth = 31;
          break;
      case 8:
          monthOfName = "August";
          number_Of_DaysInMonth = 31;
          break;
      case 9:
          monthOfName = "September";
          number_Of_DaysInMonth = 30;
          break;
      case 10:
          monthOfName = "October";
          number_Of_DaysInMonth = 31;
          break;
      case 11:
          monthOfName = "November";
          number_Of_DaysInMonth = 30;
          break;
      case 12:
          monthOfName = "December";
          number_Of_DaysInMonth = 31;
          break;
      default:
          System.out.println("Invalid month number");
          
  }

  System.out.println(monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
}
}