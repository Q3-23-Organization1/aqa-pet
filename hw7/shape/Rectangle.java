package hw7.shape;

import java.util.Objects;

public class Rectangle extends Shape {

    private double x1 = -2.4;
    private double x2 = -2.12;
    private double y1 = 4.12;
    private double y2 = 4.4;

    @Override
    public void calculateArea() {
        double area = Math.abs((x2 - x1) * (y2 - y1));

        System.out.println("Area of rectangle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));

        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    @Override
    public void paint() {
        System.out.println("Paint a rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle coordinate{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        super.equals(o);
        return Double.compare(rectangle.x1, x1) == 0 &&
                Double.compare(rectangle.x2, x2) == 0 &&
                Double.compare(rectangle.y1, y1) == 0 &&
                Double.compare(rectangle.y2, y2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x1, x2, y1, y2);
    }
}
