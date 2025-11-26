package task2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    Triangle(double sideA, double sideB, double sideC, double height,String borderCollor,String fillCollor) {
        super(fillCollor,borderCollor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        perimeter=getTrianglePerimeter(sideA,sideB,sideC);
        square=getTriangleSquare(sideC,height);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getHeight() {
        return height;
    }
}
