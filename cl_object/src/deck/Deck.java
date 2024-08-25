package cl_object.src.deck;

import java.util.Arrays;

public class Deck {
   // private static final Suit[] suits = new Suit[] {Suit.ofDiamond(),
  // Suit.ofClub(), Suit.ofHeart(), Suit.ofSpade()};

  private static final Rank[] ranks = new Rank[] {Rank.ofACE(), Rank.ofTWO(),
    Rank.ofTHREE(), Rank.ofFOUR(), Rank.ofFIVE(), Rank.ofSIX(),
    Rank.ofSEVEN(), Rank.ofEIGHT(), Rank.ofNINE(), Rank.ofTEN(),
    Rank.ofJACK(), Rank.ofQUEEN(), Rank.ofKING()};

private Card[] cards;

public Deck() {
  this.cards = new Card[Suit2.length() * ranks.length]; // !!! initialize
                                                        // array
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
  Deck deck = new Deck(); // Card ?
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
}


}
