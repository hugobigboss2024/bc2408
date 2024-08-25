package cl_object.src.deck;

public class SDeck {
   // !!! final -> array object cannot be changed
   private final Card[] cards;

   public SDeck(Card[] cards) {
     // if (cards.length != this.cards.length) 
     //   throw Exception
     this.cards = cards;
   }
 
   public Card[] getCards() {
     return this.cards;
   }
}
