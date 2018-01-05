import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BlackJack game = new BlackJack();
//            System.out.println(game.getValue());

            String hit = bufferedReader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();

        }

    }
}
