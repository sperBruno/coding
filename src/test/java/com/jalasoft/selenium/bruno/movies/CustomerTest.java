package com.jalasoft.selenium.bruno.movies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class CustomerTest {
    /**
     * This method will verify that all rentals are saved.
     */
    @Test
    public void testCustomerCanBeAddMovieInList() {
        Customer customer = new Customer("Juan");
        customer.addRental(new Rental(new Regular("Rocky"), 30));
        customer.addRental(new Rental(new Regular("Rocky II"), 30));
        customer.addRental(new Rental(new NewRelease("Rocky III"), 30));
        final int expectedResult = 3;
        assertEquals(expectedResult, customer.getRentalList().size());
    }

}