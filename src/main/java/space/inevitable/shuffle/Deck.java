package space.inevitable.shuffle;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private int size = 52;
    final private List<Card> cards;

    public Deck() {
        CardsBuilder cardsBuilder = new CardsBuilder();
        cards = cardsBuilder.build();
    }

    public int getSize() {
        return size;
    }

    public Card dealCard() {
        size--;

        final Card card = cards.get(0);
        cards.remove(0);

        return card;
    }
}
