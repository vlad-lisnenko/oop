package com.lisnenko.shape;

public class Triangle implements Shape {
    private int firstSide, secondSide, thirdSide;
    private int perimeter;
    private double square;

    public Triangle(int firstSide, int secondSide, int thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        perimeter = (firstSide+secondSide+thirdSide);
        square = (Math.sqrt(getPerimeter() * (getPerimeter()-firstSide) *
                (getPerimeter()-secondSide) * (getPerimeter() - thirdSide)));
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
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
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
