
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
    /////////////////////////
    for(int i = 1; i <= 10; i++){
    System.out.println("5times");}
    /////////////////////
    for(int i = 5; i >= 1; i--){
      System.out.println(i);
    }
    /////////////////////////
    for(int i = 1; i <= 5; i ++){
      System.out.println("this is" + i + "thimes");}
      ///////////////////
      int sun = 0;
      for(int i = 1; i <= 5; i++){
      //System.out.println(i);
      sun = sun += i;
      }System.out.println(sun);
      ////////////////////
      int[] arr = {1,3,4,5,6};
      int sex = 0;
      int  two = 2;
      sex = arr[4];
      arr[4] = arr[3];
      arr[3] = arr[2];
      arr[1] = arr[2];
      arr[1] = two;
      System.out.println(arr.toString());//why is [I@31befd9f???
      for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
        pay1();
        getLength(5.2, 1.3);
      }
      

    }
    
    public static void pay1(){
      System.out.println("set a");
    }
    public static void getLength(double  len , double width) {
      double reault = (lan + width) * 2;
      System.out.println(reault);
    }
    
  }

