package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class Forever {
    public static void main(String[] args) {
        forever("Forever and StackOverflowError");
    }
    public static void forever(String s) {
            System.out.println(s);
            forever(s);
        }
    }
