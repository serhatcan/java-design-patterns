package DecoratorAndProxy.Decorators;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public abstract class MessageDecorator {

    protected String message;

    public MessageDecorator(String message) {
        this.message = message;
    }

    public abstract String getMessage() throws Exception;

}
