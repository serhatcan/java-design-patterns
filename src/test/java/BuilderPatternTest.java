import Builder.Example1.User;
import org.junit.Test;

import static org.junit.Assert.*;

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

}
