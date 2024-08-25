package cl_object.src.deck;

import java.util.Random;

public class ShuffleManager {
  private Card[] cards;

  public ShuffleManager(SDeck sdeck) {
    // check if all 52 objects exist, otherwise you may throw exception
    this.cards = sdeck.getCards();
  }

  public Card[] getCards() {
    return this.cards;
  }

  // Deck Object behavior
  public void shuffle() {
    // Separate the cards into 3 parts (each part contains at least 1 card)
    int idx = new Random().nextInt(52 - 2); // 0 - 49
    int number = new Random().nextInt(52 - 2 - idx) + 1;
    // Part 1: begin=0, end=idx
    // Part 2: begin=idx + 1, end=idx + number
    // Part 3: beign=idx+number+1, end=51

    // Backup 3 parts of cards
    Card[] part1 = new Card[idx - 0 + 1]; // length: 1 - 50
    Card[] part2 = new Card[number - 1 + 1];
    Card[] part3 = new Card[51 - idx - number - 1 + 1];
    // for loop
    int c = 0;
    // Part 2
    for (int i = idx + 1; i < idx + number + 1; i++) {
      part2[c++] = this.cards[i];
    }
    // Part 1
    c = 0;
    for (int i = 0; i < idx + 1; i++) {
      part1[c++] = this.cards[i];
    }
    // Part 3
    c = 0;
    for (int i = idx + number + 1; i < 52; i++) {
      part3[c++] = this.cards[i];
    }

    // Overwrite 3 parts of cards to the original Card array
    c = 0;
    for (int i = 0; i < part2.length; i++) {
      this.cards[c++] = part2[i];
    }
    for (int i = 0; i < part1.length; i++) {
      this.cards[c++] = part1[i];
    }
    for (int i = 0; i < part3.length; i++) {
      this.cards[c++] = part3[i];
    }
  }
}
