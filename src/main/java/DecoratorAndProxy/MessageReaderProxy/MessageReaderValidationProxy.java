package DecoratorAndProxy.MessageReaderProxy;

import DecoratorAndProxy.Decorators.MessageValidation;
import DecoratorAndProxy.MessageReader.MessageReader;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageReaderValidationProxy extends MessageReaderProxy {

    private String permission;

    public MessageReaderValidationProxy(String permission) {
        this.permission = permission;
    }

    @Override
    public String readMessage(String fileName) {
        MessageReader messageReader = super.messageReader;
        String message = messageReader.readMessage(fileName);
        String validatedMessage = null;
        try {
            validatedMessage = new MessageValidation(permission, message).getMessage();
        } catch (Exception e) {
            System.out.println("Validation read exception message: " + e.getMessage());
            return null;
        }
        return validatedMessage;
    }
}
