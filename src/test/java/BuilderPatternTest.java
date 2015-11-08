import Builder.Example1.User;
import Builder.Example2.AddressBook;
import Builder.Example2.entity.GroupAddress;
import Builder.Example2.entity.PeopleAddress;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class BuilderPatternTest {

    @Test
    public void example1Test() {

        User user = new User.UserBuilder("1800000", "Serhat")
                .setAddress("Address Street etc")
                .build();

        assertEquals(user.getId(), "1800000");
        assertEquals(user.getAge(), 0); // primitive int initializes to 0, not null!
    }


    /**
     * In an address book, there are both people and groups of people addresses.
     * When the user clicks on a person she gets one display and when she clicks on a group she gets the other display.
     Each E-mail addresses are kept in an object called an Address.
     PeopleAddress and groupAddress are derived from this base class.
     Depending on which type of Address object we click on, we’d like to see a somewhat different display of that object’s properties.
     •	 The display for the address book for People screen has places for first and last name, company,
     E-mail address and phone number.
     •	 On the other hand a group address page, we’d like to see the name of the group, its purpose,
     and a list of members and their E-mail addresses.
     We want you to use the builder pattern to handle this different display logics. Your
     Builder class needs to generate a view that depends on the type of Address object to
     be displayed, and yet have the same methods for returning the results.

     - Please give your solution with a UML class diagram explicitly indicating the
     pattern participants. Your diagram should have notes that show the pattern usage

     */
    @Test
    public void example2Test() {

        PeopleAddress peopleAddress1 = new PeopleAddress.PeopleAddressBuilder()
                .emailAddress("serhat.can@metu.edu.tr")
                .company("ICterra")
                .firstName("Serhat")
                .lastName("Can")
                .phoneNumber("123123123")
                .build();

        Map<String, String> groupMembers1 = new HashMap<String, String>();
        groupMembers1.put("serhat.can@metu.edu.tr", "Serhat CAN");
        groupMembers1.put("omer.can@metu.edu.tr", "Omer CAN");

        GroupAddress groupAddress1 = new GroupAddress.GroupAddressBuilder()
                .emailAddress("groupaddress@gmail.com")
                .purpose("To help children")
                .name("Losev")
                .members(groupMembers1)
                .member("julide@metu.edu.tr", "Julide Hulya") // instead of creating your own map, lets allow builder to do that
                .build();

        AddressBook addressBook = new AddressBook();
        addressBook.addAddress(peopleAddress1);
        addressBook.addAddress(groupAddress1);

        // now simulate that user clicked second element (index 1) which is a groupAddress
        addressBook.click(1);

        // now simulate that user clicked first element (index 0) which is a peopleAddress
        addressBook.click(0);
    }

}
