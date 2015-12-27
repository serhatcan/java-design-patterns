package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public class MoveToJailCommand  extends Command{

    public MoveToJailCommand(BoardGame boardGame) {
        super(boardGame);
    }

    @Override
    public void execute() {
        super.boardGame.setPlace(-1); // -1 is jail
    }
}
