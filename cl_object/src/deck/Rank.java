package cl_object.src.deck;

public abstract class Rank {

  private int value;

  public Rank(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // abstract int compareTo(Rank rank);
  public int compareTo(Rank rank) {
    if (this.value == rank.getValue())
      return 0;
    return this.value > rank.getValue() ? 1 : -1;
  }
}
