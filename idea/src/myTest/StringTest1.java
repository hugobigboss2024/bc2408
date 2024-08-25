package myTest;

public class StringTest1 {
  
  
  public static void main(String[] args) {
    String s1 = new String();
    System.out.println("q" + s1 + "q");
    String s2 = new String("aaa");
    String s2a = s2;
    s2a = new String("poi");
    System.out.println(s2);
    char[] chs = {'a','b','c'};
    String s3 = new String(chs);//mix chs array to a String
    System.out.println(s3);
    byte[] bytes = {97,98,99,100};
    String s4 = new String(bytes);//byte -> Ascii show to String(97=a,98=b,99=c,100=d)
    System.out.println(s4);
    System.out.println(s2 == s2a);
    /////////////////////////////////
    String s5 = new String("abc");
    String s6 = "abc";
    String s7 = "Abc";
    boolean resultl =s5.equals(s6);
    boolean result2 = s5.equalsIgnoreCase(s7);
    System.out.println(resultl);
    System.out.println(result2);
    //////////////////////////////
    int[] arr = {1,2,3};
    String str = ArrToString(arr);
    System.out.println(str);//{123

  }
    ////////////////////////////
    public static String ArrToString(int[] arr){
      if(arr == null){
        return "";
      }
      if(arr.length == 0){
        return "[]";
      }
      String result = "[";
  
      for (int i = 0; i < arr.length; i++) {
        if(i == arr.length - 1){
          result = result + arr[i];
        }else{
        result = result + arr[i] + ",";
      }
    }
      result = result + "]";
      return result;


    
  }

}
