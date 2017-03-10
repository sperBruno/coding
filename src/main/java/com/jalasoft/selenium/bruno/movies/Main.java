package com.jalasoft.selenium.bruno.movies;

/**
 * This is the main class of movies rental.
 */
final class Main {

    /**
     * This is a private constructor.
     */
    private Main() {
    }

    /**
     * This method executes rental.
     *
     * @param args default parameter.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant", 1), 2));
        customer.addRental(new Rental(new Regular("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
