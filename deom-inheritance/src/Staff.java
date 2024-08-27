package deom-inheritance.src;

public class Staff {
  


  public static void main(String[] args) {
    Object object = new Object(); // concrete class and top most class
    System.out.println(object.equals(new Object())); // false

    // implicitly extends "Object.class"
    Staff staff = new Staff();
    // staff.toString()
    // staff.equals(new Staff())
    // staff.hashCode()

    // if we do not override toString(), equals(), hashCode()
    System.out.println(staff.toString()); 
    // Staff@7344699f, Object.class toString() method return the object address
    System.out.println(staff.equals(new Staff()));
    // false, Object.class equals() is checking if they are in same address
    System.out.println(staff.hashCode()); // 1933863327, represents the object address
    System.out.println(new Staff().hashCode()); // 112810359, represents the object address
    


  }
}
