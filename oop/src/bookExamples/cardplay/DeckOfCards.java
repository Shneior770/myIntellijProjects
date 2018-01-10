package bookExamples.cardplay;

import bookExamples.cardplay.Card;
import bookExamples.cardplay.CardRank;
import bookExamples.cardplay.CardSuit;

import java.util.Random;

public class DeckOfCards
{
  private Card [] deckOfCards = new Card[52];
  private CardRank [] cardRank = {CardRank.ACE, CardRank.DEUCE,
  CardRank.THREE,CardRank.FOUR,CardRank.FIVE,CardRank.SIX,
  CardRank.SEVEN,CardRank.EIGHT,CardRank.NINE,CardRank.TEN,
  CardRank.JACK,CardRank.QUEEN,CardRank.KING};

  private int counter = 0;

  private CardSuit[] cardSuit = {CardSuit.HEARTS,CardSuit.CLUBS,CardSuit.SPADES,CardSuit.DIAMONDS};

  public DeckOfCards(){
      for (int i = 0; i <cardSuit.length; i++) {
          for (int j = 0; j <cardRank.length ; j++) {
              deckOfCards[counter] = new Card(cardSuit[i],cardRank[j]);

                counter++;
          }
      }
  }
  public void shuffleDeck(){
      Random random = new Random();
      int ranNum = 0;
      Card tempCard;
      for (int i = 0; i <deckOfCards.length ; i++) {
          tempCard = deckOfCards[i];// save the currant card
          ranNum = random.nextInt(51);// pick a random num 0-51
          deckOfCards[i] = deckOfCards[ranNum];
          deckOfCards[ranNum] = tempCard;
      }
  }
  public String toString(){
      String str ="";
      for (int i = 0; i <deckOfCards.length ; i++) {
          str += deckOfCards[i].toString()+"/n";
      }
      return str;
  }

  public Card getCard(final Card card) {

        Card tempArr [] = new Card[deckOfCards.length-1];
      Card card1 = null;
      counter = 0;

      for (int i = 0; i < deckOfCards.length; i++) {

          if (deckOfCards[i].getSuit() == card.getSuit() && deckOfCards[i].getRank() == card.getRank()) {
              card1 = deckOfCards[i];
          } else {
              tempArr[counter] = deckOfCards[i];
              counter++;

          }

      }
      deckOfCards = tempArr;
      return card1;
  }
      public void printCards(){
    for (int i = 0; i <deckOfCards.length ; i++) {
        System.out.println(deckOfCards[i]);

    }
      }

  public void putCard(Card card){
          Card [] tempArr = new Card[deckOfCards.length+1];

      for (int i = 0; i <deckOfCards.length ; i++) {
          tempArr [i] = deckOfCards[i];
      }
       tempArr[tempArr.length-1] = card;
       deckOfCards = tempArr;
  }
}
