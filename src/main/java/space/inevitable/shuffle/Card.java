package space.inevitable.shuffle;

public class Card {
    final private Rank rank;

    public Card(final Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
