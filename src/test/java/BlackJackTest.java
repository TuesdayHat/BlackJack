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
    public void getCard_GenerateACard_string() throws Exception {
        String[] output = testGame.getCard();
        System.out.println(output.length);
        assertEquals(true, output instanceof String[]);
    }
}