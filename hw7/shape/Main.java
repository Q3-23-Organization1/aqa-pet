package hw7.shape;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Shape[] shapes = {triangle, rectangle, circle};

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.paint();
            System.out.println(shape);
            System.out.println("-----");
        }
    }
}