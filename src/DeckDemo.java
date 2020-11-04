
public class DeckDemo {

    public static void main(String[] args) {

        // Skapa en bunt som innehåller 3 kort
        Deck deck = Deck.getDeck(3);
        // Deck.print(deck);  // OBS! NullPointerException

        // Skapa en bunt som innehåller alla klöver
        Deck clubs = Deck.getClubs();
        Deck.print(clubs);

    }
}