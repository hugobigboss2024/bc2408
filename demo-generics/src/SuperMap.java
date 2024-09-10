// !!! Type K can be same as Type V

import java.util.ArrayList;
import java.util.List;

public class SuperMap<K, V> {
    private List<SuperEntry<K, V>> entries;

    public SuperMap() {
        this.entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        // if not duplicate
        SuperEntry<K, V> entry = this.getEntry(key);
        if (entry == null) {
            this.entries.add(new SuperEntry<>(key, value));
            return;
        }
        // if duplicated
        entry.setValue(value);
    }

    public V get(K key) {
        SuperEntry<K, V> entry = this.getEntry(key);
        return entry == null ? null : entry.getValue();
    }

    public int size() {
        return this.entries.size();
    }

    // Get Entry by key
    private SuperEntry<K, V> getEntry(K key) {
        // if not found, return null
        if (key == null)
            return null;
        for (SuperEntry<K, V> entry : this.entries) {
            if (key.equals(entry.getKey()))
                return entry;
        }
        return null;
    }

    public static void main(String[] args) {
        SuperMap<String, String> nameMap = new SuperMap<>();
        nameMap.put("john", "apple");
        nameMap.put("vincent", "orange");
        System.out.println(nameMap.get("john")); // apple
        nameMap.put("john", "banana");
        System.out.println(nameMap.get("john")); // banana
        System.out.println(nameMap.size()); // 2

    }
}