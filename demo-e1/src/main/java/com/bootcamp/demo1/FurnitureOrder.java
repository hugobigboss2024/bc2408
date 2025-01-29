package com.bootcamp.demo1;

import java.util.HashMap;

import lombok.Data;

@Data
public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> ordersOfFurnitures;

    public FurnitureOrder(HashMap<Furniture, Integer> ordersOfFurnitures) {
        this.ordersOfFurnitures = ordersOfFurnitures;
    }

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    public FurnitureOrder() {
        // TODO: Complete the constructor
        ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        ordersOfFurnitures.put(type, ordersOfFurnitures.getOrDefault(type, 0) + furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalCost = 0.0f;
        for (HashMap.Entry<Furniture, Integer> entry : ordersOfFurnitures.entrySet()) {
            Furniture furniture = entry.getKey();
            int quantity = entry.getValue();
            totalCost += furniture.cost() * quantity; // 計算總成本
        }
        return totalCost; // 返回總成本
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return ordersOfFurnitures.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return getTypeCount(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalQuantity = 0;
        for (int quantity : ordersOfFurnitures.values()) {
            totalQuantity += quantity; // 計算總數量
        }
        return totalQuantity; // 返回總數量
    }

    public HashMap<Furniture, Integer> getOrdersOfFurnitures() {
        return ordersOfFurnitures;
    }

    public void setOrdersOfFurnitures(HashMap<Furniture, Integer> ordersOfFurnitures) {
        this.ordersOfFurnitures = ordersOfFurnitures;
    }

}
