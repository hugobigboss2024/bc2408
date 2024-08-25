package leet;

public class 3168 {
  //Minimum Number of Chairs in a Waiting Room
//You are given a string s. Simulate events at each second i:
//If s[i] == 'E', a person enters the waiting room and takes one of the chairs in it.
//If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
//Return the minimum number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially empty.
//Input: s = "EEEEEEE"
//Output: 7
//After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.Input: s = "ELELEEL"
//Output: 2
//Explanation:
//Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room at each second.}
public static void main(String[] args) {
  
}
public int minimumChairs(String s) {
  int max = Integer.MIN_VALUE;//????
  int count = 0;
for(int i = 0; i < s.length(); i++){
  // max number of E
  //count = s.charAt(i) == 'E' ? ++count : --count;//??????????
  if(s.chatAt(i) == 'E'){//?????
      count++;;
  }else{
      count--;
      max = Math.max(count, max);//??????
  }
  return max;

}