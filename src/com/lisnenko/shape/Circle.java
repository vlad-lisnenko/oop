package com.lisnenko.shape;

public class Circle extends Shape {
    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        super.setSquare(PI * radius * radius);
        super.setPerimeter(2 * PI * radius);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getPerimeter() { return super.getPerimeter(); }
    @Override
    public double getSquare() { return super.getSquare(); }
    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                super.toString() +
                '}';
    }
}

