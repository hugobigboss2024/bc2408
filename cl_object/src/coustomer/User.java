package cl_object.src.coustomer;

import java.math.BigDecimal;

public class User {
  public Order[] orders;

  public User() {
    this.orders = new Order[0];
  }
  public User(Order[] orders) {
    this.orders = orders;
  }
  public Order[] getOrders(){
    return this.orders;
  }
  public double  totalTransactionAmount(){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (int i = 0; i < orders.length; i++) {
        total = total.add(BigDecimal.valueOf(this.ordwes[i].totalValue()));
    }return total.doubleValue();
  }
  public static void main(String[] args) {
      User user = new User();
  }
}
