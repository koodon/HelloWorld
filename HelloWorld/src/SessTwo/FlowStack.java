package SessTwo;

/**
 * Created by opilane on 17.11.2016.
 */
public class FlowStack {
    public static void main(String[] args) {
        System.out.print(prod(1, 4));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }
}

//120