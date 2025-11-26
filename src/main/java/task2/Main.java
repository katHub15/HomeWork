package task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "черный", "желтый");
        Triangle triangle = new Triangle(4, 2, 9, 8, "оранжевый", "белый");
        Rectangle rectangle = new Rectangle(4, 5, "зеленый", "красный");
        System.out.println("Информация о круге:");
        circle.display();
        System.out.println("Информация о треугольнике:");
        triangle.display();
        System.out.println("Информация о прямоугольнике:");
        rectangle.display();
    }
}
