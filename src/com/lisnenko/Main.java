package com.lisnenko;

import com.lisnenko.shape.Circle;
import com.lisnenko.shape.Shape;
import com.lisnenko.shape.Square;
import com.lisnenko.shape.Triangle;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static Random random = new Random(48);
    public static void main(String[] args) {
        Shape[] shapes = new Shape[12];
        for (int i = 0; i < shapes.length; i++){
            if(i %2 == 0) shapes[i] = new Circle(random.nextDouble()*100);
            if(i %2 == 1 && i < 6) shapes[i] = new Triangle(random.nextDouble()*100,
                    random.nextDouble()*100,
                    random.nextDouble()*100);
            else shapes[i] = new Square(random.nextDouble()*100);
        }
        Arrays.stream(shapes).forEach(shape -> System.out.println(shape.toString()));
    }
}
