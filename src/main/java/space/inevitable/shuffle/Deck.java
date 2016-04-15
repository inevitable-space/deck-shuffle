package space.inevitable.shuffle;

import java.util.List;

public class Deck {
    final private List<Card> cards;

    public Deck() {
        final CardsBuilder cardsBuilder = new CardsBuilder();
        cards = cardsBuilder.build();
    }

    public int getSize() {
        return cards.size();
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public Card getCardAt(final int index) {
        return cards.get(index);
    }
}
