package deck;

public class BigTwoRank extends Rank {

    public static final BigTwoRank[] rankArray = new BigTwoRank[] {
      BigTwoRank.of(12), BigTwoRank.of(13), BigTwoRank.of(1), BigTwoRank.of(2),
      BigTwoRank.of(3), BigTwoRank.of(4), BigTwoRank.of(5), BigTwoRank.of(6),
      BigTwoRank.of(7), BigTwoRank.of(8), BigTwoRank.of(9), BigTwoRank.of(10),
      BigTwoRank.of(11)};
  
    public static final int ACE = 12;
    public static final int TWO = 13;
    public static final int THREE = 1;
    public static final int FOUR = 2;
    public static final int FIVE = 3;
    public static final int SIX = 4;
    public static final int SEVEN = 5;
    public static final int EIGHT = 6;
    public static final int NINE = 7;
    public static final int TEN = 8;
    public static final int JACK = 9;
    public static final int QUEEN = 10;
    public static final int KING = 11;
  
    private BigTwoRank(int value) {
      super(value);
    }
  
    private static BigTwoRank of(int value) {
      return new BigTwoRank(value);
    }
  
    public static BigTwoRank ofTWO() {
      return new BigTwoRank(13);
    }
  
    public static BigTwoRank ofACE() {
      return new BigTwoRank(12);
    }
  
    public static void main(String[] args) {
      Rank two = BigTwoRank.ofTWO();
      Rank ace = BigTwoRank.ofACE();
      System.out.println(two.compareTo(ace)); // 1
  
      Rank two2 = PokerRank.ofTWO();
      Rank ace2 = PokerRank.ofACE();
      System.out.println(two2.compareTo(ace2)); // -1
    }
  
    // @Override
    // public int compareTo(Rank rank) {
    //   if (!(rank instanceof BigTwoRank))
    //     return -1;
    //   BigTwoRank bigTwoRank = (BigTwoRank) rank;
    //   if (super.getValue() == bigTwoRank.getValue())
    //     return 0;
    //   return super.getValue() > bigTwoRank.getValue() ? 1 : -1;
    // }
  }