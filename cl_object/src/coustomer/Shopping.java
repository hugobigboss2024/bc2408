package cl_object.src.coustomer;

public class Shopping {
  public static void main(String[] args) {
      //creat user,order,items
      Item apple = new Item(10.99, 4);
      Item orange = new Item(11.9, 2);
      Item[] items = new Item[] {apple, orange};
      Order order = new Order(items);

      ////////////
      Order order3 = new Order();
      order3.add(apple);

      order3.add(orange);
      ////////////
      
      Item apple2 = new Item(10.99, 4);
      Item orange2 = new Item(11.9, 2);
      Item[] items2 = new Item[] {apple2, orange2};
      Order order2 = new Order(items);

      User user = new User(new ORder[] {order, order2});

  }
}
