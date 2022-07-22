package Poker;

import java.util.Arrays;

public class Hand {

    Card[] cards = new Card[5];

    public Hand(Card[] cards){
        this.cards = cards;
        sortHand();
    }

    public Ranking calculateRank(){
        //RoyalStraightFlush
        if (cards[0].value.numberValue == 10 && cards[1].value.numberValue == 11 && cards[2].value.numberValue == 12
                && cards[3].value.numberValue == 13 && cards[4].value.numberValue == 14) {
            if(cards[0].suit == cards[1].suit && cards[1].suit == cards[2].suit && cards[2].suit == cards[3].suit
                    && cards[3].suit == cards[4].suit) {
                return Ranking.ROYALFLUSH;
            }
            return Ranking.STRAIGHT;
        }
        //StraightFlush
        for (int i = 0; i < 4; i++) {
            if (cards[i].value.numberValue +1 != cards[i+1].value.numberValue || cards[i].suit != cards[i+1].suit){
                break;
            }
            if (cards[i].value.numberValue + 1 == cards[i+1].value.numberValue && cards[i].suit == cards[i+1].suit){
                    if (i == 3){
                        return Ranking.STRAIGHTFLUSH;
                    }
            }
        }
        //FourOfKind
        int count = 0;
        for (int i=0; i<4; i++) {
            if (cards[i].value.numberValue == cards[i+1].value.numberValue){
                count++;
                if (count == 4){
                    return Ranking.FOUROFAKIND;
                }
                }
            }

        //FullHouse
            if(cards[0].value.numberValue == cards[1].value.numberValue &&
                    cards[0].value.numberValue == cards[2].value.numberValue) {
                if (cards[3].value.numberValue == cards[4].value.numberValue) {
                    return Ranking.FULLHOUSE;
                }
            }
            if(cards[0].value.numberValue == cards[1].value.numberValue) {
                if (cards[2].value.numberValue == cards[3].value.numberValue &&
                        cards[2].value.numberValue == cards[4].value.numberValue){
                    return Ranking.FULLHOUSE;
                }
            }

        return Ranking.HIGHCARD;
    }

    private void sortHand(){
        Arrays.sort(cards);
    }

}
