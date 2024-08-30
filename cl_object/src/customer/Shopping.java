package cl_object.src.customer;

public class Shopping {
  // Testing
  public static void main(String args[]) {
    // Create User
    // Create Orders
    // Create items
    Item apple = new Item(10.99, 4);
    Item orange = new Item(11.9, 2);

    Order order = new Order();
    order.add(apple);
    order.add(orange);

    User user = new User();
    user.add(order);

    System.out.println(user.totalTransactionAmount()); // 67.76

    Item orange2 = new Item(12.5, 1);
    Item apple2 = new Item(10.99, 2);

    Order order2 = new Order();
    order2.add(orange2);
    order2.add(apple2);
    order2.remove(0); // 已刪除removed 1st item

    user.add(order2);
    System.out.println(user.totalTransactionAmount()); // 67.76 + 10.99 * 2 = 89.74

  }
}
