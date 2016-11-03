package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class Blastoff {
    public static void main(String[] args) {
        countdown(3);
        //newLine();
        //threeLine();
        nLines(1);                            //newLine and/or threeLine - alternative
        countup(3);
    }
        public static void countdown(int n) {
            if (n == 0) {
                System.out.println("Blastoff!");
            } else {
                System.out.println(n);
                countdown(n - 1);
            }
        }
        public static void newLine() {              //off
            System.out.println();
        }
        public static void threeLine() {
            newLine();
            newLine();
            newLine();
        }
        public static void nLines(int n) {
            if (n > 0) {
                System.out.println();
                nLines(n - 1);
            }
        }
        public static void countup(int n) {
            if (n == 0) {
                System.out.println("Blastoff!");
            } else {
                countup(n - 1);
                System.out.println(n);
            }
        }
    }

