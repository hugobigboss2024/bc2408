package cl_object.src.deck;

public enum Rank2 {
   // private static final Suit2[] suits = new Suit2[] {Suit2.CLUB, Suit2.HEART, Suit2.DIAMOND, Suit2.SPADE};
  // create enum objects
  // DIAMOND, // call empty constructor
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADE(4), //
  ;

  // Class Section
  private static final int x = 0;

  // values()
  private static final Suit2[] suits = new Suit2[] {Suit2.CLUB, Suit2.HEART, Suit2.DIAMOND, Suit2.SPADE};

  private final int value;

  private Suit2(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // public void setValue(int value) {
  // this.value = value;
  // }

  // custom definition
  public int compare(Suit2 suit) {
    if (this == suit)
      return 0;
    return this.value > suit.getValue() ? 1 : -1;
  }

  public static int length() {
    return Suit2.values().length;
  }

  // values() method is implicitly created by JAVA when the class is enum
  public static Suit2 get(int value) {
    for (Suit2 suit : Suit2.values()) { // values() return Suit2[] object
      if (suit.getValue() == value)
        return suit;
    }
    return null; // we use Exception here later ...
  }

  public static void main(String[] args) {
    // Load classes to Memory
    // enum -> create objects for enum
    // static/ static final
    // start to read your code in main method

    System.out.println(Suit2.HEART.compare(Suit2.HEART));

    // enum.class compareTo() by default checking address
    System.out.println(Suit2.HEART.compareTo(Suit2.HEART)); // 0
    System.out.println(Suit2.CLUB.compareTo(Suit2.HEART)); // 1
    System.out.println(Suit2.SPADE.compareTo(Suit2.HEART)); // 2

    // equals() -> result OK
    Suit2 unknown = Suit2.HEART;
    System.out.println(unknown.equals(Suit2.HEART)); // true
    System.out.println(unknown == Suit2.HEART); // true
    System.out.println(unknown != Suit2.HEART); // false

    // Suit2.CLUB.setValue(3);
    System.out.println(Suit2.CLUB.getValue()); // 2

    System.out.println(Suit2.get(3)); // HEART

    // name()
    System.out.println(Suit2.DIAMOND.name()); // "DIAMOND"
    System.out.println(Suit2.DIAMOND.toString()); // "DIAMOND"

    // ordinal() -> ordering (start from 0)
    System.out.println(Suit2.CLUB.ordinal()); // 0
    System.out.println(Suit2.HEART.ordinal()); // 3

  }

}
