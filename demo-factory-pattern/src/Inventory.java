import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Furniture> furnitures; // open-close

    public Inventory() {
        this.furnitures = new ArrayList<>();
    }

    public void add(Style style, Type type) {
        this.furnitures.add(FurnitureFactory.of(style).create(type));
    }

    public List<Furniture> getFurnitures() {
        return this.furnitures;
    }

    public int getQuantity(Type type) {
        int quantity = 0;
        for (Furniture furniture : this.furnitures) {
            if (furniture.isTypeOf(type)) {
                quantity++;
            }
        }
        return quantity;
    }

}