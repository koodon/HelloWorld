package SessTwo;

/**
 * Created by opilane on 15.11.2016.
 */
public class Distance {
    public static void main (String [] args) {
        double dist = distance(1.0, 2.0, 4.0, 6.0);
        double dsSquare = square(1.0, 2.0, 4.0, 6.0);
        double distM = distanceM(1.0, 2.0, 4.0, 6.0);
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        return 0.0;
    }
    public static double square(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared);
        return 0.0;
    }
    public static double distanceM (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquaredM = dx * dx + dy * dy;
        double result = Math.sqrt(dsquaredM);
        System.out.println("dsquared is " + result);
        return result;
    }
}
