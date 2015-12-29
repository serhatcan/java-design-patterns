package hw4_4;

import java.util.List;

/**
 * Created by serhat on 29.12.2015.
 */
public class ChatMediator {

    private List<Connection> connections;
    private static final int MAX_NUM_OF_CONN = 50;

    public void sendMessage(String id, String message) {
        // do the real send operation by using internal connection objects.
        // for example;

        Connection connection = getConnection();
        // not implementing but through the connection message will be send to relevant users.
    }

    private Connection getConnection() {
        if(connections.size() < MAX_NUM_OF_CONN && !connections.isEmpty()) {
            return connections.get(0);
        } else {
            Connection conn = new Connection();
            connections.add(conn);
            return conn;
        }
    }

    private class Connection {

    }

}
