package com.lisnenko.shape;

public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side = side;
        super.setSquare(side * side);
        super.setPerimeter(side * 4);
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public double getPerimeter() { return super.getPerimeter(); }

    @Override
    public double getSquare() { return super.getSquare(); }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                super.toString() +
                '}';
    }
}
