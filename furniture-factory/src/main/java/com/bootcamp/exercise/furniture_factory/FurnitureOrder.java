package com.bootcamp.exercise.furniture_factory;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * aTODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> ordersOfFurnitures;

    /*
     * public FurnitureOrder(HashMap<Furniture, Integer> ordersOfFurnitures) {
     * this.ordersOfFurnitures = ordersOfFurnitures;
     * }
     */

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    public FurnitureOrder() {
        // aTODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // aTODO: Complete the method
        // ordersOfFurnitures.put(type, ordersOfFurnitures.getOrDefault(type, 0) +
        // furnitureCount);
        Integer count = this.ordersOfFurnitures.get(type);
        if (this.ordersOfFurnitures.get(type) == null) {
            this.ordersOfFurnitures.put(type, furnitureCount);
        } else {
            this.ordersOfFurnitures.put(type, this.ordersOfFurnitures.get(type) + furnitureCount);
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // aTODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // aTODO: Complete the method
        float totalCost = 0.0f;
        for (HashMap.Entry<Furniture, Integer> entry : ordersOfFurnitures.entrySet()) {
            Furniture furniture = entry.getKey();
            int quantity = entry.getValue();
            totalCost += furniture.cost() * quantity; // 計算總成本
        }
        return totalCost; // 返回總成本
    }

    public int getTypeCount(Furniture type) {
        // aTODO: Complete the method
        return this.ordersOfFurnitures.getOrDefault(type, 0);

    }

    public float getTypeCost(Furniture type) {
        // aTODO: Complete the method
        // return this.getTypeCount(type) * type.cost();
        // return (float)this.ordersOfFurnitures.entrySet().stream().mapToDouble(e ->
        // e.getValue().intValue() * e.getKey().cost()).sum();
        float total = 0;
        for (Map.Entry<Furniture, Integer> e : this.ordersOfFurnitures.entrySet()) {
            total += e.getValue().intValue() * e.getKey().cost();
            return total;
        }
        return total;
    }

    public int getTotalOrderQuantity() {
        // aTODO: Complete the method
        /*
         * int totalQuantity = 0;
         * for (int quantity : ordersOfFurnitures.values()) {
         * totalQuantity += quantity; // 計算總數量
         * }
         * return totalQuantity; // 返回總數量
         */
        return this.ordersOfFurnitures.values().stream().mapToInt(count -> count.intValue()).sum();
    }

    public HashMap<Furniture, Integer> getOrdersOfFurnitures() {
        return ordersOfFurnitures;
    }

    public void setOrdersOfFurnitures(HashMap<Furniture, Integer> ordersOfFurnitures) {
        this.ordersOfFurnitures = ordersOfFurnitures;
    }

}