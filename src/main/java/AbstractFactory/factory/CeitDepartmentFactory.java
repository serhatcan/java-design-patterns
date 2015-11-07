package AbstractFactory.factory;

import AbstractFactory.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class CeitDepartmentFactory implements Department {

    public List<Building> createBuildings() {
        List<Building> buildings = new ArrayList<Building>();
        buildings.add(new SmallBuilding("Ceit Small Buildign 1", 2));
        buildings.add(new RegularBuilding("Regular Building 2", 4));
        buildings.add(new SmallBuilding("Ceit Small Building 2", 1));
        return buildings;
    }

    public List<Teacher> createTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Professor("Kursat Cagiltay", 15));
        teachers.add(new DocDr("Omer Delialioglu", 10));
        teachers.add(new Professor("Soner Yildirim", 16));
        return teachers;
    }
}
