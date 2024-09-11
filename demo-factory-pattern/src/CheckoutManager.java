import java.util.List;

public class CheckoutManager {

    public int totalAmount(List<Furniture> furnitures) {
        int total = 0;
        for (Furniture furniture : furnitures) {
            total += furniture.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Style style = Style.MODERN;
        // !!!! open-close coding style
        FurnitureFactory factory = FurnitureFactory.of(style);
        Furniture furniture = factory.create(Type.CHAIR);

        Inventory inventory = new Inventory();
        inventory.add(Style.MODERN, Type.CHAIR);
        inventory.add(Style.VICTORIAN, Type.CHAIR);
        inventory.add(Style.VICTORIAN, Type.SOFA);
        inventory.add(Style.VICTORIAN, Type.SOFA);
        inventory.add(Style.MODERN, Type.SOFA);
        System.out.println(inventory.getQuantity(Type.SOFA)); // 3
        System.out.println(inventory.getQuantity(Type.CHAIR)); // 2

        // !!! open-close
        CheckoutManager checkoutManager = new CheckoutManager();
        System.out.println(checkoutManager.totalAmount(inventory.getFurnitures())); // 2778
    }
}