/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
class NewReleasePrice extends Price
{
    
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    
    int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) 
            return 2;
        else
            return 1;
    }
}
