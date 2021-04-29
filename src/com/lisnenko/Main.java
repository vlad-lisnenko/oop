package com.lisnenko;

import com.lisnenko.shape.Trapeze;
import com.lisnenko.shape.Shape;
import com.lisnenko.shape.Square;
import com.lisnenko.shape.Triangle;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random(48);

    public static void main(String[] args) {

        Shape[] shapes = new Shape[12];

        for (int i = 0; i < shapes.length; i++) {
            if(i < 4 ) {
                shapes[i] = new Trapeze(RANDOM.nextInt(31) + 30, RANDOM.nextInt(30),
                        RANDOM.nextInt(31) + 20, RANDOM.nextInt(30));
            }else if(i < 8) {
                shapes[i] = new Triangle(RANDOM.nextInt(50),
                        RANDOM.nextInt(50),
                        RANDOM.nextInt(50));
            }
            else shapes[i] = new Square(RANDOM.nextInt(50));
        }

        Arrays.stream(shapes).forEach(shape -> System.out.println(shape.toString()));
    }
}
