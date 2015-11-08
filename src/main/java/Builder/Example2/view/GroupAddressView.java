package Builder.Example2.view;

import java.util.Map;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class GroupAddressView extends AddressView {

    @Override
    public void display() {
        System.out.println("Group address view: ");
        System.out.println("Email: " + super.getEmailAddress());
        System.out.println("Company: " + super.getName());
        System.out.println("Purpose: " + super.getPurpose());
        System.out.println("Members:");
        Map<String, String> members = super.getMembers();
        for(String key: members.keySet()) {
            System.out.println("Name: " + members.get(key) + ", email: " + key);
        }
    }
}
