package cl_object.src.deck;

public class RuleManager {
  public boolean isPair(Card card1, Card card2) {
    return new PairManager(card1, card2).isPair();
  }

  public boolean isThreeKind(Card card1, Card card2, Card card3) {
    return false;
  }

  public boolean isFullHouse(Card card1, Card card2, Card card3, Card card4, Card card5) {
    // counting 
    return false;
  }

  public static void main(String[] args) {
    RuleManager ruleManager = new RuleManager();
    boolean result = ruleManager.isPair(Card.of(Rank.ofACE(), Suit2.DIAMOND) //
        , Card.of(Rank.ofACE(), Suit2.CLUB));

    System.out.println(result);
  }
}
