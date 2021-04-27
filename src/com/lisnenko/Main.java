package com.lisnenko;

import com.lisnenko.shape.Circle;
import com.lisnenko.shape.Shape;
import com.lisnenko.shape.Square;
import com.lisnenko.shape.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(23.4);
        Square square = new Square(12.0);
        Triangle triangle = new Triangle(2, 3, 4);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        shapes.stream().forEach(shape -> System.out.println(shape.getPerimeter() + shape.getSquare()));
    }
}
