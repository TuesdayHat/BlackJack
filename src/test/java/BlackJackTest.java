import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class BlackJackTest {
    public BlackJack testGame = new BlackJack(); // makes sure all tests are done on the same instance of BlackJack

    @Test
    public void getDeck_generateADeckOfCards_boolean() throws Exception{
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
        System.out.println(String.format("%s of %s, %s of %s", cardOne[0], cardOne[1], cardTwo[0], cardTwo[1]));
        int expected = 2;
//        assertEquals(expected, output.size());
        assert(output.size() >= expected);
    }

    @Test
    public void scoreCards_AssignValueToCard_int() throws Exception {
        Integer output = testGame.getValue();
        System.out.println(output);
        System.out.println(testGame.getCard()[0]);
        assert(output > 0);
    }
}