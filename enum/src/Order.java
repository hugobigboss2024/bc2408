public class Order {
  private Item[] items;
  private Status status; // PAID, READY_TO_SHIP, SHIPPING, DELIVERED
  // ...

  // constructor
  public Order() {
    this.items = new Item[0];
  }

  // Bad design, this constructor is just for testing.
  public Order(Item[] items) {
    this.items = items;
  }

  public void add(Item item) {
    // ....
    // new array, size + 1
  }

  public Item[] getItems() {
    return this.items;
  }

  public void nextStatus() {
    this.status = this.status.next();
  }

  public Status getStatus() {
    return this.status;
  }
 
  public void setStatus(Status status) {
    this.status = status;
  }

  // check if Order is PAID
  public boolean isPaid() {
    return this.status == Status.PAID;
  }

  public boolean isReadyToShip() {
    return this.status == Status.READY_TO_SHIP;
  }
  
  // testing
  public static void main(String[] args) {
    Order order = new Order(new Item[] {new Item(), new Item()});
    order.setStatus(Status.PAID); // validation

    System.out.println(order.getStatus()); // PAID

    boolean isAllItemsAvailable = true;
    for (Item item : order.getItems()) {
      if (!new InventoryManager().isStockAvailable(item)) {
        isAllItemsAvailable = false;
        break;
      }
    }
    // status = PAID, all items available
    boolean isDeliveryResourceReady = false;
    if (order.isPaid() && isAllItemsAvailable) {
      order.nextStatus(); // void (PAID -> READY_TO_SHIP)
    } else if (order.isReadyToShip() && isDeliveryResourceReady) {
      // change status
      order.nextStatus();
      // send sms
    }
    

    System.out.println(order.getStatus()); // READY_TO_SHIP

  }
}
