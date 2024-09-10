import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "John");
        stringMap.put("B", "Benny");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {

        }
    }
}