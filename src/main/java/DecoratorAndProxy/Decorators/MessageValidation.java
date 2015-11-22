package DecoratorAndProxy.Decorators;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MessageValidation extends MessageDecorator {

    /**
     * Permission is just created for testing purposes. It should expect a User object in real implementation
     */
    private String permission;

    public MessageValidation(String permission, String message) {
        super(message);
        this.permission = permission;
    }

    @Override
    public String getMessage() throws Exception {

        String message = super.message;
        if (permission.equalsIgnoreCase("admin")) {
            return message;
        } else {
            // TODO: might throw unauthorized exception etc...
            throw new Exception("Unauthorized");
        }
    }
}
