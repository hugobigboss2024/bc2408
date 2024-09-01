package myTest;

import java.util.Objects;

public class Test7 {
   private  String name;
   private  int num;

   public Test7(String name, int num){
    this.name = name;
    this.num = num;
   }
   public String getName(){
    return this.name;
   }
   public int getNum(){
    return this.num;
   }

   @Override
   public String toString(){
    return " " + this.name;
   }
   @Override
   public boolean equals(Object obj){
    if(this == obj)
    return  true;
    if(!(obj instanceof Test7))
    return false;
    Test7 test = (Test7) obj;
    return Objects.equals(this.name, test.getName())//
    &&Objects.equals(this.num, test.getNum());
   }
   @Override
   public int hashCode(){
    return Objects.hash(this.name, this.num);
   }
   public static void main(String[] args) {
       Test7 t1 = new Test7("a", 2024);
       Test7 t2 = new Test7("b", 1995);
       System.out.println(t1.hashCode() == t2.hashCode());
       System.err.println(t1.toString());
       System.err.println(t1.equals(t2));
   }

}
