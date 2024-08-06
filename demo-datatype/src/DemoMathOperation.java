public class DemoMathOperation {
  public static void main(String[] agrgs) {
    int x = 10 + 3;
    System.out.println(x);
    x = x + 3 - 9;
    System.out.println(x);

    int r = 100 % 5;
    System.out.println(r);
//double
//+-*/%

double q = 101.1;
System.out.println(q*2);//202.2
System.out.println(q/1);//
System.out.println(q%5.0);//1.1
System.out.println(q%5);//1.1

int w = 1;
w = w + 1;
w++;
System.out.println(w);
w--;
System.out.println(w);
int m = 20;
m += 10;
System.out.println(m);
m -= 10;
System.out.println(m);
m *= 2;
System.out.println(m);

int apple = 3;
int oranges = 10;
double pricePerApple = 3.3;
double pricePerOranges = 5.5;


 double totalAmount = apple * pricePerApple + oranges * pricePerOranges;


System.out.println(totalAmount);

// example2
int maths = 90;
int english = 70;
int history = 60;

//double averageScore = ( maths + english + history) / 3 //3.0 cam change to double 3 acnt change
//3 is int 3.0 is double ;
//System.out.println(averageScore);// int+int/int 100% of int (cant double)

int k = 0;
k = k++ + 3;
System.out.println(k);

String yo;
yo = "yoyo";
String hi;
hi = "hey";
String all = "";
all += all + yo + "" + hi;
System.out.println(all);







  }
  
}
