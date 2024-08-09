public class testtest {
  public static void main(String[] args) {
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    
    double average = 0.0;
    int sum = 0;
    
    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }
    
    average = (double) sum / scores.length;
    
    System.out.println("Average score = " + average);
  }
}
