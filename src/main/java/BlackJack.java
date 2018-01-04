import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class BlackJack {
    private String[] cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private List<String[]> deck = new ArrayList<>();
    private String[] card;
    private Random picker = new Random();
    private List<String[]> hand = new ArrayList<>();
    private Integer value;
    private Map<String, Integer> values = new HashMap() {{
        put("Ace", 11);
        put("Two", 2);
        put("Three", 3);
        put("Four", 4);
        put("Five", 5);
        put("Six", 6);
        put("Seven", 7);
        put("Eight", 8);
        put("Nine", 9);
        put("Ten", 10);
        put("Jack", 10);
        put("Queen", 10);
        put("King", 10);
    }};

    BlackJack(){
        deck = deckBuild();
        hand.add(drawCard());
        hand.add(drawCard());
//        hand.add(drawCard());
        card = hand.get(0);
        value = addValue(card);
    }


    public String[] drawCard(){
        String[] draw = deck.get(picker.nextInt(deck.size()));
        return draw;
    }

//    public void drawCard(){
//        String[] draw = deck.get(picker.nextInt(deck.size()));
//        hand.add(draw);
//    }


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

    public Integer addValue(String[] card){
        int result = 0;
        return result;
    }


    public List getDeck(){
        return deck;
    }

    public String[] getCard(){
        return card;
    }
    public List<String[]> getHand(){
        return hand;
    }
    public int getValue(){
        return value;
    }
}

// String[] cardSuit = ["Ace", "Spades"]
// String card = cardSuit[0]
// String suit = cardSuit[1]
// system.out.println("%s of %s", card, suit)
// => "Ace of Spades"