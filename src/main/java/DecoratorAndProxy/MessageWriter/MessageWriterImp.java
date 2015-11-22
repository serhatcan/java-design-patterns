package DecoratorAndProxy.MessageWriter;

import DecoratorAndProxy.FileSimulation;

import java.util.Map;

/**
 *
 * TODO: client should not be able to use this class
 *
 * Created by Serhat CAN on 22.11.2015.
 *
 */
public class MessageWriterImp implements MessageWriter {

    private String message;

    public MessageWriterImp(String message) {
        this.message = message;
    }

    public void writeMessage(String fileName) {
        Map<String, String> file = FileSimulation.getFile();
        file.put(fileName, this.message);
    }
}
