package myTest;

public class StringTest2 {
  public static void main(String[] args) {
    String reverser = reverser("abc");
    System.out.println(reverser);
    /////////////////////////////
    String phoneNumber = "54499696";
    String stat =phoneNumber.substring(0, 3);
    String last = phoneNumber.substring(7);
    String result1 = stat+ "****" + last;
    System.out.println(result1);
    //////////////////////////////////
    String id = "19950122123456789";
    String yrar = id.substring(0, 4);
    String month = id.substring(4, 6);
    String day = id.substring(6, 8);

    char gender = id.charAt(8);
    int num = gender - 48;
    if(num % 2 == 0){
      System.out.println("girl");
    }else{
      System.out.println("boy");
      ////////////////////////////////
      String talk = "pkTMD fuck";
      String[] arr = {"fuck","pk","shit","on9"};
      for(int i = 0; i < arr.length; i++){
       talk = talk.replace(arr[i], "****");
      }
      
      System.out.println(talk);
      ///////////////////////////////
      StringBuilder sb = new StringBuilder("hey");
      //System.out.println(sb);  //StringBuiled print is not address
      sb.append(1);
      sb.append(2.3);
      sb.append(true);
      sb.reverse();
      //System.out.println(sb);
      int len = sb.length();
      //System.out.println(len);
      StringBuilder sb1 = new StringBuilder();
      sb1.append("qwe");
      sb1.append("asd");
      sb1.append("zxc");
      sb1.append("aa").append("bb").append("cc");
      String a = "++";
      //System.out.println(sb1.append(a.append(sb1)));
      // String cant append StringBuilder???
      //System.out.println(sb1);
      //System.out.println(sb1);  //qweasdzxc
      String str1 = sb1.toString();
      System.out.println(str1);  //qweasdzxc
      ////////////////////////////////////
      int [] arr1 = {1,2,3};
      String tostr =ArrToString(arr1);
      System.out.println(tostr);
      ////////////////////////////////////



    }
  }
  public static String ArrToString(int[] a){
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < a.length; i++) {
      if(i == a.length -1){
        sb.append(a[i]);
      }else{
        sb.append(a[i]).append(",");
      }
    }
    sb.append("]");
    return sb.toString();
  }
  
  public static String reverser(String str){
    String result = "";
  for(int i = str.length() - 1; i >= 0; i--){
    char c = str.charAt(i);
    result = result + c;
    //System.out.println(c);

  }
  return result;
  }
  
}
