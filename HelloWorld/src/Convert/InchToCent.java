package Convert;

/**
 * Created by opilane on 19.10.2016.
 */
import java.util.Scanner;

public class InchToCent {
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);

        double cmPerInch = 2.54;
        cm = inch * cmPerInch;

        //final double CM_PER_INCH = 2.54;      - easy to read

        System.out.print("How many inches? ");
        inch = in.nextInt();

        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
    }
}



//3.6