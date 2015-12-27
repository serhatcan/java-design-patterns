package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public class UndoLastTurn extends Command{

    private int lastPlace;

    public UndoLastTurn(BoardGame boardGame) {
        super(boardGame);
    }

    @Override
    public void execute() {
        super.boardGame.setPlace(super.lastPlace);
    }
}
