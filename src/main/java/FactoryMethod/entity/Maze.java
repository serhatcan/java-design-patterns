package FactoryMethod.entity;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public abstract class Maze {

    private String name;
    private int complexity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

}
