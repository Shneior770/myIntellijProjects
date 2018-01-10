package bookExamples.cardplay;

import java.util.ArrayList;

public enum CardSuit {

    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String suitText;// use it to get a specific value;


private CardSuit(String cs) {  // when initialize,insert automatic the given values above ("clubs" etc..) into the cr. each at the time
   this.suitText = cs;


}
    public String getSuit() {
        return suitText;

    }


}