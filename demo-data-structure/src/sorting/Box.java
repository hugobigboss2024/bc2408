

// !!! Compile Time
// 1. "implements Interface" implies the object of this class must contain
// compareTo() method at compile time
// 2. The method/object has to ensure the object contains compareTo() at compile time.
public class Box implements Comparable<Box> {
  private int value;

  public Box(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // Comparable
  // Disadvantages:
  // !!! 1. You cannot define 2 sorting formula at the same time.
  // 2. The compareTo formula is for Box.class use only.
  @Override
  public int compareTo(Box box) {
    // this (-1) vs box (1)
    return box.getValue() > this.value ? 1 : -1; // Descending order
  }

  @Override
  public String toString() {
    return "Box(" //
        + "value=" + this.value //
        + ")";
  }

}