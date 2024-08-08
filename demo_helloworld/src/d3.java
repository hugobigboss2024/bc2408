public class d3 {
  public static void main(String[] args) {

    int aint = 10;
    double bdouble = 9.5;

    System.out.println(aint + bdouble);
    System.out.println(aint == bdouble);

    String money = "number";
    System.out.println(money );
System.out.println("my" + "" + money + (aint + bdouble) + '$');

    System.out.println(money.length());
    System.out.println(money.equals(aint));
    System.out.println(money.charAt(1));
////////////////////////////////////////////
int intValue = 42;
double doubleValue = intValue;
System.out.println("original int value:" + intValue);
System.out.println("converted double value:" + doubleValue);
//if,else
int year = 1900;
if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
  System.out.println(year + "is leap year");
}else{
  System.out.println(year + "not leap year");
}
//////////////////////////////////////////////
//wx10
double ttlPurchase = 150.0;
double discount = 0.0d;
if(ttlPurchase >= 500.0){
  discount = ttlPurchase * 0.2;
}else if (ttlPurchase >= 200.0 && ttlPurchase < 500.0){
  discount = ttlPurchase * 0.1;
}else{
  discount = 0.0;
}
System.out.println("discount amount=" + discount);
//System.out.println("amount yo pay" + amoutToplay);

///loop
int x = 3;
x *= 3;
x *= 3;
x *= 3;
System.out.println(x);

int y = 3;
for(int i = 0; i < 3; i++){
  y = y * 3;
  System.out.println(y);
}
for(int i = 0; i < 5; i++){//01234
  System.out.println("hello ");
}
//ex3
//print all odd numbers between 0-10//loop and if
for (int ii = 0; ii < 11; ii++ ){
  if(ii % 2 != 0){
    System.out.println(ii);
  }else{
    System.out.println(" ");
  }
  for(int iii = 10; iii > 0; iii--){
    //for(int i = 0; i <10; i++)
    if(iii % 2 != 0){
      System.out.println(iii);}
      ////////////////////
      //Ex5  "acegik" loop,if,charAt,lenght
      //String str = "abcdefghijk";
      //for(int I = 0; I < str.length(); I+){
      //if(I & 2 == 0){str = str.charAt(I)
      //System.out.println(str);}}

      //Ex6
      String s1 ="bbiigggooooos";
      char target = 'b';
      int count = 0;
      for(int o = 0; o < s1.length(); o++){
        if(s1.charAt(o) == target){
          count++;
        }System.out.println("the number of character" + target + "is" + count);
      int tt = 0;
          for(int oo = 1; oo < 50; oo++){
            if(oo % 2 == 1){
              tt+= oo;
              }else{
                tt-= oo;
                }  System.out.println(tt);
          
            //ex9//print the index of j. if j is not found,print -1
            String s3 ="dfghjkl"; 
            int pos = -1;
            boolean found = false;
            for(int i = 0; i < s3.length(); i++){
              if(s3.charAt(i) == 'j'){
                found = true;
                pos = i;
              }
            }
            int idx = -1;
            if(found){
              idx = pos;
            }System.out.println("position of j=" + idx);
            System.out.println(s3.indexOf('j'));// indexOf()
            //ex10 //check if the last character is o -> true
            char te = 'o';
            String s4 = "hello";
            System.out.println(s4.endsWith("o"));//startsWith() endsWith()
            //substring()
            String s5 = "abcdefghik";
            System.out.println(s5.contains("def"));
            System.out.println(s5.substring(2, 2 +3));
            System.out.println(s5.substring(1 + 6));
            //ex11  //for loop//dont use indexof() or contains()
            //found or not found
            String s6 = "abcdefgh";
            String subString = "def";


            /////////
            //nested loop
            for(int i = 0; i < 3; i++){
              for(int j = 0; o < 2; i++){
                System.out.println("i=" + i + "j=" + j);
              }
            }
            //break
            String s7 = "qwertyu";
            found = false;
            for(int i = 0; i < s7.length(); i++){
              if(s7.charAt(i) == 'k'){
                found = true;
                break;

              }
            }

            



          }
      
    }
  }

}

  }
}
