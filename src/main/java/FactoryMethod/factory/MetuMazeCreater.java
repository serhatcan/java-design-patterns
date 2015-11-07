package FactoryMethod.factory;

import FactoryMethod.entity.Maze;
import FactoryMethod.entity.MetuMaze;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class MetuMazeCreater extends MazeCreater{

    @Override
    public Maze makeMaze() {
        MetuMaze metuMaze = new MetuMaze();
        metuMaze.setComplexity(5);
        metuMaze.setName("MetuMaze");
        metuMaze.setMetuMazeSpecialVariable("Metu Maze's Special Variable");
        return metuMaze;
    }
}
