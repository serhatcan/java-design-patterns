package hw4_2;

/**
 * Created by serhat on 27.12.2015.
 */
public class GoldCustomer extends Customer {

    @Override
    public void informDiscount(int productCount) {
        if (productCount == 100) {
            // do whatever you want like sending mail to customer like
            // sendMail();
        }
    }
}
