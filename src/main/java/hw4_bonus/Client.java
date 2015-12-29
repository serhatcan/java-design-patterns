package hw4_bonus;

/**
 * Created by serhat on 29.12.2015.
 */
public class Client {

    /**
     * Chain of responsibility example
     */
    public static void main(String[] args) {
        // init chains
        AbstractLogger logger = new SqlDatabaseLogger();
        AbstractLogger logger2 = new EventLogFileLogger();
        AbstractLogger logger3 = new SpecificTextFileLogger("/logfile/log");
        logger.setNextLogger(logger2);
        logger2.setNextLogger(logger3);

        // real action
        logger.logMessage("This will be logged");

    }
}
