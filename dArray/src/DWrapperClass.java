package dArray.src;

public class DWrapperClass {
  public static void main(String[] args) {
      //int -> Integer
    Integer i1 = 10; // i is an object reference
    //Integer i2 = new Integer(10); // 
    //if you a going to copare number object(Integer,long short,byte
    //java -> create String objects
    /*long L1 = 10;
    Byte b1 = (Byte)L1;
    System.out.println(b1);*/
    Long L2 = new Long(1000);
    //char -> Charsvter
    Character c = 'a';
    //auto-box, but actually itis calling "new"
    //8 primitives + 8 wrapper classes + String
    Integer[] intg = new Integer[]{10,8,4,-3,7};
    int count = 0;
    for(int i = 0; i < intg.length; i++){
      if(intg[i].compareTo(new Integer(5)) > 0 ){
        count++;
      }
}  System.out.println(count);
///////////////////////////////////////////
    Character[] cha = new Character[] {'c','9','g','0','e','!'};
    int isNum = 0;
    for(int i = 0; i < cha.length; i++){
      if(cha[i].charValue() >= 48 && cha[i].charValue() <= 57){
        isNum++;
      }
    }System.out.println(isNum);
    //cincat
    String s6 = "hello";
    s6 =s6 + "!!!";

    String s7 = "hello";
    s7 += "!!!";

    String s8 = "hello";
    s8 = s8.concat("!!!");

    ///////////////////////////////////
    System.out.println(new String("bootcamp").startsWith("bo"));
    System.out.println(new String("bootcamp").indexOf("boot") == 0);
    //////////////////////////////////
    //replace
    /*String s9 = "hello";
   // s9 = s9.replace('!', '?');*/
    //trim
    //String s10 = "  Vincent Lau ";
    //s10 = s10.trim(); 
    //System.out.println(s10);
    //toCharArray()is a for loop
    /*char[] cha1 = "123".toCharArray();
    char c1 =' ';
     for(int i = 0; i < cha1.length; i++){
     c1 = (char) (cha1[i] + 2);
      result += c1;}*/
      

  }
}
