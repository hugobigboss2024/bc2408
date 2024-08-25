package cl_object.src.deck;

public class PairManager {
   // !!! final -> Card array object reference, but you can still change the card object
  // !!! unless you provide setter to revise the card object
  private final Card[] cards;

  public PairManager(Card card1, Card card2) {
    this.cards = new Card[] {card1, card2};
  }

  public boolean isPair() {
    // return cards[0].getRank().equals(cards[1].getRank());
    return true;
  }

  // public void setCard(Card card, int idx) {
  //   this.cards[idx] = card;
  // }

  public static void main(String[] args) {
    boolean result = new PairManager(new Card(Rank.ofACE(), Suit2.DIAMOND),
        new Card(Rank.ofACE(), Suit2.SPADE)).isPair();

    boolean result2 = new PairManager(new Card(Rank.ofACE(), Suit2.DIAMOND),
        new Card(Rank.ofKING(), Suit2.DIAMOND)).isPair();
    boolean result3 = new PairManager(new Card(Rank.ofACE(), Suit2.DIAMOND),
        new Card(Rank.ofJACK(), Suit2.SPADE)).isPair();

    boolean result4 = new PairManager(new Card(Rank.ofACE(), Suit2.DIAMOND),
        new Card(Rank.ofACE(), Suit2.DIAMOND)).isPair();

    System.out.println(result); // true
    System.out.println(result2); // false
    System.out.println(result3); // false
    System.out.println(result4); // true
  }
}
