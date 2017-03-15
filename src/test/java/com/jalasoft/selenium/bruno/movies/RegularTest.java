package com.jalasoft.selenium.bruno.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class RegularTest {
    private Movie movie;

    @Before
    public void setUp() {
        movie = new NewRelease("Rocky I");
    }

    @Test
    public void testCalculateRegularMovieFor1DayRental() {
        final double expectedResult = 3;
        assertEquals(expectedResult, movie.calculateMovieAmount(1), 0);
    }

    @Test
    public void testCalculateRegularMovieFor9DayRental() {
        final double expectedResult = 27;
        assertEquals(expectedResult, movie.calculateMovieAmount(9), 0);
    }

}