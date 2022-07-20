package Poker;


import java.util.Arrays;

public class Game {

    public static void main(String[] args) {
        Card[] cards = new Card[]{new Card(Suit.Hearths, Value.SEVEN),
        new Card(Suit.Hearths, Value.EIGHT),
        new Card(Suit.Hearths, Value.NINE),
        new Card(Suit.Hearths, Value.JACK),
        new Card(Suit.Hearths, Value.TEN)};
        Arrays.sort(cards);
        for(Card card : cards){
            System.out.println(card.value);
        }
    }
}
