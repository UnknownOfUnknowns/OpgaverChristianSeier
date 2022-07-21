import Poker.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
