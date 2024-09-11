public class VictorianChair extends Chair {
    private int price = readFromDB();

    public int readFromDB() {
        return 80; // Database logic
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    // public VictorianChair(int price, int quantity) {
    // super(price, quantity);
    // }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian Chair sitOn() ...");
    }
}