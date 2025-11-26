package task2;

public interface Perimeter {
    default double getCirclePerimeter(double radius) {
        return 2 * 3.14 * radius;
    }

    default double getTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    default double getRectanglePerimeter(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }
}
