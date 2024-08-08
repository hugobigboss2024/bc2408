public class democomparsinnB {
  public static void main(String[] args) {
    int num = 7;
int num2 = 8;
if(num % 2 != 0){   //num % 2 == 1
  System.out.println("a is odd number");
} else {
  System.out.println("a is even number");
}

if(num2 % 2 != 0){
  System.out.println("b is odd number");
} else {
  System.out.println("b is even number");
}
///////////////////////??
String day = "saturday";

        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println(day + " is a weekday.");
        } else if(day.equals("saturday") || day.equals("sunday")) {
            System.out.println(day + " is a weekend.");
        } else {
            System.out.println(day + " is not a valid day.");
        }/////////////////??
//e6  string str ="hello"
//sample ouput:
//the last character of str is 0. this an 

//e7 //reversed string
//string  s = "abc"
//the reversed string is cba

//e8 leap year
//1.divided by 4  2.not divided by 100  3.or divided by 400
int year = 1900;
//dsmple output:
//1900 is not a leap year
//2000 is a leap year
//2004 is a leap year
//2003 is not a leap year
///example //7 is an old number //8 is an even number
if (year % 4 == 0){
  System.out.println("year is leap year");}
  else{
    System.out.println("year is not a leap year");
  }
  //e9 age 18 or above nd he is a citizen -> eligible to vote.
  int age = 20;\
  boolean isCitizen = false;
  //Eligible to vote
  //not eligible. age < 18.
  //not eligible. not a citizen.
  //not eligible. age < 18 and not a citizen
  if(age >= 18 && isCitizen == true){
    System.out.println("eligible to vote");
  }
  else {
    System.out.println("not eligible");
  }
  //e10
  double totalPurchase = 250.0;
  //>= 500 =>20%off
  //>= 200 =>10%off
  //<200 no discount
  double discount;
  double amountToPay;

  if(totalPurchase >= 500){
  }if else(totalPurchase >= 200){
  }
  

  System.out.println("discount amount=" + discount);

  System.out.println("Amount to play=" + amountToPay);

  //e11
  char c = 'a';
  // a e i o u -> vowel
  //a is vowel. c is consonant.


}
    }
