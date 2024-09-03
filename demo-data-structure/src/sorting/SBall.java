package sorting;

public class SBall {
    private Color color;
    private String name;
  
    public SBall(Color color, String name) {
      this.color = color;
      this.name = name;
    }
    // getter ..
  
    // sorting
    // 1. YELLOW -> GREEN -> RED
    // 2. If same color, name descending order.
  
    // After sorting:
    // i.e. SBall(Yellow, "John") -> SBall(Yellow, "Benny") -> SBall(Green, "Susan")
    // -> SBall(RED, "Vincent") -> SBall(RED, "Alex")
  }
    

