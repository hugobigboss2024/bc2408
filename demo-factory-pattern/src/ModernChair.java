public class ModernChair extends Chair {
    private int price = readFromDB();

    public int readFromDB() {
        return 99; // Database logic
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Modern Chair sitOn() ...");
    }
}