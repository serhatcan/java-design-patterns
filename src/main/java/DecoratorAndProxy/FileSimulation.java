package DecoratorAndProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is just holds messages.
 * Created to avoid file operations
 *
 * Created by Serhat CAN on 22.11.2015.
 */
public class FileSimulation {

    private static Map<String, String> file = new HashMap<String, String>();

    private FileSimulation() {

    }

    public static Map<String, String> getFile() {
        return file;
    }

}
