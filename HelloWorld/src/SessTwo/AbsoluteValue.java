package SessTwo;

/**
 * Created by opilane on 15.11.2016.
 */
public class AbsoluteValue {
    public static void main (String[] args) {
        absoluteValue(3.0);

    }
    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
        //System.out.println("This line is dead.");         //syntax error
    }
}
