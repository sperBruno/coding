package com.jalasoft.selenium.bruno.movies;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class Childrens  extends Movie {

    public static final int CHILDRENS_CODE = 2;

    /**
     * Constructor for childrens movies.
     * @param titleMovie for childrens movies.
     */
    public Childrens(final String titleMovie) {
        super(titleMovie, CHILDRENS_CODE);
    }

    /**
     * This method will calculate movie amount.
     * @param daysRented of a childrens movies.
     * @return the movie amount
     */
    @Override
    public double calculateMovieAmount(final int daysRented) {
        final double movieCost = 1.5;
        final int movieDiscount = 3;
        return  (daysRented > movieDiscount) ?  (daysRented - movieDiscount) * movieCost : movieCost;
    }
}
