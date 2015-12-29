package hw4_4;

/**
 * Created by serhat on 29.12.2015.
 */
public class User {

    private String id;
    private String name;
    private ChatMediator mediator;

    public User(String id, String name, ChatMediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(id, message);
    }
}
