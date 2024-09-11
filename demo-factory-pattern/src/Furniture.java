public abstract class Furniture {
    private int price;

    public int getPrice() {
        return this.price;
    }

    public boolean isTypeOf(Type type) {
        switch (type) {
            case CHAIR:
                return this instanceof Chair;
            case SOFA:
                return this instanceof Sofa;
        }
        throw new RuntimeException("Type Not Found.");
    }

    abstract boolean hasLegs();

    abstract void sitOn();
}