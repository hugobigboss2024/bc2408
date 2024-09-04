import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // Map consists of entries
    // An entry consists of a key and a value
    Map<Integer, String> map = new HashMap<>();
    map.put(10, "Vincent");
    map.put(-20, "Jenny");
    // map.put(9, 10); // Wrong type of value object
    System.out.println(map.size()); // 2 entries

    System.out.println(map.get(-20)); // Jenny, Get Value Object
    System.out.println(map.get(-200)); // null

    // For-each
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out
          .println("key=" + entry.getKey() + ", value=" + entry.getValue());
    }

    // Person.class
    Map<String, Person> personMap = new HashMap<>();
    // Key=Person's Name, Value= Person object.
    Person john = new Person("John", 30);
    Person peter = new Person("Peter", 15);
    // put
    personMap.put(john.getName(), john);
    personMap.put(peter.getName(), peter);
    // size
    System.out.println(personMap.size());
    // get
    System.out.println(personMap.get("Peter"));
    // for -> print all person data
    // Map -> Entry<String, Person> -> Person -> Name, Age
    // Sum of the age of all persons
    int sum = 0;
    for (Map.Entry<String, Person> entry : personMap.entrySet()) {
      sum += entry.getValue().getAge();
    }
    System.out.println(sum);

    // put() -> overwrite when the key exists
    // If key exists, overwrite value (Jenny replaced by Oscar)
    // It is still the original entry
    map.put(-20, "Oscar");
    System.out.println(map.size()); // 2
    System.out.println(map); // toString() -> {-20=Oscar, 10=Vincent}

    System.out.println(map.containsKey(-20)); // true
    System.out.println(map.containsKey(-200)); // false
    System.out.println(map.containsValue("Oscar")); // true
    System.out.println(map.containsValue("Jenny")); // false

    String removedString = map.remove(-20); // remove the entry
    System.out.println(removedString); // Oscar
    System.out.println(map.size()); // 1

    if (map.remove(10, "Vincent")) {
      System.out.println("Entry is removed.");
    }

    // Loop all keys (keySet())
    for (String key : personMap.keySet()) {
      System.out.println(key);
    }

    // Loop all values (values())
    sum = 0;
    for (Person value : personMap.values()) {
      System.out.println(value.getName() + ", " + value.getAge());
      sum += value.getAge();
    }
    System.out.println("Sum of all Person's age=" + sum);

    // entrySet(), keySet(), values() -> For Loop

    System.out.println(personMap.size()); // 2
    personMap.clear();
    System.out.println(personMap.size()); // 0

    // HashMap vs List (ArrayList, LinkedList)
    // 1. HashMap has no ordering
    // 2. HashMap get value by key (any type), List get value by index (int)
    // 3. Map's Key cannot be duplicated, List may contain duplicated value

    // !!! How to identify the key is duplicated?
    Map<HKID, Person> citizenMap = new HashMap<>();
    citizenMap.put(new HKID("1234"), john);
    citizenMap.put(new HKID("1235"), peter);

    System.out.println(citizenMap.get(new HKID("1234"))); // Person(name=John, age=30)

    // put(new HKID("1234"), vincent)
    citizenMap.put(new HKID("1234"), new Person("Vincent", 10));
    // size
    System.out.println(citizenMap.size()); // 2

    // The implementation of put() method -> object's equals() & hashCode()

    // Object.class -> new HKID("1234") != new HKID("1234")
    // HKID.class -> After Override, new HKID("1234") == new HKID("1234")


  }
}