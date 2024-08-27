
package Oopmethod;

public class MathConstants {
   // public static final double PI = 3.14159265358979;
   // public static final double E = 2.71828182845904;
   // public static final double GRAVITY = 9.8; 
   private double E;
   private double GRAVITY;
   private double PI;

  
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

   

    
}
