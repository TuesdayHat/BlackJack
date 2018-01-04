import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlackJack {
    String[] cards = {"Ace", "Two", "Three,", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    List<String[]> deck = new ArrayList<>();
    String[] card;
    Random picker = new Random();
    List<String[]> hand = new ArrayList<>();

    BlackJack(){
        deck = deckBuild();
        hand.add(drawCard());
        hand.add(drawCard());
    }

    public String[] drawCard(){
        String[] draw = deck.get(picker.nextInt(deck.size()));
        return draw;
    }

    public List deckBuild() {
        List<String[]> deck = new ArrayList<>();
        for(int i=0;i<cards.length;i++){
            for(int j=0;j<suits.length;j++){
                String[] card = new String[2];
                card[0] = cards[i];
                card[1] = suits[j];
                deck.add(card);
            }
        }
        return deck;
    }


    public List getDeck(){
        return deck;
    }

    public String[] getCard(){
        return drawCard();
    }
    public List<String[]> getHand(){
        return hand;
    }
}

// String[] cardSuit = ["Ace", "Spades"]
// String card = cardSuit[0]
// String suit = cardSuit[1]
// system.out.println("%s of %s", card, suit)
// => "Ace of Spades"