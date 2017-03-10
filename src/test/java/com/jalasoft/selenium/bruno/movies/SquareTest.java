package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.shape.Rectangle;
import com.jalasoft.selenium.bruno.shape.Shape;
import org.junit.Test;

import static com.jalasoft.selenium.bruno.movies.RectangleTest.FIVE;
import static com.jalasoft.selenium.bruno.movies.RectangleTest.SIX;
import static com.jalasoft.selenium.bruno.movies.RectangleTest.ONE;
import static com.jalasoft.selenium.bruno.movies.RectangleTest.DELTA;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class SquareTest {


    private Shape rectangle;

    /**
     * This test verifies if square area is 30.
     */
    @Test
    public void tetsCalculateAreaWhen() {

        //Given
        rectangle = new Rectangle(FIVE, SIX);

        //When
        final double actualArea = rectangle.calculateArea();
        final double expectedArea = 30;

        //then

        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * This test verifies if square perimeter is 30.
     */
    @Test
    public void testCalculatePerimeterWhen() {

        //Given
        rectangle = new Rectangle(ONE, SIX);

        //When
        final double actualPerimeter = rectangle.calculateArea();
        final double expectePerimeter = 30;

        //then
        assertEquals(expectePerimeter, actualPerimeter, DELTA);
    }
}
