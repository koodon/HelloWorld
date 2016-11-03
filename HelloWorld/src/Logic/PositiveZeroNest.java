package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class PositiveZeroNest {
    public static void main(String[] args) {
        int x = 0;
        if (x == 0) {
            System.out.println("x is zero");
        } else {
            if (x > 0) {
                System.out.println("x is positive");
            } else {
                System.out.println("x is negative");
            }
        }
    }
}
