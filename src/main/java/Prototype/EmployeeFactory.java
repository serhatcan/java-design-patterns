package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This factory and Employee interface may not need for prototype.
 * But, this is a common usage of this pattern
 * <p>
 * Created by Serhat CAN on 07.11.2015.
 */
public class EmployeeFactory {

    public static class EmployeeType {
        public static final String INSTRUCTOR = "instructor";
        public static final String SECRETARY = "secretary";
    }

    private static Map<String, Employee> employeeMap = new HashMap<String, Employee>();

    static {
        employeeMap.put(EmployeeType.INSTRUCTOR, new Instructor("1", "Instructor Name", "Instructor Street", "12"));
        employeeMap.put(EmployeeType.SECRETARY, new Secretary("3", "Secretary Name", "Secratary Street", "21"));
    }

    public static Employee getInstance(final String key) throws CloneNotSupportedException {
        return employeeMap.get(key).clone();
    }

}
