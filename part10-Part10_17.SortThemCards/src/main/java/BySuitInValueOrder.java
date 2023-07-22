import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        int valCard = 0;
        int valSuit = o1.getSuit().ordinal() - o2.getSuit().ordinal();
        if(valSuit == 0){
            valCard = o1.getValue() - o2.getValue();
        }
        return valSuit+valCard;
    }
    
}
