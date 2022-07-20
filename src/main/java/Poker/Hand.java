package Poker;

public class Hand {

    Card[] cards = new Card[5];

    public Hand(Card[] cards){
        this.cards = cards;

    }

    public Ranking calculateRank(){

        return Ranking.STRAIGHT;
    }


}
