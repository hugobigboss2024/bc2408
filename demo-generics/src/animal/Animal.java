package animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    // !!!!! ensure every T object has run instance method.
    public static <T extends Animal & Runable> Animal run100m(List<T> animals) {
        for (T animal : animals) {
            animal.run();
        }
        return null;
    }

    public static void main(String[] args) {
        List<SmallCat> smallCats = new ArrayList<>();
        smallCats.add(new SmallCat());
        run100m(smallCats);
    }
}