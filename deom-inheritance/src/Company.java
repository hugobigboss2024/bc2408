package deom-inheritance.src;

public class Company {
  private Staff2 staff;

  public Staff2 getStaff() {
    return this.staff;
  }

  public static void main(String[] args) {
    System.out.println(LocalDate.of(2024, 1, 1).toString()); // 2024-01-01
    System.out.println(LocalDate.of(2024, 1, 1).equals(LocalDate.of(2024, 1, 1))); // true
    System.out.println(LocalDate.of(2024, 1, 1).equals(new Dog())); // false
  }
}
