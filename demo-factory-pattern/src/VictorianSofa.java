public class VictorianSofa extends Sofa {
    private int price = readFromDB();

    public int readFromDB() {
        return 800; // Database logic
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    // public VictorianSofa(int price, int quantity) {
    // super(price, quantity);
    // }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian Sofa sitOn() ...");
    }
}