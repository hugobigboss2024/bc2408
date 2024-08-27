
package Oopmethod;



public class Application  {
  public static void main(String[] args) {
      
  }
  public double CircleArea(double radius){//why MathConstants error????
    MathConstants mathconstants = new MathConstants(2.71828182845904,  9.8, 3.14159265358979);
    double ca = mathconstants.getPI() * radius * radius;
    return ca;
  }
}
