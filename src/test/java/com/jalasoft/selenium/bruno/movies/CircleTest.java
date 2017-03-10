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

    /**
     * This is a setup for circle tests.
     */
    @Before
    public void setUp() {
        //Given
        final int ratio = 5;
        Shape circle = new Circle(ratio);
    }

    /**
     * This test verifies if an area is 10.
     */
    @Test
    public void testCalculateAreaWhen() {

        //When
        final double actualArea = circle.calculateArea();

        //then
        final double expectedArea = 10;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * This test verifies if a perimeter is 10.
     */
    @Test
    public void testCalculatePerimeterWhen() {

        //When
        final double actualPerimeter = circle.calculateArea();

        //then
        final double expectedPerimeter = 10;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

    /**
     * This test verifies if circle area is 0.
     */
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

    /**
     * This test verifies of a circle perimeter is cero.
     */
    @Test
    public void testCalculatePerimeterWhenPerimeterIsCero() {
        circle = new Circle(0);
        final int expectedPerimeter = 0;
        final double actualPerimeter = circle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}
