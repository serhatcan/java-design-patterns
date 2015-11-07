package FactoryMethod.factory;

import FactoryMethod.entity.Maze;
import FactoryMethod.entity.RegularMaze;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class RegularMazeCreater extends MazeCreater{

    @Override
    public Maze makeMaze() {
        RegularMaze regularMaze = new RegularMaze();
        regularMaze.setComplexity(3);
        regularMaze.setName("RegularMaze");
        return regularMaze;
    }
}
