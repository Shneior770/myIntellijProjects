package bookExamples.cardplay;

public enum CardRank{
    ACE(1),DEUCE(2),THREE(3),
    FOUR(4),FIVE(5),SIX(6),
    SEVEN(7),EIGHT(8),NINE(9),
    TEN(10),JACK(11),QUEEN(12),
    KING(13);

    private final int rankOfCard;

    private CardRank(int rc){
     this.rankOfCard = rc;
    }

    public int getRank(){
        return rankOfCard;
    }
}