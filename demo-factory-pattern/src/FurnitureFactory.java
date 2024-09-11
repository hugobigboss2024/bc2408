public interface FurnitureFactory {
    // Chair createChair();

    // Sofa createSofa();

    Furniture create(Type type);

    // after Java 8
    static FurnitureFactory of(Style style) {
        switch (style) {
            case MODERN:
                return new ModernFurnitureFactory();
            case VICTORIAN:
                return new VictorianFurnitureFactory();
        }
        throw new RuntimeException("Factory Not Found.");
    }

}