package AbstractFactory.entity;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public abstract class Building {

    private String name;
    private int floorNumber;

    public Building(String name, int floorNumber) {
        this.name = name;
        this.floorNumber = floorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
