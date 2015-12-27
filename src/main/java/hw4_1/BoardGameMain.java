package hw4_1;

/**
 * Created by serhat on 27.12.2015.
 */
public class BoardGameMain {

    public static void main(String [] args) {
        BoardGame boardGame = new BoardGame();
        Command command1 = new MoveToBeginningCommand(boardGame);
        Command command2 = new MoveToJailCommand(boardGame);
        Command command3 = new MoveTwoSquaresForward(boardGame);
        Command command4 = new UndoLastTurn(boardGame);

        int randomNumber = 2; // in the game user gets a random number

        // based on the random number switch, if statement or flyweight pattern can be used to get command.
        // but, I will assume this part written because it does not related with the question
        // So, assume number two is command 2
        command2.executeCommand();

    }

}
