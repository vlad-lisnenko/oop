package com.lisnenko.shape;

public class Shape {
     private double perimeter = 0;
     private double square = 0.f;

     public double getPerimeter(){return perimeter;}
     public double getSquare(){return square;}
     protected void setPerimeter(double p) { perimeter = p;}
     protected void setSquare(double s) { square = s;}
     @Override
     public String toString() {
          return " perimeter=" + perimeter +
                  ", square=" + square;
     }
}
