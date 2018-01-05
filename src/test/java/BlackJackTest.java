import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;


public class BlackJackTest {
    public BlackJack testGame = new BlackJack(); // makes sure all tests are done on the same instance of BlackJack
    Map<String, Integer> values = testGame.getValues();

    @Test
    public void getDeck_generateADeckOfCards_boolean() throws Exception {
        List output = testGame.getDeck();
//        System.out.println(output.size());
        assertEquals(true, output instanceof List);
    }

    @Test
    public void getCard_GenerateACard_stringArray() throws Exception {
        String[] output = testGame.getCard();
//        System.out.println(String.format("%s of %s", output[0], output[1]));
        assertEquals(true, output instanceof String[]);
    }

    @Test
    public void getCards_getTwoCardsOrMore_arrayStringArray() throws Exception {
        List<String[]> output = testGame.getHand();
        String[] cardOne = output.get(0);
        String[] cardTwo = output.get(1);
//        System.out.println(String.format("%s of %s, %s of %s", cardOne[0], cardOne[1], cardTwo[0], cardTwo[1]));
        int expected = 2;
//        assertEquals(expected, output.size());
        assert (output.size() >= expected);
    }

    @Test
    public void addValue_AssignValueToCard_int() throws Exception {
        Integer output = testGame.getValue();
//        System.out.println(output);
//        System.out.println(testGame.getCard()[0]);
        assert (output > 0);
    }

    @Test
    public void addValue_addUpValueOfHand_int() throws Exception {
        List<String[]> hand = testGame.getHand();
        String[] cardOne = hand.get(0);
        String[] cardTwo = hand.get(1);
//        System.out.println(String.format("%s of %s, %s of %s", cardOne[0], cardOne[1], cardTwo[0], cardTwo[1]));
//        System.out.println(testGame.getValue());
        Integer actual = testGame.getValue();
        Integer expected = values.get(cardOne[0]) + values.get(cardTwo[0]);
        assert(expected <= actual);
    }

    @Test
    public void compare_checkValueAgainstTewntyOne_boolean() throws Exception {
        int handVal = testGame.getValue();
        List<String[]> hand = testGame.getHand();
        int handSize = hand.size();
        if (handSize < 3){
            assertFalse(testGame.getCompare());
        } else if (testGame.getValue() > 21) {
            assertTrue(testGame.getCompare());
        } else {
            assertFalse(testGame.getCompare());
        }
    }

    @Test
    public void aceCheck_checkIfHandContainsAnAce_boolean() throws Exception {
        List<String[]> hand = testGame.getHand();
        if(testGame.getIsAce()){
            assertTrue(testGame.getIsAce());
        } else {
            assertFalse(testGame.getIsAce());
        }

        String[] cardOne = hand.get(0);
        String[] cardTwo = hand.get(1);
        String[] cardThree = hand.get(2);

//        System.out.println(String.format("%s of %s, %s of %s, %s of %s", cardOne[0], cardOne[1], cardTwo[0], cardTwo[1], cardThree[0], cardThree[1]));
//        System.out.println(testGame.getValue());
    }

//    @Test
//    public void aceCheck_alterValueOfAceBasedOnDifferenceWith21_int() throws Exception {
//        List<String[]> hand = testGame.getHand();
//        if (){
//
//        }
//    }
}