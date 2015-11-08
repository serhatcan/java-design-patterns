package Builder.Example2;

import Builder.Example2.builder.GroupViewBuilder;
import Builder.Example2.builder.PeopleViewBuilder;
import Builder.Example2.builder.ViewBuilder;
import Builder.Example2.builder.ViewConstructor;
import Builder.Example2.entity.Address;
import Builder.Example2.entity.GroupAddress;
import Builder.Example2.entity.PeopleAddress;
import Builder.Example2.view.AddressView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class AddressBook {

    private List<Address> addresses = new ArrayList<Address>();

    public AddressBook() {

    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void click(int addressIndex) {
        Address address = addresses.get(addressIndex);

        AddressView addressView = null;

        if (address instanceof PeopleAddress) {
            ViewBuilder viewBuilder = new PeopleViewBuilder();
            addressView = ViewConstructor.buildPeopleView((PeopleAddress) address, viewBuilder);
        } else if (address instanceof GroupAddress) {
            ViewBuilder viewBuilder = new GroupViewBuilder();
            addressView = ViewConstructor.buildGroupView((GroupAddress) address, viewBuilder);
        } else {
            System.out.println("Not known type");
        }

        addressView.display();
    }
}
