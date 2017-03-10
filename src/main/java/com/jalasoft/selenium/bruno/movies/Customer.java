package com.jalasoft.selenium.bruno.movies;

import java.util.ArrayList;
import java.util.List;

import static com.jalasoft.selenium.bruno.movies.NewRelease.NEW_RELEASE;

/**
 * This class represents a Customer.
 */
class Customer {
    private static final String BRAKE_LINE = "\n";
    private static final String TABULATION = "\t";
    private String customerName;
    private List<Rental> rentalList = new ArrayList<>();

    /**
     * Constructor of a Custumer.
     *
     * @param name of customer.
     */
    public Customer(final String name) {
        customerName = name;
    }

    /**
     * This method adds a new rental.
     *
     * @param newRental to be added.
     */
    public void addRental(final Rental newRental) {
        rentalList.add(newRental);
    }

    /**
     * This method gets the customer name.
     *
     * @return customer name.
     */
    public String getName() {
        return customerName;
    }

    /**
     * This method creates the ticket.
     *
     * @return the ticket
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + getName() + BRAKE_LINE);
        for (Rental rentals : rentalList) {
            double thisAmount;
            thisAmount = rentals.getMovie().calculateMovieAmount(rentals.getDaysRented());
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, rentals);
            result.append(TABULATION + rentals.getMovie().getTitle() + TABULATION);
            result.append(String.valueOf(thisAmount)).append(BRAKE_LINE);
            totalAmount += thisAmount;
        }
        result.append("Amount owed is " + totalAmount);
        result.append(BRAKE_LINE);
        result.append("You earned " + frequentRenterPoints);
        result.append(" frequent renter points");
        return result.toString();
    }

    /**
     * This method get the frequent renter points.
     *
     * @param frequentRenterPoints of a customer.
     * @param rentals              made by customer.
     * @return the frequent renter points.
     */
    private int getFrequentRenterPoints(final int frequentRenterPoints, final Rental rentals) {
        int count = frequentRenterPoints;
        count++;
        if ((rentals.getMovie().getPriceCode() == NEW_RELEASE)
                &&
                rentals.getDaysRented() > 1) {
            count++;
        }
        return count;
    }


}
