package Builder.Example2.builder;

import Builder.Example2.view.AddressView;
import Builder.Example2.view.PeopleAddressView;

import java.util.Map;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class PeopleViewBuilder implements ViewBuilder{

    private AddressView addressView;

    public PeopleViewBuilder() {
        addressView = new PeopleAddressView();
    }

    public AddressView build() {
        return this.addressView;
    }

    public void addEmailAddress(String emailAddress) {
        addressView.setEmailAddress(emailAddress);
    }

    public void addFirstName(String firstName) {
        addressView.setFirstName(firstName);
    }

    public void addLastName(String lastName) {
        addressView.setLastName(lastName);
    }

    public void addCompany(String company) {
        addressView.setCompany(company);
    }

    public void addPhoneNumber(String phoneNumber) {
        addressView.setPhoneNumber(phoneNumber);
    }

    public void addName(String name) {

    }

    public void addPurpose(String purpose) {

    }

    public void addMembers(Map<String, String> members) {

    }


}
