package com.jalasoft.selenium.bruno.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class NewReleaseTest {
    private Movie movie;

    @Before
    public void setUp() {
        movie = new NewRelease("Batman");
    }

    @Test
    public void testCalculateNewReleaseMovieFor1DayRental() {
        final double expectedResult = 3;
        assertEquals(expectedResult, movie.calculateMovieAmount(1), 0);
    }

    @Test
    public void testCalculateNewReleaseMovieFor12DayRental() {
        final double expectedResult = 36;
        assertEquals(expectedResult, movie.calculateMovieAmount(12), 0);
    }

}