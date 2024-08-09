
import java.util.Arrays;

public class DemoArray {
public static void main(String[] args) {
//8 primitives + String
int x = 3;
int x2 = 6;
int x3 = -4;

  
int[] arr = new int[3];
arr[0] = 3;
arr[1] = 6;
arr[2] = -4;
System.out.println(arr[0]);
//System.out.println(arr.length)
//for(int i = 0; i < arr.length;)
//EX1 find the max num from the arry//loop
int[] arr3 = new int[3];
arr3[0] = 3;
arr3[1] = 6;
arr3[2] = -4;
int maxNum = -11111111;
for (int i = 0; i < arr3.length; i++){
  if(arr3[i] > maxNum){
    maxNum = arr3[i];
    System.out.println(arr[i]);
  }
}
for (int i = 1; i < arr3.length; i++) {
    if (arr3[i] > maxNum) {
        maxNum = arr3[i];
    }
}System.out.println( maxNum);
//find the min number
int[] ar = new int[3];
ar[0] = 3;
ar[1] = 6;
ar[2] = -1;
int min = 10;
for(int i = 0; i < ar.length; i++){
  if(ar[i] > min){
    min = ar[i];
  }System.out.println(min);
}
//WX4
double[] pr = new double[4];
pr[0]=10.3;
pr[1]=7.7;
pr[2]=1.5;
pr[3]=2.3;
int[] qu = new int[4];
qu[0]=10;
qu[1]=2;
qu[2]=5;
qu[3]=4;

double ttlAmount = 0.0;
for(int i = 0; i < pr.length; i++){
  ttlAmount += pr[i] * qu[i];
}
System.out.println("ttl amount" + ttlAmount);

//Ex5//average score
int[] scores = new int[5];
scores[0]=79;
scores[1]=70;
scores[2]=50;
scores[3]=100;
scores[4]=90;
//loop
double average = 0.0d;
for(int i = 0; i < scores.length; i++){
  average += scores[i];
}
System.out.println("Average score=" + average);
//declare and intialize an array
//Ex6
int[] arr8 = new int[]{100,-20,40,33,90,44,66};
//find all number that >40 and divided by 3
int[] as= new int[7];
int a = 0;
for(int i = 0; i < arr8.length; i++){
  if(arr8[i] > 40 && arr8[i] % 3 == 0){
    as[a++] = arr8[i];
    System.out.println(Arrays.toString(as));
  }
}
//Ex7
char[] arr9 = new char[2];
arr9[0] = 'h';
arr9[1] = 'a';
//swap
char backup;
backup = arr9[0];
arr9[0] = arr9[1];
arr9[1] = backup;
System.out.println(arr9[0]);
System.out.println(arr9[1]);

 }
}