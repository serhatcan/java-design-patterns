package hw4_2;

/**
 * Created by serhat on 27.12.2015.
 *
 * TODO: director of something should not be class, should be an instance of Manager class for example.
 */
public class DirectorOfSales implements DiscountObserver{

    public void informDiscount(int productCount) {
        if (productCount == 30) {
            // do whatever you want like sending mail to customer like
            // sendMail();
        }
    }
}
