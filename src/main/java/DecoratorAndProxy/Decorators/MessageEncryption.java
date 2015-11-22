package DecoratorAndProxy.Decorators;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageEncryption extends MessageDecorator {

    /**
     * Key is just for simulation purposes.
     */
    private String key;

    public MessageEncryption(String message, String key) {
        super(message);
        this.key = key;
    }

    @Override
    public String getMessage() {
        StringBuffer sb = new StringBuffer();
        sb.append(key).append("+").append(message);
        String encryptedMessage = sb.toString();
        return encryptedMessage;
    }
}
