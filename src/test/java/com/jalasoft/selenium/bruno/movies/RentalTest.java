package com.jalasoft.selenium.bruno.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class RentalTest {
    /**
     * This test will calculate rental creation.
     */
    @Test
    public void TestRentalCanBeCreatedWith2ParametersMovieAndRentalDay() {

        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, 1);
        Assert.assertTrue(rental instanceof Rental);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalCanBeCreatedWithParameters() {
        Movie newMovie = new Regular("Rocky");
        Rental rental = new Rental(newMovie, 1);
        Assert.assertNotNull(rental);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalCreateWithMovieandRentalDayShouldReturnThem() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, 2);
        int daysRental = 2;
        assertEquals(daysRental, rental.getDaysRented());

    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, 1);
        int daysRental = 1;
        assertEquals(daysRental, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeRegularMovie() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 1;
        assertEquals(expectedResult, rental.getDaysRented(), 0);
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeRegularPriceWhitRentalMoreThat4Day() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, 9);
        double expectedResult = 10.5;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(9), 0);
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeNewReleasePrice() {
        Movie movie = new NewRelease("Rocky");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 3;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(1), 0);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeNewReleasePriceWhitRentalMoreThat4Day() {
        Movie movie = new NewRelease("Rocky");
        Rental rental = new Rental(movie, 5);
        double expectedResult = 12;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(4), 0);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChildrenPrice() {
        Movie movie = new Childrens("Lion King");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 1.5;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(1), 0);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChildrenPriceWhitRentalMoreThat3Days() {
        Movie movie = new Childrens("Lion King");
        Rental rental = new Rental(movie, 5);
        double expectedResult = 3.0;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(5), 0);
    }


}