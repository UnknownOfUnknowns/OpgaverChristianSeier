package Poker;

public enum Ranking {

    ROYALFLUSH(10),
    STRAIGHTFLUSH(9),
    FOUROFAKIND(8),
    FULLHOUSE(7),
    FLUSH(6),
    STRAIGHT(5),
    THREEOFAKIND(4),
    TWOPAIRS(3),
    ONEPAIR(2),
    HIGHCARD(1);

    public final int rankvalue;

    Ranking (int rankvalue){
        this.rankvalue = rankvalue;
}

}
