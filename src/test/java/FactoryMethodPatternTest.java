import FactoryMethod.entity.Maze;
import FactoryMethod.factory.MazeCreater;
import FactoryMethod.factory.MetuMazeCreater;
import FactoryMethod.factory.RegularMazeCreater;
import org.junit.Test;

/**
 * Created by Serhat CAN on 07.11.2015.
 */

public class FactoryMethodPatternTest {

    @Test
    public void metuMazeCreaterTest() {

        MazeCreater mazeCreater = new MetuMazeCreater();
        Maze metuMaze = mazeCreater.makeMaze();
        System.out.println(metuMaze.getName());

        MazeCreater mazeCreater1 = new RegularMazeCreater();
        Maze regularMaze = mazeCreater1.makeMaze();
        System.out.println(regularMaze.getName());


    }

}
