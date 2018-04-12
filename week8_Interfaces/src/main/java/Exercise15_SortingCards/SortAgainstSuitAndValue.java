package Exercise15_SortingCards;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int sortSuit = card1.getSuit() - card2.getSuit();
        if (sortSuit == 0) {
            return card1.getValue() - card2.getValue();
        }
        else {
            return sortSuit;
        }
    }
}
