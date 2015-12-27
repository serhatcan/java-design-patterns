package hw4_2;

/**
 * Created by serhat on 27.12.2015.
 */
public abstract class Customer implements DiscountObserver {

    public abstract void informDiscount(int productCount);
}
