package Prototype;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class Address {
    private String street;
    private String no;

    public Address() {

    }

    public Address(String street, String no) {
        this.street = street;
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
