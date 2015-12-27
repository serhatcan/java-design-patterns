package hw4_2;

import java.util.List;

/**
 * Created by serhat on 27.12.2015.
 */
public class Product {

    private List<DiscountObserver> observers;

    public void sell() {
        // do operations and inform
        // get product count
        notifyAllObservers(10);
    }

    public void attachObservers(DiscountObserver observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(int productCount) {
        for(DiscountObserver observer: observers) {
            observer.informDiscount(productCount);
        }
    }
}
