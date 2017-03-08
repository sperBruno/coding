package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.shape.Shape;

/**
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Rectangle implements Shape {
    protected final int base;
    protected final int altura;

    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculateArea() {
        return this.base * this.altura;
    }

    public double calculatePerimeter() {
        return 2 * (this.base * this.altura);
    }
}
