package shopcar;

import java.util.Scanner;

public class ShopCarTest {
    

   public static void(String[] args){
    Goods[] shopcar = new Goods[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("cmd");
    String cmd = sc.next();
    switch(cmd){
        case "add":
        addGoods(shopcar, sc);
        break;
        case "query":
        queryGoods(shopcar);
        break;
        case "upDate":
        upDateGoods(shopcar);
        break;
        case "pay":
        payGoods(shopcar);
        break;
        dafault:
        System.out.println("??????"); 
    }
   }
   public static void addGoods(Goods[] ShopCar, Scanner sc){
    System.out.println("intput id");
    int id = sc.nextInt();
    System.out.println("what do u want");
    String name = sc.next();
    System.out.println("how many u want");
    int buy = sc.nextInt();
    System.out.println("input $$");
    double price = sc.nextDouble();

    Goods g = new Goods();
    g.id = id;
    g.name = name;
    g.buy = buy;
    g.price = price;

    for(int i = 0; i < shopcar.length; i++){
        if(shopcar[i] == null){
            shopcar[i] = g;
            break;
        }
    }System.out.println("your item:" + g.name + "added to shopcar");

   }
   public static void queryGoods(Goods[] ShopCar){

   }
   public static void upDateGoods(Goods[] ShopCar){

   }
   public static void payGoods(Goods[] ShopCar){

   }
}
