package AbstractFactory.entity;

import java.util.List;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class Department {

    private String name;
    private List<Teacher> teachers;
    private List<Building> buildings;

    public Department(String name, AbstractFactory.factory.Department factory) {
        this.name = name;
        this.teachers = factory.createTeachers();
        this.buildings = factory.createBuildings();
    }

    public void displayDepartment() {
        System.out.println("University Name: " + name);
        for (Teacher teacher : teachers) {
            System.out.println("Teacher name:" + teacher.getName() + " with experience:" + teacher.getExperience());
        }

        for (Building building : buildings) {
            System.out.println("Building name:" + building.getName() + " has " + building.getFloorNumber() + " floor(s).");
        }
    }

    public void anotherMethod() {
        System.out.println("Another method.");
    }

}
