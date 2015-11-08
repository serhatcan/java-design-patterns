package Prototype;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class Secretary extends Employee{

    private String name;

    public Secretary(String employeeId, String name, String street, String no) {
        this.employeeId = employeeId;
        this.name = name;
        super.address = new Address(street, no);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
