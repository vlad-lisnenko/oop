package com.lisnenko.shape;

public class Square implements Shape {

    private final int side;
    private final int perimeter;
    private final double square;

    public Square(int side) {
        this.side = side;
        perimeter = (side * 4);
        square = (side * side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
