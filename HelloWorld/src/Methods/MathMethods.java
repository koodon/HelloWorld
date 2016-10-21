package Methods;

/**
 * Created by opilane on 21.10.2016.
 */
        //no need to to import, can use Math methods or invoke:
public class MathMethods {
    public static void main(String[] args) {
        double root = Math.sqrt(17.0);                          //square root
        System.out.println(root + " square root.");
        double angle = 1.5;
        System.out.println(angle + " angle.");
        double height = Math.sin(angle);                       //sine of 1.5
        System.out.println(height + " sine of angle.");
        double degrees = 90;
        double angleD = degrees / 180.0 * Math.PI;
        System.out.println(angleD + " degrees.");
        double radians = Math.toRadians(180.0);
        System.out.println(radians + " radians.");
        double degreesR = Math.toDegrees(Math.PI);
        System.out.println(degreesR + " degrees.");
        long x = Math.round(Math.PI * 20.0);
        System.out.println("PI * 20 = " + x + " round.");
        double y = Math.cos(angle + Math.PI / 2.0);
        System.out.println(y + " divide PI by 2, add result to angle and sum of cos.");
        double z = Math.exp(Math.log(10.0));
        System.out.println(z + " log base e and raise e to that power.");
        double p = Math.pow(2.0, 10.0);
        System.out.println(p + " raise first to the power of 2nd.");

    }
}
