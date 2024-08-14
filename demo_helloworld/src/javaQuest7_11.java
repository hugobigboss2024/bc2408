public class javaQuest7_11 {
  public static void main(String[] args) {
      
//總和是55
//數組的總和值
//宣告一個int數組取值1到10
//寫一個迴圈來對 int 陣列中的所有值求和
    int sum = 0;
    int[] nu = new int[]{1,2,3,4,5,6,7,8,9,10};
    for (int i = 0; i < nu.length; i++) {
      sum += nu[i]; 
  }
    System.out.println("The sum is " + sum);


    ///////////////////////////////////////
    //第二個最大值 = 230
 //寫一個循環來找出第二個最大數。
 //您的程式應該能夠處理上述所有測試案例。
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; 
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; 
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; 
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; 

    
    int secondMax;
   /////////////////////////////////////////////////
  
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
      
  }
  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    // code here ...
  }

}
