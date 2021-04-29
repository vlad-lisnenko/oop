package com.lisnenko.shape;

public class Trapeze implements Shape {

    private final int  firstBasis, secondBasis, firstSide, secondSide;
    private final int perimeter;
    private final double square;

    public Trapeze(int firstBasis, int secondBasis, int firstSide, int secondSide){
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        perimeter = firstBasis + secondBasis + firstSide + secondSide;
        square = (double) (firstBasis + secondBasis) / Math.abs(firstBasis - secondSide) *
                Math.sqrt((perimeter - firstBasis) * (perimeter - secondBasis) *
                        (perimeter - firstBasis - firstSide) * (perimeter - secondBasis - secondSide));
    }

    public int getFirstBasis() {
        return firstBasis;
    }

    public int getSecondBasis() {
        return secondBasis;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
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
        return "Trapeze{" +
                "firstBasis=" + firstBasis +
                ", secondBasis=" + secondBasis +
                ", firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
