package space.inevitable.shuffle

import spock.lang.Specification

class DeckTest extends Specification {
    Deck deck

    def setup(){ //this is a general "given" block executed by all the test cases
        deck = new Deck()
    }

    def  "getSize should return 52 when no card is taken from the deck"(){
        //given can be replaced/extended by a setup method
        //given:
        //Deck deck = new Deck()

        when:
        int sizeOfDeck = deck.getSize()

        then:
        sizeOfDeck == 52
    }

    def "getSize should return 51 when a card is taken"(){
        when:
        deck.dealCard()
        int sizeOfDeck = deck.getSize()

        then:
        sizeOfDeck == 51
    }

    def "dealCard should return a card"(){
        when:
        Card card = deck.dealCard()

        then:
        card != null
    }

    def "dealCard should return a card A"(){
        when:
        Card card = deck.dealCard()

        then:
        card.getRank() == Rank.A
    }

    def "dealCard twice should return cards A and 2"(){
        when:
        Card cardA = deck.dealCard()
        Card card2 = deck.dealCard()

        then:
        cardA.getRank() == Rank.A
        card2.getRank() == Rank.TWO
    }

    def "dealCard three should return cards A, 2 and 3"(){
        when:
        Card cardA = deck.dealCard()
        Card card2 = deck.dealCard()
        Card card3 = deck.dealCard()

        then:
        cardA.getRank() == Rank.A
        card2.getRank() == Rank.TWO
        card3.getRank() == Rank.THREE
    }
}
