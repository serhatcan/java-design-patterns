package hw4_2;

/**
 * Created by serhat on 27.12.2015.
 */
public class Client {

    public static void main(String[] args) {
        Product products = new Product();
        GoldCustomer goldCustomer = new GoldCustomer();
        products.attachObservers(goldCustomer);
        products.sell(); // will notify goldCustomer
    }
}
