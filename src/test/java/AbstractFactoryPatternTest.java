import AbstractFactory.factory.CeitDepartmentFactory;
import AbstractFactory.factory.Department;
import org.junit.Test;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class AbstractFactoryPatternTest {

    /**
     * If you want a different kind of university like AmazingUniversity,
     * just create another class implementing UniversityFactory
     */
    @Test
    public void niceUniversityTest() {
        Department niceDepartment = new CeitDepartmentFactory();
        AbstractFactory.entity.Department department = new AbstractFactory.entity.Department("CEIT", niceDepartment);
        department.displayDepartment();
    }
}
