package day9.Task2;

import com.sun.org.apache.bcel.internal.generic.FieldGen;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        figures[0] = new Triangle(10, 10, 10, "Red");
        figures[1] = new Triangle(10, 20, 30, "Green");
        figures[2] = new Triangle(10, 20, 15, "Red");
        figures[3] = new Rectangle(5, 10, "Red");
        figures[4] = new Rectangle(40, 15, "Orange");
        figures[5] = new Circle(4, "Red");
        figures[6] = new Circle(10, "Red");
        figures[7] = new Circle(5, "Blue");
        System.out.println("Периметр фигур: " + calculateRedPerimeter(figures));
        System.out.println("Площадь фигур: " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeterRed = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sumPerimeterRed = sumPerimeterRed + figure.perimeter();
            }
        }
        return sumPerimeterRed;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumAreaRed = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sumAreaRed = sumAreaRed + figure.area();
            }
        }
        return sumAreaRed;
    }
}