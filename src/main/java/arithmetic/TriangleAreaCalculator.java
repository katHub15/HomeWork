package arithmetic;

public class TriangleAreaCalculator {

    public static double area(double a, double h) {
        if (a <= 0 || h <= 0) throw new IllegalArgumentException("Invalid values");
        return 0.5 * a * h;
    }
}
