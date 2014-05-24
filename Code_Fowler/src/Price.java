/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
abstract class Price
{
    
    abstract int getPriceCode();
    
    abstract double getCharge(int daysRented);
    
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
