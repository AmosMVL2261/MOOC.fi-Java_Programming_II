import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        for(Card card : hand){
            System.out.println(card);
        }
    }

    public void sort(){
        //Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        //Collections.sort(hand, comparator);
        Collections.sort(hand);
    }

    public int getSumHand(){
        int sum = 0;
        for (Card card : hand) {
            sum+=card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        return this.getSumHand() - o.getSumHand();
    }

    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
