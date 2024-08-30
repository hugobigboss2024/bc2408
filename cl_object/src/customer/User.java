package cl_object.src.customer;

import java.math.BigDecimal;

public class User {
  private Order[] orders; // Order[] object

  public User() {
    this.orders = new Order[0];
  }

  // public User(Order[] orders) {
  // this.orders = orders;
  // }

  public void add(Order order) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = order;
    this.orders = orders;
  }

  public void signUp() {

  }

  public void login() {

  }

  

  public Order[] getOrders() {
    return this.orders;
  }

  public boolean isVIP() {
    return this.totalTransactionAmount() >= 100000;
  }

  // Unit Test
  public double totalTransactionAmount() {//總交易金額
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (int i = 0; i < orders.length; i++) {
      total = total.add(BigDecimal.valueOf(this.orders[i].totalValue())); //
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    User john = new User(); // User -> Order Array -> Order

    john.totalTransactionAmount();

    if (john.isVIP()) {

    }

  }
}
