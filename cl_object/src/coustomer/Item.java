package coustomer;

import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantit;
  private int day;


  //constructor
  //getter, Setter
public Item(double price, int quantit, int day){
  this.price = price;
  this.quantit = quantit;
  this.day = day;

}
public double getPrice(){
  return this.price;
}
public int getQuantit(){
  return this.quantit;
}
public int getDay(){
  return this.day;
}
public double itemTotal(){
  BigDecimal price = BigDecimal.valueOf(this.price);
  return price.multiply(this.quantity);
}
/*public void setPrice(double price){
  this.price = price;
}
public void setQuantit(int quantit){
  this.quantit = quantit;
}
public void setDay(int day){
  this.day = day;
} */

  
}
