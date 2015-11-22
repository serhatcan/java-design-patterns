import DecoratorAndProxy.MessageReader.MessageReader;
import DecoratorAndProxy.MessageReaderProxy.MessageReaderValidationProxy;
import DecoratorAndProxy.MessageWriter.MessageWriter;
import DecoratorAndProxy.MessageWriter.MessageWriterImp;
import DecoratorAndProxy.MessageWriterProxy.MessageWriterValidationAndEncryptionProxy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Serhat CAN on 22.11.2015.
 *
 * We are developing a messaging application. The part you are responsible of is the string
 * the messages (of type String) coming from different sources into text files. The team designed
 * a MessageWriter interface that contains a writeMessage(String FileName) method responsible of
 * writing its message into the file with the given name. You have also a MessageReader interface
 * with readMessage(String FileName) method that reads from the text file with the given name and
 * returns the message string. Your requirements are :
 * For certain messages, we need to validate the user before reading and writing the file.
 * For some messages, we want them to be saved encrypted so no one would be able to read it from the file.
 * For some messages, we need both of these functionalities.
 *
 * Currently, we first validate and then encript the message but this order may change depending
 * on user customization. The requirements are not stable yet. The customer may request more features
 * like some messages should be digitally signed, larger messages should be compressed with or without
 * encryption as required, and so on.
 *
 * Suggest a flexible solution that handles the 3 requirements above and lend itself for extension.
 * Give a structural pattern name and the reason why you have chosen this pattern. Give a UML diagram
 * showing your solution. Give partial implementation showing the pattern usage and the client usage.

 */
public class DecoratorAndProxyPatternTest {

    @Test
    public void hw3_2_test_validation_and_encryption() {
        System.out.println("\n---hw3_2 Test1 Begins---");

        String fileName = "Serhat";
        String permission = "admin";
        String message = "My name is Serhat";
        String key = "secret";
        MessageWriter messageWriter = new MessageWriterValidationAndEncryptionProxy(message, key, permission);
        messageWriter.writeMessage(fileName);

        MessageReader messageReader = new MessageReaderValidationProxy(permission);
        String readMessage = messageReader.readMessage(fileName);

        System.out.println("Read message should be: " + readMessage);

        assertEquals(readMessage, "secret+My name is Serhat");

        System.out.println("---hw3_2 Test1 Ends---\n");
    }

    @Test
    public void hw3_2_test_validation() {
        System.out.println("\n---hw3_2 Test2 Begins---");
        String fileName = "Serhat";
        String userPermission = "user";
        String adminPermission = "admin";
        String message = "My name is Serhat";

        MessageWriter messageWriter = new MessageWriterImp(message);
        messageWriter.writeMessage(fileName);

        MessageReader messageReaderForAdmin = new MessageReaderValidationProxy(adminPermission);
        String readMessage2 = messageReaderForAdmin.readMessage(fileName);
        System.out.println("Read message 2, should be successfully read: " + readMessage2);

        System.out.println("Read message 1, should not be read. It should throw an exception.");
        MessageReader messageReaderForUser = new MessageReaderValidationProxy(userPermission);
        String readMessage1 = messageReaderForUser.readMessage(fileName);

        assertEquals(readMessage2, message);
        assertNull(readMessage1);

        System.out.println("---hw3_2 Test2 Ends---\n");
    }
}
