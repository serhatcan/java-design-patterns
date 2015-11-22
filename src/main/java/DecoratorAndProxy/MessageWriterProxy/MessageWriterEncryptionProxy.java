package DecoratorAndProxy.MessageWriterProxy;

import DecoratorAndProxy.Decorators.MessageEncryption;
import DecoratorAndProxy.MessageWriter.MessageWriter;
import DecoratorAndProxy.MessageWriter.MessageWriterImp;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageWriterEncryptionProxy extends MessageWriterProxy {

    private String key;

    public MessageWriterEncryptionProxy(String key, String message) {
        super(message);
        this.key = key;
    }

    @Override
    public void writeMessage(String fileName) {
        String message = new MessageEncryption(key, super.message).getMessage();
        MessageWriter messageWriter = new MessageWriterImp(message);
        messageWriter.writeMessage(fileName);
    }
}
