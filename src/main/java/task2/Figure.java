package task2;

public abstract class Figure implements Square,Perimeter {
    protected String fillColor;
    protected String borderColor;
    protected double perimeter;
    protected double square;

    Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void display() {
        System.out.println("Периметр:" + perimeter + " Площадь: " + square +
                " Цвет заливки:" + fillColor + " Цвет границы: " + borderColor);
    }
}
