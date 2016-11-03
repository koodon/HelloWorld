package Logic;

/**
 * Created by Joke on 31.10.2016.
 */
public class BooleanFlag {
    public static void main(String[] args) {
        //examples (3):
        boolean flag;                       //variable declaration
        flag = true;                        //assignment
        boolean testResult = false;         //variable declaration and assignment

        //real thing starts here
        int n = 2;
        int x = 1;
        int y = 3;
        boolean valueY = (y % 2 == 0);      //true if y is odd
        boolean evenFlag = (n % 2 == 0);    //true if n is even
        boolean positiveFlag = (x > 0);     //true if x is positive

        if (positiveFlag) {
            System.out.println("x was positive when I checked it");
        }
        if (evenFlag) {
            System.out.println("n was even when I checked it");
        }
        if (!valueY) {
            System.out.println("y was odd when I checked it");
        }
    }
}
