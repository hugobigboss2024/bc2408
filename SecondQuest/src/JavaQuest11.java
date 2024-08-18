public class JavaQuest11 {//end
  public static void main(String[] args) {
      // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time
  int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
  int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
  int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
}

public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
  // code here ...
  int time1 = arrivalTime + delayedTime;
  if(time1 < 24){
  System.out.println(time1);
  }else if(time1 >=24){//need >= cannot just >
    time1 = time1 - 24;
    System.out.println(time1);
  }
  return time1;
}
  }

