package Methods;

/**
 * Created by Joke on 26.10.2016.
 */
public class PrintTime {
    public static void printTime(int hour, int minute) {    //a. parameters - hour & minute
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    public static void main(String[] args ) {               //b. variables - hour & minute
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);    //ver.1
        printTime(hour + 1, 0);     //ver.2
    }
}