package ua.mainacaademy;

import ua.mainacaademy.model.Circle;
import ua.mainacaademy.model.Shape;
import ua.mainacaademy.model.Square;
import ua.mainacaademy.model.Triangle;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(31);
        Circle circle3 = new Circle(25);
        Circle circle4 = new Circle(11);

        Square square1 = new Square(20);
        Square square2 = new Square(13);
        Square square3 = new Square(17);
        Square square4 = new Square(33);

        Triangle triangle1 = new Triangle(45,46);
        Triangle triangle2 = new Triangle(32,21);
        Triangle triangle3 = new Triangle(42,28);
        Triangle triangle4 = new Triangle(35,76);

        TreeSet<Shape> sortedShapeSet= new TreeSet<>();

        sortedShapeSet.add(circle1);
        sortedShapeSet.add(circle3);
        sortedShapeSet.add(circle4);
        sortedShapeSet.add(square3);
        sortedShapeSet.add(square2);
        sortedShapeSet.add(square4);
        sortedShapeSet.add(triangle1);
        sortedShapeSet.add(triangle3);
        sortedShapeSet.add(triangle4);
        sortedShapeSet.add(triangle2);
        sortedShapeSet.add(circle2);
        sortedShapeSet.add(square1);

        System.out.println("Lowest area is " + sortedShapeSet.first().getArea() + " and has name " +sortedShapeSet.first().getClass().getSimpleName());
        System.out.println("Biggest area is " + sortedShapeSet.last().getArea() + " and has name " +sortedShapeSet.last().getClass().getSimpleName());
    }
}
