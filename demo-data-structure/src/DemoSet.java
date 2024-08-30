
public class DemoSet {
    public static void main(String[] args) {
        // Collection.class -> Basic operation of collection
        Collection<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("xyz");
        System.out.println(strings); // [abc, xyz]
    
        // 
        strings = new HashSet<>();
        strings.add("ijk");
        strings.remove(new String("ijk")); // HashSet equals()
        System.out.println(strings.size()); // 0
    
        // Why do we need HashSet?
        strings.add("xyz");
        boolean isAdded = strings.add(new String("xyz"));
        System.out.println(isAdded); // false, HashSet avoid duplicated value
        System.out.println(strings.size()); // 1
        strings.add("xyz2");
        System.out.println(strings.size()); // 2
    
        strings.clear(); // after clear, it is still HashSet object
        // if you want to have duplicated values -> ArrayList object
        strings = new ArrayList<>();
        strings.add("abc");
        strings.add("abc");
        System.out.println(strings.size()); // 2
      }
}
