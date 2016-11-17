package SessTwo;

/**
 * Created by opilane on 15.11.2016.
 */
public class CircleArea {
    public static void main (String [] args) {
        //double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        //System.out.println(distance(x1, y1, x2, y2));
        //System.out.println(square(x1, y1, x2, y2));
        //System.out.println(squareRoot(x1, y1, x2, y2));
        //System.out.println(calculateArea());

        double dist = distance(1.0, 2.0, 4.0, 6.0);
        double dsSquare = square(1.0, 2.0, 4.0, 6.0);
        double distM = squareRoot(1.0, 2.0, 4.0, 6.0);
        //double areaC = calculateArea();
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        return(0.0);
    }
    public static double square(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        System.out.println("d squared is " + dsquared);
        return dsquared;
    }
    public static double squareRoot (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquaredM = dx * dx + dy * dy;
        double result = Math.sqrt(dsquaredM);
        System.out.println("d square root is " + result);
        return result;
    }
    public static double circleArea(double xc, double yc, double xp, double yp) {
        double radius = distance(xc,yc,xp, yp);
        double area = calculateArea(radius);
        System.out.println("Radius is " + area);
        return area;
    }
    public static double circleAreaShort(double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area is " + result);
        return result;
    }
}

