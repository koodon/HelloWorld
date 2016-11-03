package Logic;
import java.util.Scanner;
/**
 * Created by Joke on 31.10.2016.
 */
public class BinaryNumber {
    public static void main(String [] args) {
        number();
        }
        public static void Binary(int value) {
            if (value > 0) {
                Binary(value / 2);
                System.out.print(value % 2);
                }
        }
        public static void number() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
             if (!in.hasNextDouble()) {
                String word = in.next();
                System.err.println(word + " is not a number");
                return;
                }
            int value = in.nextInt();
            Binary(value);
    }
}