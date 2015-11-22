package DecoratorAndProxy.MessageWriterProxy;

import DecoratorAndProxy.Decorators.MessageEncryption;
import DecoratorAndProxy.Decorators.MessageValidation;
import DecoratorAndProxy.MessageWriter.MessageWriter;
import DecoratorAndProxy.MessageWriter.MessageWriterImp;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageWriterValidationAndEncryptionProxy extends MessageWriterProxy {

    private String key;
    private String permission;

    public MessageWriterValidationAndEncryptionProxy(String message, String key, String permission) {
        super(message);
        this.key = key;
        this.permission = permission;
    }

    @Override
    public void writeMessage(String fileName){
        String validatedMessage = null;
        try {
            validatedMessage = new MessageValidation(permission, super.message).getMessage();
        } catch (Exception e) {
            System.out.println("Message should not be written because user does not have required permission");
            return;
        }
        String encryptedAndValidatedMessage = new MessageEncryption(validatedMessage, key).getMessage();
        MessageWriter messageWriter = new MessageWriterImp(encryptedAndValidatedMessage);
        messageWriter.writeMessage(fileName);
    }
}
