package hw7.shape;

import java.util.Objects;

public class Shape {
    private String color = "white";

    public void calculateArea() {
        System.out.print("Area of ");
    }

    public void calculatePerimeter() {
        System.out.print("Perimeter of ");
    }

    public void paint() {
        System.out.println("Paint a shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}