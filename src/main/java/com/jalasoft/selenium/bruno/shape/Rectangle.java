package com.jalasoft.selenium.bruno.shape;

/**
 * This class represents a Rectangle.
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Rectangle implements Shape {
    protected final int base;
    protected final int altura;

    /**
     * This the constructor of a Rectangle.
     *
     * @param sideA of a rectangle.
     * @param sideB of a rectangle.
     */
    public Rectangle(final int sideA, final int sideB) {
        this.base = sideA;
        this.altura = sideB;
    }

    /**
     * Calculate rectangle area.
     *
     * @return area
     */
    public double calculateArea() {
        return this.base * this.altura;
    }

    /**
     * Calculate parameter.
     *
     * @return perimeter
     */
    public double calculatePerimeter() {
        return 2 * (this.base * this.altura);
    }
}
