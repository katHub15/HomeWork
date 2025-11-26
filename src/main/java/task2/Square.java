package task2;

public interface Square {

    default double getCircleSquare(double radius) {
        return  Math.PI * (radius * 2);
    }

    default double getTriangleSquare(double base, double height) {
        return (base * height) / 2;
    }

    default double getRectangleSquare(double length, double width) {
        return length * width;
    }
}
