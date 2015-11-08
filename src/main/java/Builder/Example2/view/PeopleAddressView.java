package Builder.Example2.view;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class PeopleAddressView extends AddressView {

    @Override
    public void display() {
        System.out.println("People address view");
        System.out.println("Email: " + super.getEmailAddress());
        System.out.println("First name: " + super.getFirstName());
        System.out.println("Last name: " + super.getLastName());
        System.out.println("Email: " + super.getPhoneNumber());
    }

}
