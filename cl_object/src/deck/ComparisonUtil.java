package cl_object.src.deck;

public class ComparisonUtil {
  // static method - no longer used, when you created the Suit.class
  public static int compareTwoSuits(String suit1, String suit2) {
    if (!suit1.equals(suit2)) {
      if ("SPADE".equals(suit1) || "DIAMOND".equals(suit2))
        return 1;
      if ("SPADE".equals(suit2) || "DIAMOND".equals(suit1))
        return -1;
      if ("CLUB".equals(suit1) && "DIAMOND".equals(suit2))
        return 1;
      if ("CLUB".equals(suit1) && "HEART".equals(suit2) //
          || "CLUB".equals(suit1) && "SPADE".equals(suit2))
        return -1;
      if ("HEART".equals(suit1) && "SPADE".equals(suit2))
        return -1;
      if ("HEART".equals(suit1) && "CLUB".equals(suit2) //
          || "HEART".equals(suit1) && "DIAMOND".equals(suit2))
        return 1;
      // rest of combinations for suit2
      if ("SPADE".equals(suit1) && "HEART".equals(suit2))
        return 1;
      if ("DIAMOND".equals(suit1) && "HEART".equals(suit2))
        return -1;
      if ("SPADE".equals(suit1) && "CLUB".equals(suit2))
        return 1;
      if ("DIAMOND".equals(suit1) && "CLUB".equals(suit2))
        return -1;
    }
    return 0; // same suit
  }

  // Because the method signature is static design, so this method should static
  // method
  // static method - no longer used, when you created the compareTo() in
  // Card.class
  public static int compareTwoCard(Card card1, Card card2) {
    // card1 (address) vs card2 (address)
    return -1;
  }

  // static method - no longer used, when you created the Suit.class
  public static int compareTwoSuits2(int suit1, int suit2) {
    if (suit1 == suit2)
      return 0;
    return suit1 > suit2 ? 1 : -1;
  }


  // static method - no longer used, when you created the Rank.class
  public static int compareTwoRanks(char rank1, char rank2) { // leetcode ->
    // Early return
    if (rank1 != rank2) {
      if (rank1 == '2')
        return 1;
      if (rank2 == '2')
        return -1;
      if (rank1 == 'A')
        return 1;
      if (rank2 == 'A')
        return -1;
      if (rank1 == 'K')
        return 1;
      if (rank2 == 'K')
        return -1;
      if (rank1 == 'Q')
        return 1;
      if (rank2 == 'Q')
        return -1;
      if (rank1 == 'J')
        return 1;
      if (rank2 == 'J')
        return -1;
      if (rank1 == 'T')
        return 1;
      if (rank2 == 'T')
        return -1;
      return rank1 > rank2 ? 1 : -1; // 3 - 9
    }
    return 0;
  }
}
