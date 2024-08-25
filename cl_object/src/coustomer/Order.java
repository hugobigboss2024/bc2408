package cl_object.src.coustomer;

public class Order {
  private Item[] item;
  //
  public Order(Item[] items){
    this.item = item;
  }
  public Item[] getItem(){
    return this.item;
  }
  public Order(){
    this.item = new Item[0];
  }
  public void add(Item item){
   Item[] newItem= new Item[this.item.length + 1];
   for(int i = 0; i < this.item.length; i++){
    newItem[i]=
   }
  }
}
