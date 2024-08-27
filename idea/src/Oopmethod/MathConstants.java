
package Oopmethod;

public class MathConstants {
    private double PI ;
    private double E ;
    private double GRAVITY ; 
   //private double E = 2.71828182845904;
   //private double GRAVITY = 9.8;
   //private double PI = 3.14159265358979;
   //radius = 5 , t = ??
   //public static final double PI = 3.14159265358979;
   //public static final double E = 2.71828182845904;
   //public static final double GRAVITY = 9.8; 
   public MathConstants(){

   }

  
   public MathConstants(double E, double GRAVITY, double PI) {
       this.E = E;
       this.GRAVITY = GRAVITY;
       this.PI = PI;
   }

   public double getPI() {
       return this.PI;
   }

   public double getE() {
       return this.E;
   }

   public double getGRAVITY() {
       return this.GRAVITY;
   }
   public double CircleArea(double radius){
     return PI * radius * radius;
   }
   public double fallingDistance(double t){
     return 0.5 * GRAVITY * t * t;
   }
   public final double eulersNumber (){
     return E;
   }

   

    
}
