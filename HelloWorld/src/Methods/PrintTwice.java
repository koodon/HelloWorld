package Methods;

/**
 * Created by Joke on 26.10.2016.
 */
public class PrintTwice {
    public static void printTwice(String s) {           //printTwice has a parameter named s with type String
        System.out.println(s);
        System.out.println(s);
    }                                                   //to invoke printTwice - provide argument with type String
    public static void main(String[] args) {
        printTwice("Don't make me say this twice!");    //argument "Don't .... twice!" gets assigned to the parameter s
    }
}