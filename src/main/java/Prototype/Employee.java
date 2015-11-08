package Prototype;

/**
 * Created by Serhat CAN on 07.11.2015.
 */

/**
 * Could be abstract and involve some variables
 */
public abstract class Employee implements Cloneable {

    protected String employeeId;
    protected Address address;

    public Employee clone() {
        Employee clone = null;

        try {
            clone = (Employee) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
