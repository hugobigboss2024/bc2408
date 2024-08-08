public class DemoString{
  public static void main (String[] args){

    String s;
    s = "yoyo";
    String s2;
    s2 = "god";

    int me = 23;
    int mygf = 18;

    
    System.out.println(s + s2);

    char result = s.charAt(0);
    System.out.println(result);
    System.out.println(s.length());
    System.out.println(s.length() >= 3);
    System.out.println(s.charAt(1));
    //////////////
    //EX16
   // for (int i = 0; i < 5; i++) {
     // for (int j = 0; j< 4; j++) {
         // System.out.print("*")} }
        int n = 5; 
        for (int i = 0; i < n; i++) {
        for (int j = n; j > i; j--) {
        System.out.print("*");
        }System.out.println();
        
}


  }
}