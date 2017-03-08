package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.shape.Shape;

import static java.lang.Math.PI;

/**
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Circle implements Shape {
    private final double ratio;

    public Circle(final double ratio) {
        this.ratio = ratio;
    }

    public double calculateArea() {
        return PI * Math.pow(ratio, 2);
    }

    public double calculatePerimeter() {
        return PI * Math.pow(ratio, 2);
    }
}
