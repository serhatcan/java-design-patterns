package hw4_bonus;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by serhat on 29.12.2015.
 */
public class SpecificTextFileLogger extends AbstractLogger {

    FileOutputStream file;

    public SpecificTextFileLogger(String fileUrl) {
        // get reference to file using fileUrl
    }

    @Override
    protected boolean write(String message) {
        // write to file
        try {
            file.write(Integer.parseInt(message));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
