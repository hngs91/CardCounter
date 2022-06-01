import java.util.ArrayList;

public class CardDeck {

    private ArrayList<String> faces = new ArrayList<>();
    private ArrayList<String> suits = new ArrayList<>();
    private ArrayList<Cards> deck = new ArrayList<>();


    public CardDeck() {
        buildFaces();
        buildSuits();

        for (int i = 1; i <= 10; i++) {
            deck.add(new Cards(i, null, suits.get(0)));
            deck.add(new Cards(i, null, suits.get(1)));
            deck.add(new Cards(i, null, suits.get(2)));
            deck.add(new Cards(i, null, suits.get(3)));
        }

        for (int i = 0; i < 4; i++) {
            for (String s : faces) {
                deck.add(new Cards(null, s, suits.get(i)));
            }
        }
    }

    private void buildSuits() {
        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Spades");
    }

    private void buildFaces() {
        faces.add("A");
        faces.add("J");
        faces.add("Q");
        faces.add("K");
    }

    public ArrayList<Cards> getDeck() {
        return deck;
    }
}
