

// Singly LinkedList
// Double LinkedList (Java)
public class CustomerLinkedList {
    private Node head;
    private Node tail; // fast-track (optional)
  
    public CustomerLinkedList() {
      Node dummy = new Node(null);
      this.head = dummy;
      this.tail = dummy;
    }
  
    public boolean add(Customer customer) {
      return addLast(customer);
    }
  
    public boolean addLast(Customer customer) {
      this.tail.setCustomer(customer); // OK
      Node newTail = new Node(null);
      this.tail.setNext(newTail);
      this.tail = newTail;
      return true; // tbc.
    }
  
    public boolean addFirst(Customer customer) {
      Node newHead = new Node(customer);
      newHead.setNext(this.head); // Jenny -> John
      this.head = newHead; // head -> Jenny
      return true;
    }
  
    public int size() {
      // while loop (tail)
      return -1;
    }
  
    // leetcode
    public void reverse() {
      // while loop
      // ArrayList<Customer>
      // reverse
    }
  
    @Override
    public String toString() {
      Node head = this.head;
      StringBuilder sb = new StringBuilder("Customers[");
      while (head != null) {
        sb.append(head.getCustomer());
        head = head.getNext();
        sb.append(",");
      }
      return sb.deleteCharAt(sb.length() - 1).append("]").toString();
    }
  
    public static void main(String[] args) {
      CustomerLinkedList customerLinkedList = new CustomerLinkedList();
      customerLinkedList.add(new Customer("John", 10));
      customerLinkedList.add(new Customer("Peter", 20));
      System.out.println(customerLinkedList); 
      // Customers[Customer(name=John, age=10),Customer(name=Peter, age=20),null]
  
      customerLinkedList.addFirst(new Customer("Jenny", 25));
      System.out.println(customerLinkedList);
      // Customers[Customer(name=Jenny, age=25),Customer(name=John, age=10),Customer(name=Peter, age=20),null]
    }
  }