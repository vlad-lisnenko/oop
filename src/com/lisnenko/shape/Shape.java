package com.lisnenko.shape;

public interface Shape {
    double getPerimeter();
    double getSquare();
    void setPerimeter(double perimeter);
    void setSquare(double square);
    @Override
    String toString();
}
