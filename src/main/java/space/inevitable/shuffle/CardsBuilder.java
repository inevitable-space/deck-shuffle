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
        for(Suit suit :Suit.values()){
            iterateInRankEnum(suit);
        }
    }

    private void iterateInRankEnum(Suit suit) {
        for(Rank rank : Rank.values()){
            Card card = buildCard(rank, suit);
            cards.add(card);
        }
    }

    private Card buildCard(Rank rank, Suit suit) {
        return new Card(rank, suit);
    }
}
