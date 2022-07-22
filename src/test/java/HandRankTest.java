import Poker.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HandRankTest {
    @Test
    public void RoyalStraightFlush(){
        Card[] card = new Card[]{
                new Card(Suit.Clubs, Value.TEN),
                new Card(Suit.Clubs, Value.JACK),
                new Card(Suit.Clubs, Value.QUEEN),
                new Card(Suit.Clubs, Value.KING),
                new Card(Suit.Clubs, Value.ACE)
        };
        Hand hand = new Hand(card);
        assertEquals(hand.calculateRank(), Ranking.ROYALFLUSH);
    }
    @Test
    public void Straight() {
        Card[] card = new Card[]{
                new Card(Suit.Hearths, Value.TEN),
                new Card(Suit.Clubs, Value.JACK),
                new Card(Suit.Clubs, Value.QUEEN),
                new Card(Suit.Clubs, Value.KING),
                new Card(Suit.Clubs, Value.ACE)
        };
        Hand hand = new Hand(card);
        assertEquals(hand.calculateRank(), Ranking.STRAIGHT);
    }

    @Test
    public void Straightflush() {
        Card[] card = new Card[]{
                new Card(Suit.Clubs, Value.TEN),
                new Card(Suit.Clubs, Value.JACK),
                new Card(Suit.Clubs, Value.QUEEN),
                new Card(Suit.Clubs, Value.KING),
                new Card(Suit.Clubs, Value.NINE)
        };
        Hand hand = new Hand(card);
        assertEquals(hand.calculateRank(), Ranking.STRAIGHTFLUSH);
    }

    @Test
    public void FourOfaKind(){
        Card[] card = new Card[]{
                new Card(Suit.Diamonds, Value.NINE),
                new Card(Suit.Hearths, Value.NINE),
                new Card(Suit.Clubs, Value.QUEEN),
                new Card(Suit.Spades, Value.NINE),
                new Card(Suit.Clubs, Value.NINE)
        };
        Hand hand = new Hand(card);
        assertEquals(hand.calculateRank(), Ranking.FOUROFAKIND);
    }
    @Test
    public void NotFourOfaKind(){
        Card[] card = new Card[]{
                new Card(Suit.Diamonds, Value.NINE),
                new Card(Suit.Hearths, Value.NINE),
                new Card(Suit.Clubs, Value.QUEEN),
                new Card(Suit.Spades, Value.NINE),
                new Card(Suit.Clubs, Value.SEVEN)
        };
        Hand hand = new Hand(card);
        assertNotEquals(hand.calculateRank(), Ranking.FOUROFAKIND);
    }

}
