package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class SquareTest {

    private final double DELTA = 0;

    private Shape rectangle;


    @Test
    public void tetsCalculateAreaWhen() {

        //Given
        rectangle = new Rectangle(5, 6);

        //When
        final double actualArea = rectangle.calculateArea();
        final double expectedArea = 30;

        //then

        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testCalculatePerimeterWhen() {

        //Given
        rectangle = new Rectangle(1, 6);

        //When
        final double actualPerimeter = rectangle.calculateArea();
        final double expectePerimeter = 30;

        //then
        assertEquals(expectePerimeter, actualPerimeter, DELTA);
    }
}