public class tesr2 {
  public static void main(String[] args) {
      for(int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
          //int j = 1; j <= i; j++
          //int j = 1; j >= i; j++
          System.out.println("*");

        }System.out.println();
      }
      for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
          
        }
      }
      int a = 0;
      while(a<3){
        switch (a){
        case 0:
        System.out.println("0");
        case 2:
        System.out.println("2");  
        }
        a++;
      }
      String str = "";
      for (byte i = 127; i < 128; i++){
        if(i < 0){
          break;
        }
        str += i;
      }
      System.out.println(str);
  }
}
