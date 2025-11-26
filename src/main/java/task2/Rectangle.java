package task2;

public class Rectangle extends Figure {
    private double siadA;
    private double sideB;

    public Rectangle(double siadA, double sideB, String borderCollor, String fillCollor) {
        super(fillCollor, borderCollor);
        this.siadA = siadA;
        this.sideB = sideB;
        perimeter=getRectanglePerimeter(siadA,sideB);
        square=getRectangleSquare(siadA,sideB);
    }

    public double getSiadA() {
        return siadA;
    }

    public double getSideB() {
        return sideB;
    }
}

