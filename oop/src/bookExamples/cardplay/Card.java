package bookExamples.cardplay;

public class Card {

    CardSuit suit;// heart etc..
    CardRank rank;//value 1,2,3,etc..

    public Card(CardSuit cardSuit, CardRank cardRank) {// accept a rank of a card as a enum
        this.suit = cardSuit;
        this.rank = cardRank;
    }

    public String getSuit() {
        return suit.getSuit();
    }

    public int getRank() {

        return rank.getRank();
    }

    public String toString() {
        String str = "";
        str = rank.getRank() + " of " + suit.getSuit();
        return str;
    }
    public boolean equals(Object object){
       Card card = (Card)object;
       return (this.getSuit() == card.getSuit()&& this.getRank() == card.getRank());

    }
}
