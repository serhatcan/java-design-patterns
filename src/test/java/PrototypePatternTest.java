import Prototype.EmployeeFactory;
import Prototype.Instructor;
import Prototype.Secretary;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class PrototypePatternTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {

        Secretary secretary = new Secretary("2", "Secretary", "Secretary Street", "5");
        Secretary clonedSecretary = (Secretary) secretary.clone();

        assertNotEquals(secretary, clonedSecretary);
        assertEquals(secretary.getEmployeeId(), clonedSecretary.getEmployeeId());
        assertEquals(secretary.getName(), clonedSecretary.getName());

        System.out.println("Prototype created to use different object from already created object.");
    }

    @Test
    public void prototypeFactoryTest() throws CloneNotSupportedException {

        Secretary secretary = (Secretary) EmployeeFactory.getInstance(EmployeeFactory.EmployeeType.SECRETARY);
        Instructor instructor = (Instructor) EmployeeFactory.getInstance(EmployeeFactory.EmployeeType.INSTRUCTOR);
        Instructor instructor2 = (Instructor) EmployeeFactory.getInstance(EmployeeFactory.EmployeeType.INSTRUCTOR);

        assertEquals(instructor.getClass(), Instructor.class);
        assertNotEquals(secretary.getClass(), instructor.getClass());
        assertNotEquals(instructor, instructor2);

        System.out.println("Prototype pattern used with factory to create already created objects by cloning");

    }

}
