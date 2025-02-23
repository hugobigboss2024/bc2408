package com.bootcamp.demo1;

/**
 * FURNITURE_TYPE("Furniture Name", floating-point cost)
 */

public enum Furniture {
    CHAIR("Chair", 100.0f),
    TABLE("Table", 250.0f),
    COUCH("Couch", 500.0f);

    private final String label;
    private final float cost;

    /**
     * @param label The plain text name of the furniture
     * @param cost  The furniture's cost
     */
    private Furniture(String label, float cost) {
        this.label = label;
        this.cost = cost;
    }

    /**
     * @return The plain text name of the furniture
     */
    public String label() {
        return label; // 返回家具的名稱
    }

    /**
     * @return The furniture's cost
     */
    public float cost() {
        return cost; // 返回家具的成本
    }
}
