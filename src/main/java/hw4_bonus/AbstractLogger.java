package hw4_bonus;

/**
 * Created by serhat on 29.12.2015.
 */
public abstract class AbstractLogger {

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(String message) {

        boolean successful = write(message);

        if(successful) {
            System.out.println("Successfully written");
            return;
        }

        if(nextLogger != null) {
            nextLogger.write(message);
        } else {
            System.out.println("No one to handle the request. Log could not written");
        }
    }

    protected abstract boolean write(String message);


}
