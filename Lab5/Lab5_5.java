package Lab5;

import java.util.Scanner;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Lab5_5 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        double circleRadius = inputReader.nextDouble();
        double rectangleWidth = inputReader.nextDouble();
        double rectangleHeight = inputReader.nextDouble();

        Shape circleObject = new Circle("Circle", circleRadius);
        Shape rectangleObject = new Rectangle("Rectangle", rectangleWidth, rectangleHeight);

        Shape[] shapeArray = { circleObject, rectangleObject };

        for (Shape currentShape : shapeArray) {
            System.out.println(currentShape.calculateArea());
        }

        inputReader.close();
    }
}
