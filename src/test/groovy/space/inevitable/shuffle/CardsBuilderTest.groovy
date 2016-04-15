package space.inevitable.shuffle

import spock.lang.Specification

class CardsBuilderTest extends Specification {
    CardsBuilder cardsBuilder
    List<Card> cards

    def setup(){
        cardsBuilder = new CardsBuilder()
        cards = cardsBuilder.build()
    }

    def "build should create 52 cards"(){
        //expect is used when there is no when related to the test
        expect:
        cards.size() == 52
    }

    def "build should create 13 cards where the first one rank should be A"(){
        when:
        Card card = cards.get(0)

        then:
        card.getRank() == Rank.A
    }

    // with ranks from A - K
}
