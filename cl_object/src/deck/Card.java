package cl_object.src.deck;

public class Card {
 // !!! Make you know the difference between instance variable, static
  // variable, static final variable
//！讓你知道實例變數、靜態變數的差別
 // 變數，靜態最終變數
  // String -> good presentation, built-in(內建) equals() & compareTo()
  // "01", "02", "09, "10", "JACK", "QUEEN", "KING"
  private Rank rank; // 1, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K
  private Suit2 suit; // DIAMOND, CLUB, HEART, SPADE

  public Card(Rank rank, Suit2 suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public static Card of(Rank rank, Suit2 suit) {
    return new Card(rank, suit);
  }

  // getters
  public Rank getRank() {
    return this.rank;
  }

  public Suit2 getSuit() {
    return this.suit;
  }

  public boolean equals(Card card) {
    return this.rank.equals(card.getRank()) //
        && this.suit == card.getSuit();
  }

  // instance method
  // c1.compareTo(c2)
  // this -> c1
  // card -> c2
  public int compareTo(Card card) {
    // fixed rules固定規則
    // this (address) vs card (address)
    int rankResult = this.rank.compareTo(card.getRank()); // Run-time Polymorphism多態性
    if (rankResult == 0) {
      if (this.suit.compare(card.getSuit()) == 0) { // !!! should use compare()
        return 0;
      } else if (this.suit.compare(card.getSuit()) > 0) { // !!! should use compare()
        return 1;
      }
      return -1; // base case
    }
    return rankResult;
  }

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ", suit=" + this.suit //
        + ")";
  }

  public static void main(String[] args) {
    // valueOf(''),
    Card c1 = new Card(PokerRank.ofACE(), Suit2.DIAMOND);
    Card c2 = new Card(PokerRank.ofACE(), Suit2.CLUB);
    Card c3 = new Card(PokerRank.ofJACK(), Suit2.DIAMOND);
    Card c4 = new Card(PokerRank.ofJACK(), Suit2.DIAMOND);

    System.out.println(c2.compareTo(c1)); // 1
    System.out.println(c1.compareTo(c2)); // -1
    System.out.println(c1.compareTo(c3)); // 1
    System.out.println(c4.compareTo(c3)); // 0

    ComparisonUtil.compareTwoCard(c1, c2); // 1
    ComparisonUtil.compareTwoCard(c2, c1); // -1
    ComparisonUtil.compareTwoCard(c1, c3); // 0

    // Card.CLUB = 10; // final variable cannot be modified不能被修改
  }
  }
  
  

  

