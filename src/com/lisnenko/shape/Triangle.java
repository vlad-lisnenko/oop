package com.lisnenko.shape;


public class Triangle implements Shape {
    private double firstSide, secondSide, thirdSide;
    private double perimeter;
    private double square;
    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
        setPerimeter(firstSide+secondSide+thirdSide);
        setSquare(Math.sqrt(getPerimeter() *
                (getPerimeter()-firstSide) *
                (getPerimeter()-secondSide) *
                (getPerimeter() - thirdSide)));
    }

    public double getFirstSide() { return firstSide;}
    public void setFirstSide(float firstSide) { this.firstSide = firstSide; }
    public double getSecondSide() { return secondSide; }
    public void setSecondSide(float secondSide) { this.secondSide = secondSide; }
    public double getThirdSide() { return thirdSide; }
    public void setThirdSide(float thirdSide) { this.thirdSide = thirdSide; }
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
        return "Triangle{" +
                " firstSide=" + getFirstSide() +
                ", secondSide=" + getSecondSide() +
                ", thirdSide=" + getThirdSide() +
                ", perimeter= " + getPerimeter() +
                ", square= " + getSquare() +
                '}';
    }
}
