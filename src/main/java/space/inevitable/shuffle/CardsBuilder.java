package space.inevitable.shuffle;

import java.util.ArrayList;
import java.util.List;

public class CardsBuilder {
    private final List<Card> cards;

    public CardsBuilder() {
        cards = new ArrayList<Card>();
    }

    public List<Card> build() {
        iterateInRankEnum();
        return cards;
    }

    private void iterateInRankEnum() {
        for(Rank rank : Rank.values()){
            Card card = buildCard(rank);
            cards.add(card);
        }
    }

    private Card buildCard(Rank rank) {
        return new Card(rank);
    }
}
