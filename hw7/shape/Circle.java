package hw7.shape;

import java.util.Objects;

public class Circle extends Shape {

    // coordinates of the circle's center
    double x1 = 2.0;
    double y1 = 3.0;

    // coordinates of a point on the circumference
    double x2 = 5.0;
    double y2 = 3.0;

    public Circle() {
        super();
        this.setColor("pink");
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(calculateRadius(), 2);

        System.out.println("Area of circle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * calculateRadius();

        System.out.println("Perimeter of circle is: " + perimeter);
    }

    private double calculateRadius() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public void paint() {
        System.out.println("Paint a circle");
    }

    @Override
    public String toString() {
        return "Circle coordinate{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        super.equals(o);
        return Double.compare(circle.x1, x1) == 0 &&
                Double.compare(circle.y1, y1) == 0 &&
                Double.compare(circle.x2, x2) == 0 &&
                Double.compare(circle.y2, y2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}
