package Builder.Example2.builder;

import Builder.Example2.view.AddressView;

import java.util.Map;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public interface ViewBuilder {

    AddressView build();

    void addEmailAddress(String emailAddress);

    void addFirstName(String firstName);
    void addLastName(String lastName);
    void addCompany(String company);
    void addPhoneNumber(String phoneNumber);

    void addName(String name);
    void addPurpose(String purpose);
    void addMembers(Map<String, String> members);
}
