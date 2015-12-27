package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public class MoveTwoSquaresForward extends Command {

    public MoveTwoSquaresForward(BoardGame boardGame) {
        super(boardGame);
    }

    @Override
    protected void execute() {
        super.boardGame.setPlace(lastPlace + 2);
    }
}
