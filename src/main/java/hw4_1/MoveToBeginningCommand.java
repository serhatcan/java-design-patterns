package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public class MoveToBeginningCommand extends Command {

    public MoveToBeginningCommand(BoardGame boardGame) {
        super(boardGame);
    }

    @Override
    public void execute() {
        super.boardGame.setPlace(0); // zero is the beginning
    }
}
