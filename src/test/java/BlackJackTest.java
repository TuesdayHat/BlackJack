import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class BlackJackTest {
    public BlackJack testGame = new BlackJack(); // makes sure all tests are done on the same instance of BlackJack

    @Test
    public void getDeck_generateADeckOfCards_boolean() throws Exception{
        List output = testGame.getDeck();
        System.out.println(output.size());
        assertEquals(true, output instanceof List);
    }

    @Test
    public void getCard_GenerateACard_stringArray() throws Exception {
        String[] output = testGame.getCard();
        System.out.println(String.format("%s of %s", output[0], output[1]));
        assertEquals(true, output instanceof String[]);
    }

    @Test
    public void getCards_getTwoCards_arrayStringArray() throws Exception {
        List output = testGame.getHand();
        System.out.println(output.size());
        int expected = 2;
        assertEquals(expected, output.size());
    }
}