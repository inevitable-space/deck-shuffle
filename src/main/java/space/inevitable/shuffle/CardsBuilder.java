package space.inevitable.shuffle;

import java.util.ArrayList;
import java.util.List;

public class CardsBuilder {
    private final List<Card> cards;

    public CardsBuilder() {
        cards = new ArrayList<Card>();
    }

    public List<Card> build() {
        iterInSuitEnum();
        return cards;
    }

    private void iterInSuitEnum() {
        for(final Suit suit :Suit.values()){
            iterateInRankEnum(suit);
        }
    }

    private void iterateInRankEnum(final Suit suit) {
        for(final Rank rank : Rank.values()){
            final Card card = buildCard(rank, suit);
            cards.add(card);
        }
    }

    private Card buildCard(final Rank rank, final Suit suit) {
        return new Card(rank, suit);
    }
}
