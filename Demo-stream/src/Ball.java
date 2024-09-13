import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Ball {
    private Color color;
    private int value;

    public Ball(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Ball(" //
                + "color=" + this.color //
                + ", value" + this.value //
                + ")";
    }

    public static enum Color {
        RED, GREEN, BLUE,;
    }

    public static void main(String[] args) {
        List<Ball> balls = List.of(new Ball(Color.RED, 3), new Ball(Color.BLUE, 3),
                new Ball(Color.RED, 10), new Ball(Color.GREEN, 100),
                new Ball(Color.BLUE, 1000));

        Map<Color, List<Ball>> ballMap = balls.stream() //
                .collect(Collectors.groupingBy(e -> e.getColor()));

        System.out.println(ballMap.size()); // 3

        System.out.println(ballMap.get(Color.RED));
        // [Ball(color=RED, value3), Ball(color=RED, value10)]

        // Sum
        Map<Color, Integer> valueMap = balls.stream() //
                .collect(Collectors.groupingBy(e -> e.getColor(),
                        Collectors.summingInt(e -> e.getValue())));
        System.out.println(valueMap.get(Color.BLUE)); // 1003

        // Average
        Map<Color, Double> valueMap2 = balls.stream() //
                .collect(Collectors.groupingBy(e -> e.getColor(),
                        Collectors.averagingInt(e -> e.getValue())));
        System.out.println(valueMap2.get(Color.RED)); // 6.5 (13 / 2)

        // BLUE -> max value (1000)
        OptionalInt optint = balls.stream() //
                .filter(e -> e.getColor() == Color.BLUE) //
                // .map(e -> e.getValue()) //
                .mapToInt(e -> e.getValue()) //
                .max(); // !!! return OptionalInt, because balls may be size 0

        if (optint.isPresent()) {
            System.out.println(optint.getAsInt()); // 1000
        } else {
            System.out.println("No balls. No Max Value.");
        }

        // !!! maxBy() - Find the ball with max value for a given color
        Map<Color, Optional<Ball>> valueMap3 = balls.stream() //
                .collect(Collectors.groupingBy(e -> e.getColor(),
                        Collectors.maxBy(Comparator.comparingInt(e -> e.getValue()))));
        System.out.println(valueMap3.get(Color.BLUE)); // Ball[BLUE, 1000]

        // Partition By (separated all elements into 2 groups)
        Map<Boolean, List<Ball>> ballValueMap = balls.stream() //
                .collect(Collectors.partitioningBy(b -> b.getValue() > 500));

        System.out.println(ballValueMap);
        // {false=[Ball(color=RED, value3), Ball(color=BLUE, value3),
        // Ball(color=RED, value10), Ball(color=GREEN, value100)],
        // true=[Ball(color=BLUE, value1000)]}

    }
}