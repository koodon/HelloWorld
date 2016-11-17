package SessTwo;

/**
 * Created by opilane on 16.11.2016.
 */
public class Fun {
    public static void main(String[] args) {
        double a = 1.0 * 2.0 + 3.0;
        System.out.println("a.  1 * 2 + 3 = " + a);
        double b = (Math.sin(Math.PI / 4)) + (((Math.cos(Math.PI / 4)) / 2));
        System.out.println("b.  sinPI/4 + cos PI/4/2 = " + b);
        double c = Math.log(10) + Math.log(20);
        System.out.println("c.  log10 + log20 = " + c);
        multadd(a, b, c);
        //expSum();
    }

    public static double multadd(double a, double b, double c) {
        double value = a * b + c;
        System.out.println("x.  a * b + c = " + value);
        double x = value;
        double allSum = (x * Math.pow(Math.E, -x)) + (Math.sqrt(1 - Math.pow(Math.E, -x)));
        System.out.println("y.  x * e^-x + Sqrt 1 - e^-x = " + allSum);
        return value;
    }
    public static void expSum(double value) {



    }
}
