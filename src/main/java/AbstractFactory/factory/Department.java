package AbstractFactory.factory;

import AbstractFactory.entity.Building;
import AbstractFactory.entity.Teacher;

import java.util.List;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public interface Department {

    List<Building> createBuildings();

    List<Teacher> createTeachers();

}
