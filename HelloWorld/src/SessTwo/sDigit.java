package SessTwo;

/**
 * Created by opilane on 17.11.2016.
 */
public class sDigit {
    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);

    }
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }

    }
}
