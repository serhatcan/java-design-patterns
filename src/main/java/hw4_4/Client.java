package hw4_4;

/**
 * Created by serhat on 29.12.2015.
 */
public class Client {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator(); // only one instance
        User user = new User("007", "Serhat", mediator);
        user.sendMessage("Naber?"); // message send through mediator internally.

    }
}
