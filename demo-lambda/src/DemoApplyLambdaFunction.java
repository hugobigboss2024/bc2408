import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DemoApplyLambdaFunction {

    public static void main(String[] args) {
        // for-each
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("ghi");
        // old java
        for (String s : strings) {
            System.out.println(s);
        }
        // foreach
        // java 8 updated new one for-each
        // !!! List.forEach jave9 -> Consumer.class
        strings.forEach(s -> System.out.println(s));
        List<Customer> customers = Arrays.asList(new Customer(19), new Customer(30));
        // filter customer whose age > 20, and print his age.
        customers.forEach(c -> {
            if (c.getAge() > 20)
                System.out.println(c.getAge());
        });

        Map<String, Integer> nameMAp = new HashMap<>();
        nameMAp.put("John", 19);
        nameMAp.put("Peter", 30);
        nameMAp.computeIfAbsent("betty", s -> 3);

        System.out.println(nameMAp.get("betty"));// 3
        nameMAp.computeIfAbsent("betty", s -> 3);
        System.out.println(nameMAp.get("betty"));// 3

        nameMAp.merge("peter", 10, (x1, x2) -> x1 * x2);// byFunction is?(original,multipler)
        System.out.println(nameMAp.get("peter"));

        nameMAp.merge("Vincent", 10, (original, multipler) -> original + multipler);
        System.out.println(nameMAp.get("Vincent"));

        nameMAp.put("oscar", null);

        // ALL antry`value * 2, if the value is not null, otherwise, remove the entry
        // !!! in for loop cant do add or remove !!!
        for (String key : nameMAp.keySet()) {
            nameMAp.merge(key, 2, (x1, x2) -> {// if not forloop key = "oscar"??
                if (x1 < 0)
                    return null;
                return x1 * x2;
            });
        }
        System.out.println(nameMAp);

        nameMAp.merge("Vincent", 10, (x1, x2) -> {// removed !!!
            if (x1 + x2 > 25)
                return null;
            return x1 * x2;
        });
        System.out.println(nameMAp.get("Vincent"));
    }
}
