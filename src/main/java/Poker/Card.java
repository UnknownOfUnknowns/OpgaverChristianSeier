package Poker;

public class Card implements Comparable<Card>{

    Suit suit;
    Value value;

    public Card(Suit suit,Value value){
        this.suit = suit;
        this.value = value;

    }

    @Override
    public int compareTo(Card o) {
        return value.numberValue-o.value.numberValue;
    }
}
