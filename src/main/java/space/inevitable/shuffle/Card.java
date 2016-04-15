package space.inevitable.shuffle;

public class Card {
    final private Rank rank;
    private final Suit suit;

    public Card(final Rank rank, Suit diamonds) {
        this.rank = rank;
        this.suit = diamonds;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
