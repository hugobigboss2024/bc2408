import java.util.Scanner;

public class homesc1 {
  
public static void main(String[] args) {
     //score [0-100]
   //the average score of 4 scores after excluding the highest ant the lowest frome 6 people ratings
   //1, make array of people(6)score(0-100)//2,need to know the highest//3,need to know the lowest//4,need total score
   //5, total-highest-lowest
   int[] scoreArr = getScores();
   for(int i = 0; i < scoreArr.length; i++){
    System.out.println(scoreArr[i]);
   }
   int max = getMax(scoreArr);
   int min = getMin(scoreArr);
   int sum = getSum(scoreArr);
   int avg = (sum - max - min) / (scoreArr.length -2);
   System.out.println("% scores is" + avg);
}
public static int getSum(int[] scoreArr){
  int sum = 0;
  for(int i = 0; i < scoreArr.length; i++){
    sum =sum + scoreArr[i];
  }
  return sum;
}
public static int getMax(int[] scoreArr){
   int max = scoreArr[0];
   for (int i = 1; i < scoreArr.length; i++) {
    if(scoreArr[i] > max){
      max = scoreArr[i];
   }
  }return max;
}
public static int getMin(int[] scoreArr){
  int min = scoreArr[0];
  for (int i = 1; i < scoreArr.length; i++) {
   if(scoreArr[i] > min){
     min = scoreArr[i];
   }
  }
 return min;
}
 public static int[] getScores(){
    int[] scores = new int[6];
    Scanner sc1 = new Scanner(System.in);
    for(int i = 0; i < scores.length;){
      System.out.println("input scores");
    int score = sc1.nextInt();
    if(score >=0 && score <= 100){
      scores[i] = score;
      i++;
    }else{
      System.out.println("error");
    }
    }
    return scores;

  }
}
