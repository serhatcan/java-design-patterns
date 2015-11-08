package Builder.Example2.builder;

import Builder.Example2.view.AddressView;
import Builder.Example2.view.GroupAddressView;

import java.util.Map;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class GroupViewBuilder implements ViewBuilder {

    private AddressView addressView;

    public GroupViewBuilder() {
        addressView = new GroupAddressView();
    }

    public AddressView build() {
        return this.addressView;
    }

    public void addEmailAddress(String emailAddress) {
        addressView.setEmailAddress(emailAddress);
    }

    public void addFirstName(String firstName) {

    }

    public void addLastName(String lastName) {

    }

    public void addCompany(String company) {

    }

    public void addPhoneNumber(String phoneNumber) {

    }

    public void addName(String name) {
        addressView.setName(name);
    }

    public void addPurpose(String purpose) {
        addressView.setPurpose(purpose);
    }

    public void addMembers(Map<String, String> members) {
        addressView.setMembers(members);
    }

}
