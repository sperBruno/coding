package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.shape.Circle;
import com.jalasoft.selenium.bruno.shape.Shape;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This a test for Circle.
 * Created by Bruno Barrios on 3/3/2017.
 */
public class CircleTest {

    private static final int DELTA = 0;

    private Shape circle;

    @Before
    public void setUp() {
        //Given
        final int ratio = 5;
        Shape circle = new Circle(ratio);
    }

    @Test
    public void tetstCalculateAreaWhen() {

        //When
        final double actualArea = circle.calculateArea();

        //then
        final double expectedArea = 10;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testCalculatePerimeterWhen() {


        //When
        final double actualPerimeter = circle.calculateArea();

        //then
        final double expectedPerimeter = 10;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

    @Test
    public void testCalculateAreaWhenRatioIsCero() {
        //Given
        circle = new Circle(0);

        //when
        final double actualArea = circle.calculateArea();
        final int expectedArea = 0;
        //Then
        assertEquals(expectedArea, actualArea, DELTA);

    }

    @Test
    public void test_calculatePerimeter_WhenPerimeterIsCero() {

        circle = new Circle(0);
        final int expectedPerimeter = 0;
        final double actualPerimeter = circle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}