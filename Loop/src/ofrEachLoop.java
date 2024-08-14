package Loop.src;

public class ofrEachLoop {
  public static void main(String[] args) {
      int[] arr = new int[] {2,9,10,-3};
      for(int i : arr){
        //for-eacg loop
        //print out elements
        System.out.println(i);
        int sum = 0;
        sum += i;
        // loop string array// for-each
        String[] fruits = new String[] {"apple","orange", null,"banana"};
        for(String fruit : fruits){
          if(fruit != null &&"o".equals(fruit.substring(0, 1))){
            System.out.println(fruit.charAt(fruit.length() -1));{
      
            }
        }
      }
  }
}
