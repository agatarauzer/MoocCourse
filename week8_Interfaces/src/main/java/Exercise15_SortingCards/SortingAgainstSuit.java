package Exercise15_SortingCards;

import java.util.Comparator;

public class SortingAgainstSuit implements Comparator <Card> {

    public int compare(Card card1, Card card2) {
        return card1.getSuit() - card2.getSuit();
    }
}
