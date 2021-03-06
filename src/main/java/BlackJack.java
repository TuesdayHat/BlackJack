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
    private boolean twentyOne = false;
    private boolean isAce = false;


    BlackJack(){
        deck = deckBuild();
        hand.add(drawCard());
        hand.add(drawCard());
        hand.add(drawCard());
        card = hand.get(0);
        value = addValue();
        compare();
        aceCheck();
        System.out.println(hand.get(0)[0] + " // " + hand.get(1)[0] + " // " + hand.get(2)[0]);
        System.out.println(value);
        System.out.println(twentyOne);
        System.out.println(values.get("Ace"));

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

    public Integer addValue(){
        Integer result = 0;
//        result += values.get(card[0]);
        for (String[] face : hand){
            result += values.get(face[0]);
        }

        return result;
    }

    public void compare(){
        if (value > 21){
            twentyOne = true;
        }
    }

    public void aceCheck(){
        for (String[] card:hand){
            if (card[0].equals("ace") && twentyOne){
                isAce = true;
                setAce();
                twentyOne = false;
                updateValue();

            }
        }
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
    public Map<String, Integer> getValues(){
        return values;
    }
    public boolean getCompare(){
        return twentyOne;
    }
    public boolean getIsAce(){
        aceCheck();
        return isAce;
    }

    public void setAce(){
        this.values.put("Ace", 1);
    }
    public void updateValue(){
        this.value = addValue();
    }
}

// String[] cardSuit = ["Ace", "Spades", "11"]
// String card = cardSuit[0]
// String suit = cardSuit[1]
// system.out.println("%s of %s", card, suit)
// => "Ace of Spades"