package com.lisnenko.shape;


public class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
        super.setPerimeter(firstSide+secondSide+thirdSide);
        super.setSquare(Math.sqrt(getPerimeter() *
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
    public double getPerimeter() { return super.getPerimeter(); }
    @Override
    public double getSquare() { return super.getSquare(); }

    @Override
    public String toString() {
        return "Triangle{" +
                " firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                super.toString() +
                '}';
    }
}
