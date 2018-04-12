package Exercise15_SortingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card: cards) {
            System.out.println(card);
        }
    }

    public int compareTo(Hand hand) {
        int sumThis = 0;
        int sumHand = 0;

        for (Card card: cards) {
            sumThis += card.getValue();
        }
        for (Card card: hand.cards) {
            sumHand += card.getValue();
        }
        return sumThis - sumHand;
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter );
    }
}
