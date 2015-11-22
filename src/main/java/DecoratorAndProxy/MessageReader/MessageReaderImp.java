package DecoratorAndProxy.MessageReader;

import DecoratorAndProxy.FileSimulation;

/**
 *
 * TODO: client should not be able to use this class
 *
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageReaderImp implements MessageReader {

    public String readMessage(String fileName) {
        return FileSimulation.getFile().get(fileName);
    }
}
