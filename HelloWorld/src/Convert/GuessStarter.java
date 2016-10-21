package Convert;

/**
 * Created by opilane on 21.10.2016.
 */
import java.util.Random;
public class GuessStarter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
