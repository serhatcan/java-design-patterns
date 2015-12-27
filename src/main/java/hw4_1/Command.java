package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public abstract class Command {

    protected BoardGame boardGame;

    protected int lastPlace;

    public Command(BoardGame boardGame) {
        this.boardGame = boardGame;
    }

    // created not to give lastPlace save operation responsibility to subclasses
    public void executeCommand() {
        lastPlace = boardGame.getPlace();
        execute();
    }

    protected abstract void execute();

}
