package Methods;

/**
 * Created by Joke on 25.10.2016.
 */
public class InvokeMath {
    public static void main(String[] args) {
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println("Square root of: " + root + "\nSine of 1.5: " + height);

        double degrees = 90;
        double angleD = degrees / 180.0 * Math.PI;
        System.out.println("90 degrees to radians: " + angleD);

        double radiansT = Math.toRadians(180.0);
        double degreesT = Math.toDegrees(Math.PI);
        System.out.println("180.0 to radians: " + radiansT + "\nPI to degrees: " + degreesT);

        long x = Math.round(Math.PI * 20.0);
        System.out.println("PI * 2.0 = " + x + " (rounded)");

        double y = Math.cos(angle + Math.PI / 2.0);
        System.out.println("cos (1.5 + PI / 2.0) = " + y);

        double z = Math.exp(Math.log(10.0));                //?! lk 51/69
        System.out.println("Exp(log 10.0) = " + z);

        double w = Math.pow(2.0, 10.0);                     //2 astmel 10
        System.out.println("Base 2.0 exponent 10.0 = " + w);

    }
}
