package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class PositiveZeroChain {
    public static void main(String[] args) {
        int x = -1;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
    }
}
