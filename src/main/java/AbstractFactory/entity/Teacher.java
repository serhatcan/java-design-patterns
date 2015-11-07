package AbstractFactory.entity;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public abstract class Teacher {

    private String name;
    private int experience;

    public Teacher(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
