package bookExamples.cardplay;

import bookExamples.cardplay.Card;
import bookExamples.cardplay.CardRank;
import bookExamples.cardplay.CardSuit;
import bookExamples.cardplay.DeckOfCards;

public class CardTest {

    private static DeckOfCards deckOfCards = new DeckOfCards();


    public static void main(String[] arg){


       deckOfCards.shuffleDeck();

        //deckOfCards.putCard(new bookExamples.cardplay.Card(bookExamples.cardplay.CardSuit.HEARTS,bookExamples.cardplay.CardRank.ACE));
        deckOfCards.printCards();

        Card card1 = new Card(CardSuit.DIAMONDS, CardRank.KING);
        Card card2 = new Card(CardSuit.DIAMONDS, CardRank.KING);

        }
}
