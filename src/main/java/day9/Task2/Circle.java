package day9.Task2;

public class Circle extends Figure {
    int radius;
    double Pi = 3.1415926535897932384626433832795;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Pi * (Math.pow(radius, 2)));
    }

    @Override
    public double perimeter() {
        return (2 * Pi * radius);
    }
}
