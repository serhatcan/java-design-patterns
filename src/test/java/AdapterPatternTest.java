import Adapter.Account;
import Adapter.AccountAdapter;
import Adapter.Copyable;
import Adapter.Utility;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

/**
 * Created by Serhat CAN on 22.11.2015.
 *
 * Question
 * Consider a utility class that has a copy() method which can make a copy of a vector excluding those objects
 * that meet a certain criteria. To accomplish this, the method assumes that all objects in the vector implement
 * the Copyable interface providing the isCopyable() method to determine if the object should be copied or not.
 * In our system we have a Account class which does not implement the Copyable interface. We want to be able perform
 * a selective copy of a vector of Account objects. The Account class contains an isValid() method that we can
 * use to determine whether or not the Account object should be copied. In the mean time, we do not want to modify
 * the Account class at all.
 */
public class AdapterPatternTest {

    @Test
    public void hw3_1_test() {

        Vector<Copyable> vector = new Vector<Copyable>();

        AccountAdapter accountAdapter = new AccountAdapter(new Account("1", "Serhat", true));
        AccountAdapter accountAdapter1 = new AccountAdapter(new Account("2", "Can", false));
        AccountAdapter accountAdapter2 = new AccountAdapter(new Account("3", "Ömer", true));

        vector.add(accountAdapter);
        vector.add(accountAdapter1);
        vector.add(accountAdapter2);

        Vector copiedVector = Utility.copy(vector);

        assertEquals(vector.size(), 3);
        assertEquals(copiedVector.size(), 2);
    }

}
