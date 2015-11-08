package Builder.Example2.builder;

import Builder.Example2.entity.GroupAddress;
import Builder.Example2.entity.PeopleAddress;
import Builder.Example2.view.AddressView;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class ViewConstructor {

    public static AddressView buildPeopleView(PeopleAddress peopleAddress, ViewBuilder viewBuilder) {
        viewBuilder.addCompany(peopleAddress.getCompany());
        viewBuilder.addEmailAddress(peopleAddress.getEmailAddress());
        viewBuilder.addFirstName(peopleAddress.getFirstName());
        viewBuilder.addLastName(peopleAddress.getLastName());
        viewBuilder.addPhoneNumber(peopleAddress.getPhoneNumber());
        return viewBuilder.build();
    }

    public static AddressView buildGroupView(GroupAddress groupAddress, ViewBuilder viewBuilder) {
        viewBuilder.addEmailAddress(groupAddress.getEmailAddress());
        viewBuilder.addName(groupAddress.getName());
        viewBuilder.addPhoneNumber(groupAddress.getPurpose());
        viewBuilder.addMembers(groupAddress.getMembers());
        viewBuilder.addPurpose(groupAddress.getPurpose());
        return viewBuilder.build();
    }
}
