package SessTwo;

/**
 * Created by opilane on 15.11.2016.
 */
public class CalculateArea {
    public static void main(String[] args) {
        calculateArea(4);
        distance(2, 4, 4, 2);
        circleArea(4, 2, 4, 2);
    }
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("one " + result);
        return result;
    }
    public static double circleArea(double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        System.out.println("two " + area);
        return area;
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        return 0.0;
    }
}
