public class javaQuest4_6 {
  public static void main(String[] args) {
      
    int k = 10;
    
    for(int i = 0; i < 100; i++){
      for(int j = k; k > i; j-- ){
      if(i % 2 == 0 && i % 3 == 0 && i >= 0){
        System.out.println(i);
      }
      }
    }
    /////////////////////////////
    String str = "coding bootcamp";
    char target = 'c';
    int last = -1;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            last = i;
        }
    }
    
    if (last == -1) {
        System.out.println("Not Found");
    } else {
        System.out.println("The last index of '" + target + "' is: " + last);
    }
    /////////////////////////////
    int first = 0 , second = 1;
    System.out.print(first + " " + second + " ");
    for (int i = 0; i < 13; i++) {
      int next = first + second;
      System.out.print(next + " ");
      first = second;
      second = next;
  }

  }
}
