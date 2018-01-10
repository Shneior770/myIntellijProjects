package bookExamples.cardplay;

import bookExamples.cardplay.Card;
import bookExamples.cardplay.CardRank;
import bookExamples.cardplay.CardSuit;

import java.util.ArrayList;
import java.util.List;

public class ListDeckOfCards {
    List<CardSuit> cardSuits = new ArrayList<>();
    List<CardRank> cardRanks = new ArrayList<>();
    List<Card> deckOfCards = new ArrayList<>(52);

    public ListDeckOfCards(){
        cardSuits.add(CardSuit.HEARTS);
        cardSuits.add(CardSuit.CLUBS);
        cardSuits.add(CardSuit.SPADES);
        cardSuits.add(CardSuit.DIAMONDS);

        cardRanks.add(CardRank.ACE);
        cardRanks.add(CardRank.DEUCE);
        cardRanks.add(CardRank.THREE);
        cardRanks.add(CardRank.FOUR);
        cardRanks.add(CardRank.FIVE);
        cardRanks.add(CardRank.SIX);
        cardRanks.add(CardRank.SEVEN);
        cardRanks.add(CardRank.EIGHT);
        cardRanks.add(CardRank.NINE);
        cardRanks.add(CardRank.TEN);
        cardRanks.add(CardRank.JACK);
        cardRanks.add(CardRank.QUEEN);
        cardRanks.add(CardRank.KING);

        for (int i = 0; i <cardSuits.size() ; i++) {
            for (int j = 0; j <cardRanks.size() ; j++) {
            deckOfCards.add(new Card(cardSuits.get(i),cardRanks.get(j)));
            }
        }

    }

    public Card getCard(final Card card){
        int index = deckOfCards.indexOf(card);// call automatic to the override equals method and if true, returns the index
        Card ret =  deckOfCards.get(index);
        deckOfCards.remove(index);
        return ret;

//                bookExamples.cardplay.Card card1 = null;
//        for (int i = 0; i <deckOfCards.size() ; i++) {
//            if (deckOfCards.get(i).equals(card)){
//                card1 = deckOfCards.get(i);
//                deckOfCards.remove(i);
//            }
//        }

//        return card1;
    }

    public void putCard(Card card){
        deckOfCards.add(card);
    }

    public void printCards(){
        for (Card item: deckOfCards) {
            System.out.println(item);
        }
    }
}
