

public enum Status {
 PAID(1), READY_TO_SHIP(2), SHIPPING(3), DELIVERED(4),;
  // attribute design
  // purpose: easier to find something

  private int value;

  private Status(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Status get(int value) {
    for (Status status : Status.values()) {
      if (value == status.getValue())
        return status;
    }
    return null; // throw later
  }

  public Status next() {
    // 4 + 1
    return this.get(this.value + 1);
  }

  public static void main(String[] args) {
    System.out.println(Status.READY_TO_SHIP.next());
    System.out.println(Status.PAID.next());
  }
}
