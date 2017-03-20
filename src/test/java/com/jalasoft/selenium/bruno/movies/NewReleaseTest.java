package com.jalasoft.selenium.bruno.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class NewReleaseTest {
    private Movie movie;

    /**
     * This test will be used as a setup for new release tests.
     */
    @Before
    public void setUp() {
        movie = new NewRelease("Batman");
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateNewReleaseMovieFor1DayRental() {
        final double expectedResult = 3;
        assertEquals(expectedResult, movie.calculateMovieAmount(1), 0);
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateNewReleaseMovieFor12DayRental() {
        final double expectedResult = 36;
        assertEquals(expectedResult, movie.calculateMovieAmount(12), 0);
    }
}
