package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import sorting.formula.BoxSorts;


public class DemoComparable {
  public static void main(String[] args) {
    int[] arr = new int[] {5, 10, 2};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[] {5, -2, 10, 100, -100};
    Arrays.sort(arr2, 1, arr2.length);
    System.out.println(Arrays.toString(arr2)); // [5, -100, -2, 10, 100]

    // how about reverse order? 
    List<Box> boxes = new ArrayList<>();
    boxes.add(new Box(3));
    boxes.add(new Box(-7));
    boxes.add(new Box(100));
    boxes.add(new Box(90));

    Collections.sort(boxes); // sort() -> call your box object's compareTo() method
    // similar to ArrayList remove() -> your object's equals()
    System.out.println(boxes); // [Box(value=100), Box(value=90), Box(value=3), Box(value=-7)]

    // Comparator<Box>
    System.out.println("Compartor<Box>:");
    Collections.sort(boxes, BoxSorts.ofAsc()); // ascending
    System.out.println(boxes); // [Box(value=-7), Box(value=3), Box(value=90), Box(value=100)]
    Collections.sort(boxes, BoxSorts.ofDesc()); // descending
    System.out.println(boxes); // [Box(value=100), Box(value=90), Box(value=3), Box(value=-7)]

    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.GREEN));
    Collections.sort(balls);
    System.out.println(balls);


  }
}