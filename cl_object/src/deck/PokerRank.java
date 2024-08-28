package cl_object.src.deck;

public class PokerRank extends Rank {
    public static final PokerRank[] rankArray =
    new PokerRank[] {PokerRank.of(12), PokerRank.of(13), PokerRank.of(1),
        PokerRank.of(2), PokerRank.of(3), PokerRank.of(4), PokerRank.of(5),
        PokerRank.of(6), PokerRank.of(7), PokerRank.of(8), PokerRank.of(9),
        PokerRank.of(10), PokerRank.of(11)};

  public static final int ACE = 13;
  public static final int TWO = 1;
  public static final int THREE = 2;
  public static final int FOUR = 3;
  public static final int FIVE = 4;
  public static final int SIX = 5;
  public static final int SEVEN = 6;
  public static final int EIGHT = 7;
  public static final int NINE = 8;
  public static final int TEN = 9;
  public static final int JACK = 10;
  public static final int QUEEN = 11;
  public static final int KING = 12;

  private PokerRank(int value) {
    super(value);
  }

  private static PokerRank of(int value) {
    return new PokerRank(value);
  }

  public static PokerRank ofACE() {
    return new PokerRank(13);
  }

  public static PokerRank ofTWO() {
    return new PokerRank(1);
  }

  public static PokerRank ofJACK() {
    return new PokerRank(10);
  }

  public static PokerRank ofKING() {
    return new PokerRank(12);
  }
}
