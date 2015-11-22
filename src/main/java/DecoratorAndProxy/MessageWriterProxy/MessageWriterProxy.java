package DecoratorAndProxy.MessageWriterProxy;

import DecoratorAndProxy.MessageWriter.MessageWriter;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public abstract class MessageWriterProxy implements MessageWriter {

    protected String message;

    public MessageWriterProxy(String message) {
        this.message = message;
    }

    public abstract void writeMessage(String fileName);
}
