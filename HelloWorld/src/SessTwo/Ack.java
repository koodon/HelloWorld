package SessTwo;

/**
 * Created by opilane on 17.11.2016.
 */
public class Ack {
    public static void main(String[] args) {
        System.out.println(ack(3, 12));
        System.out.println("");
        System.out.println(ack(-1, 12));
    }
    public static int ack(int m, int n) {
        if (m < 0 && n < 0 || m < 0 && n >= 0 || m >= 0 && n < 0) {
            throw new IllegalArgumentException("Must be positive number!");
        }
        else if (m == 0) {
            return n + 1;
        }
         else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        }
        else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        }
        return ack(m, n);
    }

}
