import java.util.ArrayList;

public class Dealer {

    public static void main(String[] args) {
        CardDeck dealerDeck = new CardDeck();

        ArrayList<Cards> casinoDeck = dealerDeck.getDeck();

        for(Cards c : casinoDeck){
            System.out.println(c);
        }
    }

}
