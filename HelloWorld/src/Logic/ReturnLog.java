package Logic;
import java.util.Scanner;
/**
 * Created by Joke on 31.10.2016.
 */
public class ReturnLog {
    public static void main(String[] args) {
        printLogarithm(0.0);                                    //error
        scanDoubleNumberOnly();
        scanDouble();
    }
    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive");    //error
            return;                                             //exit the method
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }
    public static void scanDoubleNumberOnly() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");                   //error, if not number
        double x = in.nextDouble();
        printLogarithm(x);
    }
    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number: ");                   //no number "fix"
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }
}
