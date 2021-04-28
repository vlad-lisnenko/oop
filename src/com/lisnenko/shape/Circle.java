package com.lisnenko.shape;

public class Circle implements Shape {
    public static final double PI = 3.14;
    private double radius;
    private double perimeter;
    private double square;

    public Circle(double radius){
        this.radius = radius;
        setSquare(PI * radius * radius);
        setPerimeter(2 * PI * radius);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getPerimeter() { return perimeter; }
    @Override
    public double getSquare() { return square; }
    @Override
    public void setPerimeter(double perimeter) { this.perimeter = perimeter; }
    @Override
    public void setSquare(double square) { this.square = square; }
    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + getRadius() +
                ", perimeter= " + getPerimeter() +
                ", square= " + getSquare() +
                '}';
    }
}

