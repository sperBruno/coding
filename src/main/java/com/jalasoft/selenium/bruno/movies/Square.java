package com.jalasoft.selenium.bruno.movies;

/**
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Square extends Rectangle {
    public Square(final int lado) {
        super(lado, lado);
    }

    public double calculatePerimeter() {
        return 2 * this.altura + this.base;
    }


}
