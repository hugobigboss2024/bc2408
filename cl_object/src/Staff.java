public class Staff {
  // attributes
  private double salary;
  private int id;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;
  //intance method
  // getter // setter
  // presenetation
  public String getFullName(){
    return this.firstName + " " + this.lastName;
  }
  public double getBMI() {
    return this.weight / Math.pow(this.height, 2.0);
  }
  public void setHight(double height) {
    this.height = height;
  }
  public  void steWight(double weight) {
     this.weight = weight;

  }
  public Staff() {
  //you can perform any logic here.. // for, if
  System.out.println("staff");
    this.salary = 20000;
  }
  //class may have more than one constru
  

}
