package DecoratorAndProxy.MessageReaderProxy;

import DecoratorAndProxy.MessageReader.MessageReader;
import DecoratorAndProxy.MessageReader.MessageReaderImp;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public abstract class MessageReaderProxy implements MessageReader{

    protected MessageReader messageReader = new MessageReaderImp();

    public MessageReaderProxy() {

    }

    public abstract String readMessage(String fileName);
}
