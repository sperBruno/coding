package com.jalasoft.selenium.bruno.movies;

/**
 * This is an abstract class for movies.
 */
public abstract class Movie {

    private String titleMovie;
    private int priceCode;

    /**
     * Contrucator of a movie.
     *
     * @param title     of a movie
     */
    public Movie(final String title, final int priceCode) {
        titleMovie = title;
        this.priceCode = priceCode;
    }

    /**
     * This method calculates movie amount.
     *
     * @param daysRented of a movie.
     * @return the amount.
     */
    public abstract double calculateMovieAmount(int daysRented);

    /**
     * This method gets the movie's price code.
     *
     * @return movie's price code.
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * This method sets the movie's price code.
     *
     * @param priceCode of a movie.
     */
    public void setPriceCode(final int priceCode) {
        this.priceCode = priceCode;
    }

    /**
     * this method get the title of a movie.
     *
     * @return movie's title.
     */
    public String getTitle() {
        return titleMovie;
    }
}
