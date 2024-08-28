package cl_object.src.deck;

import java.util.Arrays;

public class Deck {
  // private static final Suit[] suits = new Suit[] {Suit.ofDiamond(),
  // Suit.ofClub(), Suit.ofHeart(), Suit.ofSpade()};

  private Card[] cards;

  public Deck(Game game) {
    // Parent: Rank, Child: BigTwoRank
    // Rank[] and BigTwoRank[] ?

    // Shape[] vs Circle[]
    Rank[] ranks = new Rank[0];
    if (game == Game.BIGTWO) {
      ranks = BigTwoRank.rankArray;
    } else if (game == Game.POKER) {
      ranks = PokerRank.rankArray;
    }
    // !!! initialize card array
    this.cards = new Card[Suit2.length() * ranks.length];

    // create 52 cards, and then put it into Deck Object
    // for-each
    // 13 x 4
    int idx = 0;
    for (Suit2 suit : Suit2.values()) { // 4 times
      for (Rank rank : ranks) { // 13 times
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public int size() {
    return this.cards.length;
  }

  public String toString() {
    return "Deck(" //
        + "cards=" + Arrays.toString(this.cards) //
        + ")";
  }

  public static void main(String[] args) {
    Deck deck = new Deck(Game.POKER); // Card ?
    System.out.println(deck.size()); // 52

    // Without toString(), sysout custom object -> object reference (i.e.
    // deck.Deck@8bcc55f)
    // System.out.println(deck); // System.out.println(deck.toString());
    // ShuffleManager sm;
    for (int i = 0; i < 1000; i++) {
      new ShuffleManager(new SDeck(deck.getCards())).shuffle();
    }
    System.out.println(deck);
    // sm.getCards(); // Manager -> Deck

    // 5 Cards
    // int beginIdx = new Random().nextInt(3); // 0 - 2
    // // 0 (1-3)
    // // 1 (2-3)
    // // 2 (3-3)
    // System.out.println(beginIdx);
    // int number = new Random().nextInt(5 - 2 - beginIdx) + 1; // 1 - 3 (0-2 +
    // 1)
    // System.out.println(number);

    Rank[] ranks1 = new BigTwoRank[] {BigTwoRank.ofACE(), BigTwoRank.ofTWO()};
    System.out.println(ranks1[0].compareTo(ranks1[1])); // -1

    Rank[] ranks2 = new PokerRank[] {PokerRank.ofACE(), PokerRank.ofTWO()};
    

    Rank[] bigTwoRanks = new Rank[] {BigTwoRank.ofACE(), BigTwoRank.ofTWO()}; // OK

    // Potentially incorrect, because Rank[] object can store PokerRank object
    // BigTwoRank[] bigTwoRanks2 = new Rank[] {BigTwoRank.ofACE(), BigTwoRank.ofACE()}; // NOT OK
    // BigTwoRank[] bigTwoRanks2 = new Rank[] {BigTwoRank.ofACE(), PokerRank.ofACE()}; // NOT OK

  }


}
