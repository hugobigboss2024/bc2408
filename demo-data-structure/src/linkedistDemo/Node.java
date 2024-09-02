// Similar to Box
// List<Customer> = new LinkedList<Customer>();
// Customer.class -> name, age
public class Node {
    private Node next;
    private Customer customer;
  
    public Node(Customer customer) {
      this.customer = customer;
    }
  
    public Node(Customer customer, Node next) {
      this.customer = customer;
      this.next = next;
    }
  
    public Node getNext() {
      return this.next;
    }
  
    public Customer getCustomer() {
      return this.customer;
    }
  
    public void setCustomer(Customer customer) {
      this.customer = customer;
    }
  
    public void setNext(Node next) {
      this.next = next;
    }
  
    @Override
    public String toString() {
      Node head = this;
      StringBuilder sb = new StringBuilder("Customers[");
      while (head != null) {
        sb.append(head.getCustomer());
        head = head.next;
        sb.append(",");
      }
      return sb.deleteCharAt(sb.length() - 1).append("]").toString();
    }
  
    public static void main(String[] args) {
      Node head = null;
      System.out.println(head); 
      head = new Node(new Customer("John", 10)); 
      System.out.println(head); // Customers[Customer(name=John, age=10)]
    }
  }