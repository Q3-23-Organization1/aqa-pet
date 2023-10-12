package hw7.shape;

import java.util.Objects;

public class Triangle extends Shape {
    private double x1 = 1;
    private double x2 = 8;
    private double x3 = 10;
    private double y1 = 4;
    private double y2 = 10;
    private double y3 = 3;

    public Triangle() {
        super();
        this.setColor("black");
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double area = 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));

        System.out.println("triangle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double perimeter = d1 + d2 + d3;

        System.out.println("triangle is: " + perimeter);
    }

    @Override
    public void paint() {
        System.out.println("Paint a triangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        super.equals(o);
        return Double.compare(triangle.x1, x1) == 0 && Double.compare(triangle.x2, x2) == 0 &&
                Double.compare(triangle.x3, x3) == 0 && Double.compare(triangle.y1, y1) == 0 &&
                Double.compare(triangle.y2, y2) == 0 && Double.compare(triangle.y3, y3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2, x3, y1, y2, y3);
    }

    @Override
    public String toString() {
        return "Triangle coordinate{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                "} " + super.toString();
    }
}
