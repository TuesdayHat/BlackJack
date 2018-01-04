import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    String[] cards = {"Ace", "Two", "Three,", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};

    private List deckBuild() {
        List<String[]> deck = new ArrayList<String[]>();
        for(int i=0;i<cards.length;i++){
            String[] card = new String[2];
            for(int j=0;j<suits.length;j++){
                card[0] = cards[i];
                card[1] = suits[j];
                deck.add(card);
            }
        }
        return deck;
    }

    public List getDeck(){
        return deckBuild();
    }
}

// String[] cardSuit = ["Ace", "Spades"]
// String card = cardSuit[0]
// String suit = cardSuit[1]
// system.out.println("%s of %s", card, suit)
// => "Ace of Spades"