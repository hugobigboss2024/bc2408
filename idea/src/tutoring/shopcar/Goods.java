package shopcar;

public class Goods {
    private int id;
    private String name;
    private double price;
    private int buy;

    public Goods(){

    }

    public Goods(int id, String name, double price, int buy){
        this.id = id;
        this.name = name;
        this.price = price;
        this.buy = buy;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getBuy(){
        return this.buy;
    }
    
}
