package Poker;

import java.util.Arrays;

public class Hand {

    Card[] cards = new Card[5];

    public Hand(Card[] cards){
        this.cards = cards;
        sortHand();
    }

    public Ranking calculateRank(){

        return Ranking.STRAIGHT;
    }

    private void sortHand(){
        Arrays.sort(cards);
    }

}
