package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class Branches {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        if (y % 2 == 0)                             //without branch
            System.out.println("x is even");        //optional - y value
        else                                        //
            System.out.println("x is odd");         //

        if (x % 2 == 0) {                           //with branch
            System.out.println("x is even");        //
        } else {                                    //
            System.out.println("x is odd");         //optional - x value
        }
    }
}
