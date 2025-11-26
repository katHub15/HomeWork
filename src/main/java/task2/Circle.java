package task2;

public class Circle extends Figure{
    private double radius;

    Circle(double radius, String borderCollor, String fillCollor) {
        super(fillCollor, borderCollor);
        this.radius = radius;
        perimeter = getCircleSquare(radius);
        square = getCirclePerimeter(radius);
    }

    public double getRadius() {
        return radius;
    }
}
