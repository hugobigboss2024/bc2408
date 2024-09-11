public class ModernSofa extends Sofa {
    private int price = readFromDB();

    public int readFromDB() {
        return 999; // Database logic
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    // public ModernSofa(int price, int quantity) {
    // this.price = price;
    // this.quantity = quantity;
    // }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Modern Sofa sitOn() ...");
    }
}