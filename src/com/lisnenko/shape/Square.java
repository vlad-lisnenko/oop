package com.lisnenko.shape;

public class Square implements Shape {
    private double side;
    private double perimeter;
    private double square;

    public Square(double side){
        this.side = side;
        setSquare(side * side);
        setPerimeter(side * 4);
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

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
        return "Square{" +
                " side=" + getSide() +
                ", perimeter= " + getPerimeter() +
                ", square= " + getSquare() +
                '}';
    }
}
